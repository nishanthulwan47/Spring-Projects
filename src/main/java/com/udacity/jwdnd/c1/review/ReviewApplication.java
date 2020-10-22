package com.udacity.jwdnd.c1.review;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
@EnableAutoConfiguration
public class ReviewApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReviewApplication.class, args);
	}
	@Bean
	public String basicMessage() {
		System.out.println("inside basic message");
		return "Hello";
	}

	@Bean
	public String compoundMessage(String basicMessage) {
		System.out.println("inside compoundMessage, received: " +basicMessage);
		return basicMessage + ", Spring!";
	}
	@Bean
	public int characterCount(String message) {
		return message.length();
	}

}
