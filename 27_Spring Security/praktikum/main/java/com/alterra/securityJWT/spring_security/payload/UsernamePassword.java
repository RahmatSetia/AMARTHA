package com.alterra.securityJWT.spring_security.payload;

import lombok.Data;

@Data
public class UsernamePassword {
    private String username;
    private String password;
    private Long no_hp;
    private String role;
}
