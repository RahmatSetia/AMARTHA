package com.alterra.securityJWT.spring_security.service;

import com.alterra.securityJWT.spring_security.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService extends UserDetailsService {
    List<User> getUser();
}
