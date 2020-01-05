package com.kishore.classes;

public class WelcomeClass {

	public WelcomeClass() {
		System.out.println("Hai from Welcome Class Constructor.. ");
	}

	public WelcomeClass(String name) {
		System.out.println("Welcome, " + name + " from Welcome Class Constructor with one args");
	}

	public static String welcomeMessage(String name) {
		return "Hello, " + name;
	}

	public String welcomeMessage2(String name) {
		return "I am " + name;
	}
}
