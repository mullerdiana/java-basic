package com.example;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@OpenAPIDefinition(servers = { @Server(url = "/", description = "Default Server URL")})
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		System.getenv().forEach((k, v) -> System.out.println(k + " = " + v));
		SpringApplication.run(Application.class, args);
		System.out.println("Active Profile: " + System.getenv("SPRING_PROFILES_ACTIVE"));

	}
}
