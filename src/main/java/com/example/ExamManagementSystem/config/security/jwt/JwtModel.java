package com.example.ExamManagementSystem.config.security.jwt;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class JwtModel {
    private Long userId;
    private String email;
    private String username;
    private long tokenExpiration;
    private Set<ERole> roles;
    private String jwtToken;

    public JwtModel(Long userId, String username, String email, long tokenExpiration, Set<ERole> roles) {
        this.userId = userId;
        this.email = email;
        this.username = username;
        this.tokenExpiration = tokenExpiration;
        this.roles = roles;
    }
}
