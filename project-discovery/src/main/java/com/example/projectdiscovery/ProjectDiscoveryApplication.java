package com.example.projectdiscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ProjectDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectDiscoveryApplication.class, args);
	}

}
