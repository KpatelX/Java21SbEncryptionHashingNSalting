package com.pkg.Java21SbEncryptionHashingNSalting.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDateTime;

/**
 * The type Users.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "users")
public class Users {

    @Id
    @Field("_id")
    @JsonProperty("_id")
    private String id;

    @Field("user_name")
    @JsonProperty("user_name")
    private String username;

    @Field("email")
    @JsonProperty("email")
    private String email;

    // BCrypt Hash
    @Field("password")
    @JsonProperty("password")
    private String password;

    // AES Encrypted
    @Field("encrypted_Phone")
    @JsonProperty("encrypted_Phone")
    private String encryptedPhone;

    @Field("encrypted_address")
    @JsonProperty("encrypted_address")
    private String encryptedAddress;

    @Field("role")
    @JsonProperty("role")
    private String role;

    @Field("enabled")
    @JsonProperty("enabled")
    private boolean enabled;

    @Field("failed_attempts")
    @JsonProperty("failed_attempts")
    private int failedAttempts;

    @Field("account_locked")
    @JsonProperty("account_locked")
    private boolean accountLocked;

    @Field("created_at")
    @JsonProperty("created_at")
    private LocalDateTime createdAt;
}
