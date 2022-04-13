package com.alterra.securityJWT.spring_security.controller;

import com.alterra.securityJWT.spring_security.model.User;
import com.alterra.securityJWT.spring_security.payload.UsernamePassword;
import com.alterra.securityJWT.spring_security.repository.UserRepository;
import com.alterra.securityJWT.spring_security.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    private UserRepository userRepository;

    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody UsernamePassword userReq){
        authService.register(userReq);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/token")
    public ResponseEntity<?> generateToken(@RequestBody UsernamePassword userReq) throws Exception {
        return ResponseEntity.ok(authService.generateToken(userReq));
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody UsernamePassword usernamePassword){
        return ResponseEntity.ok(authService.login(usernamePassword));
    }

    @GetMapping("/info")
    public ResponseEntity<?> info(Principal principal){
        if (userRepository == null){
            return ResponseEntity.status(HttpStatus.FORBIDDEN).build();
        }
        return ResponseEntity.ok(principal.getName());
    }
}
