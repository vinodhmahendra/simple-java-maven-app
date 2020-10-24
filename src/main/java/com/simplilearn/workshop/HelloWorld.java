package com.simplilearn.workshop;

public class HelloWorld {
	
	private final String message = "Hello World Java!";
	
	public final String getMessage() {
		return message;
	}
	
	public static void main(String[] args) {
		System.out.println(new HelloWorld().getMessage());
	}

}
