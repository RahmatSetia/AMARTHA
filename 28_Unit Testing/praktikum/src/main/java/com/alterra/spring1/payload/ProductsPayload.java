package com.alterra.spring1.payload;

import com.alterra.spring1.entity.Products;
import lombok.Data;

@Data
public class ProductsPayload {
    private Long id;
    private String name;
    private String description;
    private Integer stock;
    private Integer price;
}
