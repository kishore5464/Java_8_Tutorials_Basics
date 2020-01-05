package com.kishore;

public class MyClass {

	public static void main(String[] args) {
		MyClass.classMessage("Hello Java 8", new MyInterface() {

			@Override
			public String message(String message) {
				System.out.println(message);
				System.out.println(this);
				return message;
			}

		});
		System.out.println();
		
		// Here this keyword will throw Compile time error
		MyClass.classMessage("Hai Java 8", (message) -> {
			System.out.println(message);
		//	System.out.println(this);
			return message;
		});

	}

	public static String classMessage(String message, MyInterface myInterface) {
		myInterface.message(message);
		return message + " by Kicha";
	}
}
