package com.kishore;

public interface MyInterface2 {
	default public void m1() {
		System.out.println("Interface 2 in Default Method");
	}
	
	default public void m2() {
		System.out.println("Interface 2 2nd in Default Method");
	}
	
	static public void m3() {
		System.out.println("Interface 2 in Static Method");
	}
	
	interface InnerInterface {
		default public void m1() {
			System.out.println("Interface 2 in Default Method");
		}
	}
	
}
