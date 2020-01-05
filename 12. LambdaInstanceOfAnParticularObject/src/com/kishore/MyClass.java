package com.kishore;

import java.util.ArrayList;
import java.util.List;

public class MyClass {

	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("Kishore");
		names.add("Roshini");
		names.add("Sudha");
		names.add("Arumugam");
		names.add("Yuvasri");
		names.add("Kutty Kicha");
		
		//names.forEach(n -> System.out.println(n));
		names.forEach(System.out::println);
	}
}
