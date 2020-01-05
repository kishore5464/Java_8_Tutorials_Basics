package com.kishore;

public class ClosuresExamples {

	public static void main(String[] args) {
		int x = 20;
		int y = 30;

		//Normal using Anonymous
		addition(x, new Calculator() {
			@Override
			public int addition(int v) {
				System.out.println(v + y);
				return v + y;
			}
		});
		
		// Using Lambda Expressions
		addition(x, (s) -> {
				System.out.println(s + y);
				return s + y;
		});
	}

	public static void addition(int x, Calculator c) {
		c.addition(x);
	}
}
