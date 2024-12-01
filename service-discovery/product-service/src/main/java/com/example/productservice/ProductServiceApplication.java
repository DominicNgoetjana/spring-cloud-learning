package com.example.productservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Product Service Application
 * 
 * This is a sample microservice that demonstrates service registration with Eureka Server.
 * The service provides product-related functionality and registers itself with the Eureka Server
 * for service discovery.
 * 
 * Key Features:
 * - Registers itself with Eureka Server
 * - Provides REST endpoints for product operations
 * - Demonstrates microservice architecture principles
 * 
 * @EnableEurekaClient: Enables service registration with Eureka Server
 * @SpringBootApplication: Marks this as a Spring Boot application
 */
@SpringBootApplication
@EnableEurekaClient
public class ProductServiceApplication {

    /**
     * Main method that starts the Product Service
     * 
     * @param args Command line arguments passed to the application
     */
    public static void main(String[] args) {
        SpringApplication.run(ProductServiceApplication.class, args);
    }
}
