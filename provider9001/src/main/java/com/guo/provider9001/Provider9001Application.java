package com.guo.provider9001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class Provider9001Application {

    public static void main(String[] args) {
        SpringApplication.run(Provider9001Application.class, args);
    }

}
