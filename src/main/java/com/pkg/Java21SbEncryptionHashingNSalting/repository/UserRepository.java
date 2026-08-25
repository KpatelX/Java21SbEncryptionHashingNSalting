package com.pkg.Java21SbEncryptionHashingNSalting.repository;

import com.pkg.Java21SbEncryptionHashingNSalting.model.Users;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

/**
 * The interface User repository.
 */
public interface UserRepository extends MongoRepository<Users, String> {

    /**
     * Find by email optional.
     *
     * @param email the email
     * @return the optional
     */
    Optional<Users> findByEmail(String email);

    /**
     * Exists by email boolean.
     *
     * @param email the email
     * @return the boolean
     */
    boolean existsByEmail(String email);
}