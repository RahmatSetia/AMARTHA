package com.alterra.securityJWT.spring_security.service.impl;

import com.alterra.securityJWT.spring_security.model.User;
import com.alterra.securityJWT.spring_security.repository.UserRepository;
import com.alterra.securityJWT.spring_security.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.getDistinctTopByUsername(username);
        if (user == null)
            throw new UsernameNotFoundException("Username not found");
        return user;
    }

    @Override
    public List<User> getUser() {
        return userRepository.findAll();
    }
}
