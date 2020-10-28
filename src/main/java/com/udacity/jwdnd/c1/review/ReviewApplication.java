package com.udacity.jwdnd.c1.review;

import com.udacity.jwdnd.c1.review.service.MessageService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
@Configuration
@EnableAutoConfiguration
public class ReviewApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReviewApplication.class, args);
    }

    @Bean
    public String message() {
        System.out.println("Creating a message bean");
        return "Hello,Spring!";
    }

    @Bean
    public String toUppercase(MessageService messageService) {
        System.out.println("Creating upperCaseMessage bean");
        return messageService.uppercase();
    }

    @Bean
    public String lowercaseMessage(MessageService messageService) {
        System.out.println("Creating lowercaseMessage bean");
        return messageService.lowercase();
    }


}
