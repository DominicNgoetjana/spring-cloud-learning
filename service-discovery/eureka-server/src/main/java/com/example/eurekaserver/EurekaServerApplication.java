package com.example.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Eureka Server Application
 * 
 * This is the main entry point for the Eureka Server, which acts as a service registry
 * for our microservices architecture. The Eureka Server is responsible for:
 * - Maintaining a registry of available microservices
 * - Providing service discovery capabilities to registered services
 * - Health monitoring of registered services
 * 
 * @EnableEurekaServer: Enables this application to act as a Eureka Server
 * @SpringBootApplication: Combines @Configuration, @EnableAutoConfiguration, and @ComponentScan
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {
    
    /**
     * Main method that starts the Eureka Server
     * 
     * @param args Command line arguments passed to the application
     */
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class, args);
    }
}
