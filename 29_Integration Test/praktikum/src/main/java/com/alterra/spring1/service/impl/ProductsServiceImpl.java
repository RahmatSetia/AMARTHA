package com.alterra.spring1.service.impl;

import com.alterra.spring1.entity.Products;
import com.alterra.spring1.payload.ProductsPayload;
import com.alterra.spring1.repository.ProductRepository;
import com.alterra.spring1.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductsServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    @Override
    public List<Products> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Products getById(@PathVariable Long id) {
        Products products = new Products();
        products = productRepository.findById(id).orElse(null);
        return products;
    }

    @Override
    public Products createProducts(ProductsPayload payload) {
        Products products = new Products();
        products.setName(payload.getName());
        products.setDescription(payload.getDescription());
        products.setStock(payload.getStock());
        products.setPrice(payload.getPrice());
        return productRepository.save(products);
    }

    @Override
    public Products editPoducts(@PathVariable Long id,ProductsPayload payload) {
        Optional<Products> getById = productRepository.findById(id);
        getById.ifPresent(sent -> {
            sent.setName(payload.getName());
            sent.setDescription(payload.getDescription());
            sent.setStock(payload.getStock());
            sent.setPrice(payload.getPrice());
            productRepository.save(sent);
        });
        return productRepository.getById(id);
    }

    @Override
    public Products deleteProducts(@PathVariable Long id) {
        Optional<Products> productsByid = productRepository.findById(id);
        productsByid.ifPresent(delete -> {
            productRepository.delete(delete);
        });
        return productRepository.getById(id);
    }
}
