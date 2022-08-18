package com.example.gateway9528;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Gateway9528Application {

    public static void main(String[] args) {
        SpringApplication.run(Gateway9528Application.class, args);
    }

}
