package com.kishore.myclass;

import com.kishore.myinterfaces.MyInterface;

public class MyClass {
	public static void main(String[] args) {
		MyInterface i1 = () -> {
			return "AK";
		};
		System.out.println(i1.m());
	}
}
