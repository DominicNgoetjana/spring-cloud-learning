package com.example.orderservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Order Service Application
 * 
 * This microservice handles order-related operations and demonstrates service-to-service
 * communication using Spring Cloud's Feign client. It registers with Eureka Server for
 * service discovery and uses Feign to communicate with the Product Service.
 * 
 * Key Features:
 * - Service registration with Eureka Server
 * - Inter-service communication using Feign
 * - REST endpoints for order operations
 * 
 * @EnableEurekaClient: Enables service registration with Eureka Server
 * @EnableFeignClients: Enables Feign clients for service-to-service communication
 * @SpringBootApplication: Marks this as a Spring Boot application
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class OrderServiceApplication {

    /**
     * Main method that starts the Order Service
     * 
     * @param args Command line arguments passed to the application
     */
    public static void main(String[] args) {
        SpringApplication.run(OrderServiceApplication.class, args);
    }
}
