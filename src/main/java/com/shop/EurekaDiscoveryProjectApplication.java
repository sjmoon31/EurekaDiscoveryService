package com.shop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaDiscoveryProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaDiscoveryProjectApplication.class, args);
	}

}
