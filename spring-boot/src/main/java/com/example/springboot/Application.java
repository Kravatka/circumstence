package com.example.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		var app = SpringApplication.run(Application.class, args);
		System.out.println(app.getBean(Application.class).hello());
	}

	public String hello() {
		return "Hello World!";
	}
}
