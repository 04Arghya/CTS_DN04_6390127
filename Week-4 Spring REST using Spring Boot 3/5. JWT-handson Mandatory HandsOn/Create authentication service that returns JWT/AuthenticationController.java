package com.cognizant.springlearn.controller;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Key;
import java.util.Date;

@RestController
@RequestMapping("/authenticate")
public class AuthenticationController {

    // Use a strong 256-bit key (at least 32 bytes)
    private static final String SECRET = "ThisIsASecretKeyForJWTTokenGeneration123!";
    private static final Key key = Keys.hmacShaKeyFor(SECRET.getBytes());

    @GetMapping
    public String authenticate() {
        String jwt = Jwts.builder()
                .setSubject("user")
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + 1000 * 60 * 60)) // 1 hour
                .signWith(key, SignatureAlgorithm.HS256)
                .compact();

        return jwt;
    }
}
