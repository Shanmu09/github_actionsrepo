package com.example.springboot_cicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class SpringbootCicdApplication {

	@GetMapping("/message")
	public String message() {
		return "Hello World";
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringbootCicdApplication.class, args);
	}

}
