package com.example.orderservice.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * Product Client Interface
 * 
 * This interface defines a Feign client for communicating with the Product Service.
 * It demonstrates service-to-service communication in a microservices architecture
 * using Netflix Feign.
 * 
 * Features:
 * - Declarative REST client using Feign
 * - Automatic service discovery through Eureka
 * - Type-safe interface for API calls
 * 
 * @FeignClient annotation specifies:
 * - name: The name of the target service as registered in Eureka
 * - This allows Feign to automatically discover and load balance requests to the service
 */
@FeignClient(name = "product-service")
public interface ProductClient {
    
    /**
     * Retrieve all products from the Product Service
     * 
     * This method makes a GET request to the Product Service's /api/products endpoint.
     * Feign automatically handles:
     * - Service discovery
     * - Request creation
     * - Response deserialization
     * 
     * @return List<String> A list of product names from the Product Service
     */
    @GetMapping("/api/products")
    List<String> getProducts();
}
