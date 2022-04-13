package com.alterra.securityJWT.spring_security.service.impl;

import com.alterra.securityJWT.spring_security.model.User;
import com.alterra.securityJWT.spring_security.payload.TokenResponse;
import com.alterra.securityJWT.spring_security.payload.UsernamePassword;
import com.alterra.securityJWT.spring_security.repository.UserRepository;
import com.alterra.securityJWT.spring_security.security.JwtProvider;
import com.alterra.securityJWT.spring_security.service.AuthService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Log4j2
@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {

    private final UserRepository userRepository;
    private final AuthenticationManager authenticationManager;
    private final JwtProvider jwtProvider;
    private final PasswordEncoder passwordEncoder;

    @Override
    public List<User> info(UsernamePassword userReq) {
            return userRepository.findAll();
    }

    @Override
    public User register(UsernamePassword userReq) {
        User user = new User();
        user.setUsername(userReq.getUsername());
        user.setPassword(passwordEncoder.encode(userReq.getPassword()));
        user.setNo_hp(userReq.getNo_hp());
        user.setRole(userReq.getRole());
        return userRepository.save(user);
    }

    @Override
    public TokenResponse generateToken(UsernamePassword userReq) throws Exception {
        try {
            Authentication authentication = authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(
                            userReq.getUsername(),
                            userReq.getPassword()

                    )
            );
            SecurityContextHolder.getContext().setAuthentication(authentication);
            String jwt = jwtProvider.generateToken(authentication);
//            TokenResponse tokenResponse = new TokenResponse(jwt);
//            tokenResponse.setToken(jwt);
            return new TokenResponse(jwt);
        } catch (BadCredentialsException e) {
            log.error("Bad Credentials", e);
            throw new RuntimeException(e.getMessage(), e);
        }catch (Exception ex){
            log.error(ex.getMessage(), ex);
            throw new RuntimeException(ex.getMessage(), ex);
        }
    }

    @Override
    public TokenResponse login(UsernamePassword userReq) {
        //ketika user.getpass = pass repo dan get phone = dengan phone repo return token
        if ((userReq.getUsername() == userReq.getUsername()) && (userReq.getPassword() == userReq.getPassword())) {
            try {
                Authentication authentication = authenticationManager.authenticate(
                        new UsernamePasswordAuthenticationToken(
                                userReq.getUsername(),
                                userReq.getPassword()
                        )
                );
                SecurityContextHolder.getContext().setAuthentication(authentication);
                String jwt = jwtProvider.generateToken(authentication);
//            TokenResponse tokenResponse = new TokenResponse(jwt);
//            tokenResponse.setToken(jwt);
                return new TokenResponse(jwt);
            } catch (BadCredentialsException e) {
                log.error("Bad Credentials", e);
                throw new RuntimeException(e.getMessage(), e);
            }catch (Exception ex){
                log.error(ex.getMessage(), ex);
                throw new RuntimeException(ex.getMessage(), ex);
            }
        }
        else
            return new TokenResponse("salah input");
    }
}
