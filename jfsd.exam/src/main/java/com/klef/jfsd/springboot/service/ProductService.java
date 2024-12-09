package com.klef.jfsd.springboot.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.klef.jfsd.springboot.model.Product;

@Service
public class ProductService {

    private final String FAKE_STORE_API_URL = "https://fakestoreapi.com/products";

    public Product[] getAllProducts() {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(FAKE_STORE_API_URL, Product[].class);
    }
}