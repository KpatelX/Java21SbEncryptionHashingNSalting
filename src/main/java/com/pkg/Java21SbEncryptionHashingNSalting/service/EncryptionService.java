package com.pkg.Java21SbEncryptionHashingNSalting.service;

import com.pkg.Java21SbEncryptionHashingNSalting.ServiceConstants;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;

@Service
public class EncryptionService {

    @Value(ServiceConstants.SECRET_KEY)
    private String secretKey;

    @Value(ServiceConstants.ENC_DEC_ALGO)
    private String encDecAlgo;

    public String encrypt(String value) {
        try {
            SecretKeySpec key = new SecretKeySpec(secretKey.getBytes(), encDecAlgo);
            Cipher cipher = Cipher.getInstance(encDecAlgo);
            cipher.init(Cipher.ENCRYPT_MODE, key);
            return Base64.getEncoder().encodeToString(cipher.doFinal(value.getBytes()));
        } catch (Exception exception) {
            throw new RuntimeException(exception);
        }
    }

    public String decrypt(String value) {
        try {
            SecretKeySpec key = new SecretKeySpec(secretKey.getBytes(), encDecAlgo);
            Cipher cipher = Cipher.getInstance(encDecAlgo);
            cipher.init(Cipher.DECRYPT_MODE, key);
            return new String(cipher.doFinal(Base64.getDecoder().decode(value)));
        } catch (Exception exception) {
            throw new RuntimeException(exception);
        }
    }
}