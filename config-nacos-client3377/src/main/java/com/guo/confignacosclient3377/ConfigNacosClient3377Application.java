package com.guo.confignacosclient3377;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ConfigNacosClient3377Application {

    public static void main(String[] args) {
        SpringApplication.run(ConfigNacosClient3377Application.class, args);
    }

}
