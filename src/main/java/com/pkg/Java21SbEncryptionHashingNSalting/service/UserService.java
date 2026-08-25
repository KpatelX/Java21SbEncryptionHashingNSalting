package com.pkg.Java21SbEncryptionHashingNSalting.service;

import com.pkg.Java21SbEncryptionHashingNSalting.dto.UserRegisterDTO;
import com.pkg.Java21SbEncryptionHashingNSalting.model.Users;
import com.pkg.Java21SbEncryptionHashingNSalting.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;


/**
 * The type User service.
 */
@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    private final PasswordEncoder passwordEncoder;

    private final EncryptionService encryptionService;

    /**
     * User register users.
     *
     * @param request the request
     * @return the users
     */
    public ResponseEntity<?> userRegister(UserRegisterDTO request) {
        if (userRepository.existsByEmail(request.getEmail())) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Duplicate Email Found..!");
        }

        Users user = Users.builder().username(request.getUsername()).email(request.getEmail())
                // BCrypt Hashing
                .password(passwordEncoder.encode(request.getPassword()))
                // AES Encryption
                .encryptedPhone(encryptionService.encrypt(request.getPhone()))
                .encryptedAddress(encryptionService.encrypt(request.getAddress()))
                .role("USER").enabled(Boolean.TRUE).failedAttempts(0).accountLocked(Boolean.FALSE)
                .createdAt(LocalDateTime.now()).build();
        return new ResponseEntity<>(userRepository.save(user), HttpStatus.OK);
    }

    public ResponseEntity<?> getUser(String email) {
        try {
            Optional<Users> existUser = userRepository.findByEmail(email);
            Users responseUser = null;
            if (existUser.isPresent()) {
                responseUser = existUser.get();
                responseUser.setEncryptedPhone(encryptionService.decrypt(responseUser.getEncryptedPhone()));
                responseUser.setEncryptedAddress(encryptionService.decrypt(responseUser.getEncryptedAddress()));
                return new ResponseEntity<>(responseUser, HttpStatus.OK);
            } else {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No user found!");
            }
        } catch (Exception exception) {
            return ResponseEntity.status(HttpStatus.FORBIDDEN).body(exception.getMessage());
        }
    }
}