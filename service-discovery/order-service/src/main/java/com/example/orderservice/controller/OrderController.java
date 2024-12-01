package com.example.orderservice.controller;

import com.example.orderservice.client.ProductClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Order Controller
 * 
 * REST controller that handles order-related operations and demonstrates
 * inter-service communication using Feign Client. This controller shows how
 * to make service-to-service calls in a microservices architecture.
 * 
 * Base URL: /api/orders
 * Available Operations:
 * - GET /api/orders/products: Retrieves products by calling Product Service
 * 
 * This controller demonstrates:
 * - REST endpoint implementation
 * - Service-to-service communication
 * - Feign client usage
 */
@RestController
@RequestMapping("/api/orders")
public class OrderController {

    private final ProductClient productClient;

    /**
     * Constructor injection of the ProductClient
     * 
     * @param productClient Feign client for the Product Service
     */
    public OrderController(ProductClient productClient) {
        this.productClient = productClient;
    }

    /**
     * Retrieve products from the Product Service
     * 
     * This endpoint demonstrates inter-service communication by calling
     * the Product Service through Feign client. It showcases:
     * - Service discovery through Eureka
     * - Declarative REST client with Feign
     * - Microservices communication pattern
     * 
     * HTTP Method: GET
     * URL: /api/orders/products
     * 
     * @return List<String> A list of products retrieved from the Product Service
     */
    @GetMapping("/products")
    public List<String> getProductsFromProductService() {
        return productClient.getProducts();
    }
}
