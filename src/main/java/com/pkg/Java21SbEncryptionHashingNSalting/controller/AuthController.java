package com.pkg.Java21SbEncryptionHashingNSalting.controller;

import com.pkg.Java21SbEncryptionHashingNSalting.dto.UserLoginDTO;
import com.pkg.Java21SbEncryptionHashingNSalting.dto.UserRegisterDTO;
import com.pkg.Java21SbEncryptionHashingNSalting.model.Users;
import com.pkg.Java21SbEncryptionHashingNSalting.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * The type Auth controller.
 */
@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private final UserService userService;

    /**
     * Instantiates a new Auth controller.
     *
     * @param userService the user service
     */
    public AuthController(UserService userService) {
        this.userService = userService;
    }

    /**
     * Register users.
     *
     * @param request the request
     * @return the users
     */
    @PostMapping("/register")
    public ResponseEntity<?> userRegister(@Valid @RequestBody UserRegisterDTO request) {
        return userService.userRegister(request);
    }

    @PostMapping("/getUser")
    public ResponseEntity<?> getUser(@Valid @RequestBody UserLoginDTO request) {
        return userService.getUser(request.getEmail());
    }
}