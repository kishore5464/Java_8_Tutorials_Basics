package com.kishore;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class MyClass {

	public static void main(String[] args) {
		List<Integer> intList = Arrays.asList(10, 3, 6, 0, 2, 9, 7);
		intList.forEach(exceptionHandler(i -> System.out.println(10 / i)));
	}

	private static Consumer<Integer> exceptionHandler(Consumer<Integer> consumer) {
		return x -> {
			try {
				consumer.accept(x);
			} catch (ArithmeticException ae) {
				System.out.println("Arithmetic Exception number " + ae.getMessage());
			}
		};
	}

}
