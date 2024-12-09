package com.klef.jfsd.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.klef.jfsd.springboot.model.Product;
import com.klef.jfsd.springboot.service.ProductService;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public Product[] getAllProducts() {
        return productService.getAllProducts();
    }
}