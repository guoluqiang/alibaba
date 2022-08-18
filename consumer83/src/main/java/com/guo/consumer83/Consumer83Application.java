package com.guo.consumer83;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class Consumer83Application {

    public static void main(String[] args) {
        SpringApplication.run(Consumer83Application.class, args);
    }

}
