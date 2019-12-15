package com.kishore;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyClass {
	public static void main(String[] args) {
		List<String> strList = new ArrayList<String>();
		strList.add("Kishore");
		strList.add("Roshini");
		strList.add("Shantha");
		strList.add("Arumugam");

		System.out.println("Before Sorting: ");
		strList.forEach(System.out::println);

		System.out.println("After Sorting: ");
		Collections.sort(strList, (o1, o2) -> o1.compareTo(o2));

		System.out.println("\nAfter Sorting: ");
		strList.forEach(System.out::println);

	}
}
