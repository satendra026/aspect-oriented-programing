package com.example;

import com.example.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class AspectOrientedApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(AspectOrientedApplication.class, args);

		UserService userService = context.getBean(UserService.class);
		userService.getUser();
	}



}
