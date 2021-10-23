package com.example.restservice;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;

@RestController
public class GreetingController {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@Value("${myservice_color}")
	private String color;
	@Value("${myservice_db_username}")
	private String dbUsername;
	@Value("${myservice_db_password}")
	private String dbPassword;		

	@GetMapping("/greeting")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		String message = String.format(template, name);		
		String[] environment = new String[] {color, dbUsername, dbPassword};
		return new Greeting(counter.incrementAndGet(), message, environment);
	}
}
