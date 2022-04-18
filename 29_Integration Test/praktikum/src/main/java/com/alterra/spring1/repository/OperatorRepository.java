package com.alterra.spring1.repository;

import com.alterra.spring1.entity.Operators;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OperatorRepository extends JpaRepository<Operators, Long> {
}
