package com.kishore.classes;

import com.kishore.interfaces.MyInterface;

public class MyClass {
	public static void main(String[] args) {
		MyInterface interface1 = MyClass::myClassMethod;
		String message = interface1.myIMethod();
		System.out.println(message);
	}

	public static String myClassMethod() {
		return "Hello";
	}
}
