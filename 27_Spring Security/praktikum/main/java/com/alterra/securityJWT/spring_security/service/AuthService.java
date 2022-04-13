package com.alterra.securityJWT.spring_security.service;

import com.alterra.securityJWT.spring_security.model.User;
import com.alterra.securityJWT.spring_security.payload.TokenResponse;
import com.alterra.securityJWT.spring_security.payload.UsernamePassword;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AuthService {
    List<User> info(UsernamePassword usernameReq);
    User register(UsernamePassword userReq);
    TokenResponse generateToken(UsernamePassword userReq) throws Exception;
    TokenResponse login(UsernamePassword usernamePassword);
//    TokenResponse info2(UsernamePassword usernamePassword);
}
