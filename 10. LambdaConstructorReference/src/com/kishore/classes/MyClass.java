package com.kishore.classes;

import com.kishore.interfaces.MyInterfaces;
import com.kishore.interfaces.MyInterfaces2;
import com.kishore.interfaces.MyInterfaces3;

public class MyClass {

	public MyClass() {
		System.out.println("Hai, Welcome message from MyClass Constructor");
	}

	public static void main(String[] args) {
		// Referring Static Method
		MyInterfaces myInterfaces1 = MyClass::myStaticMessage;
		myInterfaces1.message();
		System.out.println();

		// Referring Non-Static Method
		MyInterfaces myInterfaces2 = new MyClass()::myNonStaticMessage;
		myInterfaces2.message();
		System.out.println();

		// Referring Constructor
		MyInterfaces myInterfaces3 = MyClass::new;
		myInterfaces3.message();
		System.out.println("------------------------------------------------");

		// Referring Static Method with Args and Return
		MyInterfaces2 myInterfaces4 = WelcomeClass::welcomeMessage;
		System.out.println(myInterfaces4.returnMessage("Kicha"));
		System.out.println();
		
		// Referring Non-Static Method with Args and Return
		MyInterfaces2 myInterfaces5 = new WelcomeClass()::welcomeMessage2;
		System.out.println(myInterfaces5.returnMessage("Kishore"));
		System.out.println();
		
		// Referring Constructor with Args
		MyInterfaces3 myInterfaces6 = WelcomeClass::new;
		myInterfaces6.myMessage("Kishore Kumar");
		
	}

	public static void myStaticMessage() {
		System.out.println("My Welcome message to Static Method");
	}

	public void myNonStaticMessage() {
		System.out.println("My Welcome message to NON-Static Method");
	}
}
