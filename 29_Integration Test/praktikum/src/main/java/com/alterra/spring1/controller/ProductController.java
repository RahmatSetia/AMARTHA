package com.alterra.spring1.controller;

import com.alterra.spring1.entity.Products;
import com.alterra.spring1.payload.ProductsPayload;
import com.alterra.spring1.repository.ProductRepository;
import com.alterra.spring1.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;

    @Autowired
    private ProductRepository productRepository;

    @GetMapping
    public ResponseEntity<MbaseResponse<List<Products>>> getAllProducts(){
        MbaseResponse mbaseResponse = new MbaseResponse();
        mbaseResponse.setSuccess(true);
        mbaseResponse.setMessage("Berhasil");
        mbaseResponse.setData(productService.getAllProducts());
        return new ResponseEntity<>(mbaseResponse, HttpStatus.OK);
    }

    @GetMapping("{id}")
    public ResponseEntity<MbaseResponse<Products>> getProductById(@PathVariable Long id){
        MbaseResponse mbaseResponse = new MbaseResponse();
        mbaseResponse.setSuccess(true);
        mbaseResponse.setMessage("Berhasil");
        mbaseResponse.setData(productService.getById(id));
        return new  ResponseEntity<>(mbaseResponse, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<MbaseResponse<List<Products>>> createProduct(@RequestBody ProductsPayload payload){
        MbaseResponse mbaseResponse = new MbaseResponse();
        mbaseResponse.setSuccess(true);
        mbaseResponse.setMessage("Berhasil");
        mbaseResponse.setData(productService.createProducts(payload));
        return new ResponseEntity<>(mbaseResponse, HttpStatus.CREATED);
    }

    @PutMapping("{id}")
    public ResponseEntity<MbaseResponse<List<Optional<Products>>>> updateProduct(@PathVariable Long id, @RequestBody ProductsPayload payload){
        MbaseResponse mbaseResponse = new MbaseResponse();
        mbaseResponse.setSuccess(true);
        mbaseResponse.setMessage("Berhasil");
        productService.editPoducts(id, payload);
        mbaseResponse.setData(productRepository.findAll());
        return new ResponseEntity<>(mbaseResponse, HttpStatus.CREATED);
    }
    @DeleteMapping("{id}")
    public ResponseEntity<MbaseResponse<List<Optional<Products>>>> deleteProduct(@PathVariable Long id){
        MbaseResponse mbaseResponse = new MbaseResponse();
        mbaseResponse.setSuccess(true);
        mbaseResponse.setMessage("Berhasil");
        productService.deleteProducts(id);
        mbaseResponse.setData(productRepository.findAll());
        return new  ResponseEntity<>(mbaseResponse, HttpStatus.OK);
    }

}
