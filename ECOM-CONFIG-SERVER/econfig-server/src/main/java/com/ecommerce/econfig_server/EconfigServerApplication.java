package com.ecommerce.econfig_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class EconfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EconfigServerApplication.class, args);
	}

}
