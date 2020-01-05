package com.kishore;

import java.util.Arrays;
import java.util.List;

public class MyClass {

	public static void main(String[] args) {
		List<Integer> intList = Arrays.asList(10, 3, 4, 0, 9, 2, 1);
		intList.forEach(i -> {
			try {
				System.out.println(10/i);
			} catch (ArithmeticException ae) {
				System.out.println("Arithmetic Exception number " + ae.getMessage());
			}
		});
	}

}
