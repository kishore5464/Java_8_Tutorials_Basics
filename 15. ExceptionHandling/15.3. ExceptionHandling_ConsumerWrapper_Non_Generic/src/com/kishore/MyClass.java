package com.kishore;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class MyClass {

	public static void main(String[] args) {
		List<Integer> intList = Arrays.asList(10, 3, 6, 0, 2, 9, 7);
		intList.forEach(exceptionHandler(i -> System.out.println(10 / i), Exception.class));
		System.out.println();

		List<String> strList = Arrays.asList("Kishore", "Roshini", "Sudha", null, "Arumugam", "Shantha", "YuvaSri",
				"Kutty Kicha");
		strList.forEach(exceptionHandler(i -> System.out.println(i), Exception.class));
	}

	private static <T, E extends Exception> Consumer<T> exceptionHandler(Consumer<T> consumer, Class<E> myClass) {
		return x -> {
			try {
				if (x == null) {
					throw new Exception();
				}
				consumer.accept(x);
			} catch (Exception e) {
				System.out.println("Exception ----> " + e.getMessage());
			}
		};
	}

}
