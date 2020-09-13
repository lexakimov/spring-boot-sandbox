package com.example.springbootsandbox;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.example.springbootsandbox")
public class SpringBootSandboxApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSandboxApplication.class, args);
	}

}
