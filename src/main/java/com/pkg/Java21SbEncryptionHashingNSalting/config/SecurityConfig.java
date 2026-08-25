package com.pkg.Java21SbEncryptionHashingNSalting.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

/**
 * The type Security config.
 */
@Configuration
public class SecurityConfig {

    private final PasswordEncoder passwordEncoder;
    /**
     * Instantiates a new Security config.
     *
     * @param passwordEncoder the password encoder
     */
    public SecurityConfig(PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
    }
    /**
     * Security filter chain security filter chain.
     *
     * @param http the http
     * @return the security filter chain
     * @throws Exception the exception
     */
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.csrf(csrf -> csrf.disable())   // Disable CSRF for REST APIs
                .authorizeHttpRequests(auth -> auth  // Authorization Rules
                        .requestMatchers("/api/auth/**", "/swagger-ui/**", "/swagger-ui.html", "/v3/api-docs/**")// Public APIs
                        .permitAll()
                        .requestMatchers("/api/admin/**")   // Admin APIs
                        .hasRole("ADMIN")
                        .anyRequest()  // Any other endpoint requires login
                        .authenticated())
                .formLogin(Customizer.withDefaults()) // Session Authentication
                .logout(logout -> logout // Logout Support
                        .logoutUrl("/logout")
                        .logoutSuccessUrl("/login?logout")
                        .invalidateHttpSession(true)
                        .deleteCookies("JSESSIONID"));
        return http.build();
    }
}
