package com.kishore.interfaces;

public class MyClass implements MyInterface {
	static MyClass class1 = new MyClass();
	
	public static void main(String[] args) {
		class1.defaultMethod();
	}

	@Override
	public void normalMethod() {
		System.out.println("I am Normal Method");
	}
	
	@Override
	public void defaultMethod() {
		System.out.println("Default Implemented Method");
		class1.normalMethod();
	}

	public static void staticMethod() {
		System.out.println("Static Class Method");
	}
}
