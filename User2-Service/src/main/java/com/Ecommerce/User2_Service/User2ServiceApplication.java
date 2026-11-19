package com.Ecommerce.User2_Service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class User2ServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(User2ServiceApplication.class, args);
	}

}
