package com.pkg.Java21SbEncryptionHashingNSalting.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * The type User login.
 */
@Data
public class UserLoginDTO {

    @JsonProperty("email")
    private String email;

    @JsonProperty("password")
    private String password;
}