package com.kishore;

public interface MyInterface1 {
	
	String s = "Hai";
	
	default public void m1() {
		System.out.println("Interface 1 in Default Method");
	}
	
	default public void m2() {
		System.out.println("Interface 1 2nd in Default Method");
	}
	
	static public void m3() {
		System.out.println("Interface 1 in Static Method");
	}
}
