package com.example.restservice;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;
import java.io.*;

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

	private String readFile() {
		String path = "/var/lib/my-data/prueba.txt";
		File file = new File(path);
		if(!file.exists() || file.isDirectory()) { 
			return "File not found " + path;
		}
	    try (BufferedReader br = 
				new BufferedReader(new FileReader(new File(path)));) {			
			String fileContent = "";
			String st;
			while ((st = br.readLine()) != null)		
				fileContent = fileContent + st;
			return fileContent;			
		} catch (Exception e) {
			e.printStackTrace();
			return "Error reading file " + path;
		}
	}

	private String[] getEnvironment() {
		return new String[] {color, dbUsername, dbPassword};
	}

	@GetMapping("/greeting")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		String message = String.format(template, name);		
		return new Greeting(counter.incrementAndGet(), message, getEnvironment(), readFile());
	}
}
