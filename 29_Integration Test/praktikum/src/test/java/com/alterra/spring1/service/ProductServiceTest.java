package com.alterra.spring1.service;

import com.alterra.spring1.entity.Products;
import com.alterra.spring1.payload.ProductsPayload;
import com.alterra.spring1.repository.ProductRepository;
import com.alterra.spring1.service.impl.ProductsServiceImpl;
import org.jeasy.random.EasyRandom;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

public class ProductServiceTest {

    private final EasyRandom easyRandom = new EasyRandom();
    private Long id;

    @InjectMocks
    ProductsServiceImpl productsService;

    @Mock
    ProductRepository productRepository;

    @Before
    public void setUp(){
        MockitoAnnotations.initMocks(this);
        id = easyRandom.nextLong();
    }

    @Test
    public void getAllProduct_WillThrowException(){
        String error = "Tidak ada produk";
        when(productRepository.findAll()).thenAnswer(x ->{
            throw new Exception(error);
        });
        Exception exception = assertThrows(Exception.class, () ->{
            productsService.getAllProducts();
        });
        assertTrue(exception.getMessage().equals(error));
    }

    @Test
    public void getProductById_WillReturnProduct(){
        //proses given
        Products products = easyRandom.nextObject(Products.class);
        when(productRepository.findById(id)).thenReturn(Optional.ofNullable(products));
        Products result =  productsService.getById(id);
        assertEquals(products, result); //membandingkan
    }

    @Test
    public void createProduct_WillReturnProduct(){
        ProductsPayload productsPayload = easyRandom.nextObject(ProductsPayload.class);
        Products products = new Products();
        products.setName(productsPayload.getName());
        products.setDescription(productsPayload.getDescription());
        products.setPrice(productsPayload.getPrice());
        products.setStock(productsPayload.getStock());
        //atau
        //BeanUtils.copyProperties(productsPayload, products);

        when(productRepository.save(products)).thenReturn(products);
        Products result = productsService.createProducts(productsPayload);
        assertEquals(products, result);
    }

    @Test
    public void updateProduct_WillReturnProductUpdated(){
        //get by id
        //set product id
        //

    }

    @Test
    public void givenIdTODeleteThenShouldDeleteTheProduct(){

    }
}
