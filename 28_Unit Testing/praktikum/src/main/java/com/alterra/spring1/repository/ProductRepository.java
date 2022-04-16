package com.alterra.spring1.repository;

import com.alterra.spring1.entity.Products;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Products,Long> {
}
