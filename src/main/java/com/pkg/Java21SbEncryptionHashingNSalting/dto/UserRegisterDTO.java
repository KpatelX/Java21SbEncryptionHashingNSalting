package com.pkg.Java21SbEncryptionHashingNSalting.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

/**
 * The type User register dto.
 */
@Data
public class UserRegisterDTO {

    @NotBlank
    @JsonProperty("user_name")
    private String username;

    @Email
    @JsonProperty("email")
    private String email;

    @NotBlank
    @JsonProperty("password")
    private String password;

    @JsonProperty("phone")
    private String phone;

    @JsonProperty("address")
    private String address;
}
