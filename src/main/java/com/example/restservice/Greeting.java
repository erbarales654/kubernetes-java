package com.example.restservice;

public class Greeting {

	private final long id;
	private final String content;
	private final String[] environment;
	private final String fileContent;

	public Greeting(long id, String content, String[] environment, String fileContent) {
		this.id = id;
		this.content = content;
		this.environment = environment;
		this.fileContent = fileContent;
	}

	public String getFileContent() {
		return fileContent;
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
