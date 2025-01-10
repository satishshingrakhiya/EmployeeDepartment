package com.satish.cloud_gateway;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CloudGatewayApplication {

	@Value("${hello.world}")
	private static String hello;

	public static void main(String[] args) {

		SpringApplication.run(CloudGatewayApplication.class, args);
		System.out.println(hello);

	}

}
