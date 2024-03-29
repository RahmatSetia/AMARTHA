package com.alterra.securityJWT.spring_security.repository;

import com.alterra.securityJWT.spring_security.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User getDistinctTopByUsername(String username);
    User getNoHp(String no_hp);
}
