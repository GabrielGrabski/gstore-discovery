package com.grabas.gstore_discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class GstoreDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(GstoreDiscoveryApplication.class, args);
	}

}
