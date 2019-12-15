package com.kishore.interfaces;

public interface MyInterface {

	// Default Method
	default public void defaultMethod() {
		System.out.println("Default Interface Method");
	}
	
	// Static Method
	public static void staticMethod() {
		System.out.println("Static Interface Method");
	}
	
	// Normal Method
	public void normalMethod();
}
