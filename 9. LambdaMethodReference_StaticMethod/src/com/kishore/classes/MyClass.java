package com.kishore.classes;

import com.kishore.interfaces.MyInterface;

public class MyClass {
	public static void main(String[] args) {
		MyInterface interface1 = MyClass::myCMethod;
		interface1.myIMethod();
	}

	public static String myCMethod() {
		System.out.println("Hai");
		return null;
	}
}
