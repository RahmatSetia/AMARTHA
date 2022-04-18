package com.alterra.spring1.service;

import com.alterra.spring1.entity.Products;
import com.alterra.spring1.payload.ProductsPayload;

import java.util.List;

public interface ProductService {
    List<Products> getAllProducts();
    Products getById(Long id);
    Products createProducts(ProductsPayload payload);
    Products editPoducts(Long id, ProductsPayload payload);
    Products deleteProducts(Long id);
}
