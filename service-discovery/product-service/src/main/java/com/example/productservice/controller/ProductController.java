package com.example.productservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * Product Controller
 * 
 * REST controller that handles product-related HTTP requests. This controller provides
 * endpoints for retrieving product information.
 * 
 * Base URL: /api/products
 * Available Operations:
 * - GET /api/products: Retrieves a list of all products
 * 
 * This is a sample controller demonstrating:
 * - REST endpoint implementation
 * - Spring MVC usage in a microservice
 * - Basic product data retrieval
 */
@RestController
@RequestMapping("/api/products")
public class ProductController {

    /**
     * Retrieve all products
     * 
     * This endpoint returns a static list of product names for demonstration purposes.
     * In a real application, this would typically fetch data from a database.
     * 
     * HTTP Method: GET
     * URL: /api/products
     * 
     * @return List<String> A list of product names
     */
    @GetMapping
    public List<String> getProducts() {
        return Arrays.asList("iPhone", "iPad", "MacBook");
    }
}
