package com.udacity.jwdnd.c1.review;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class ReviewApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReviewApplication.class, args);
	}


	@Bean
	public String message()
	{
		System.out.println("message Bean created.");
		return "Hello, Spring!";
	}

	@Bean
	public String upperCaseMessage(MessageService messageService)
	{
		System.out.println("Upper case message Bean created.");
		return messageService.upperCase();
	}

	@Bean
	public String lowerCaseMessage(MessageService messageService)
	{
		System.out.println("Lower case message Bean created.");
		return messageService.lowerCase();
	}

}

// Tips
// 'cmd + n' for source generation features 