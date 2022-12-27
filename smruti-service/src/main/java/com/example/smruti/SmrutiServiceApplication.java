package com.example.smruti;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;

@EnableDiscoveryClient
@SpringBootApplication

public class SmrutiServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SmrutiServiceApplication.class, args);
    }

}
