package com.lyes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class WebMailApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebMailApplication.class, args);
	}
}
