package com.kishore;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class MyClass {

	public static void main(String[] args) {

		List<String> arl = new ArrayList<String>();
		arl.add("Kishore");
		arl.add("Roshini");
		arl.add("Arumugam");
		arl.add("Shantha");
		arl.add("Sudha");
		arl.add("Yuvasri");

		// Complete ForEach Structure
		arl.forEach(new Consumer<String>() {

			@Override
			public void accept(String names) {
				System.out.println(names);
			}

		});

		System.out.println("---------------");

		// Little modifications in ForEach
		arl.forEach((String names) -> {
			System.out.println(names);
		});

		System.out.println("---------------");

		// More modifications in ForEach
		arl.forEach((names) -> System.out.println(names));
		
		System.out.println("---------------");

		// Full modifications in ForEach
		arl.forEach(System.out::println);
		

	}

}
