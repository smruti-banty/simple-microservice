package com.example.banty;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient

public class BantyServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BantyServiceApplication.class, args);
	}

}
