package com.example.restservice;

public class Greeting {

	private final long id;
	private final String content;
	private final String[] environment;

	public Greeting(long id, String content, String[] environment) {
		this.id = id;
		this.content = content;
		this.environment = environment;
	}

	public long getId() {
		return id;
	}

	public String getContent() {
		return content;
	}

	public String[] getEnvironment() {
		return environment;
	}	
}
