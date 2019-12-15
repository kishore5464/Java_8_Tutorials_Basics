package com.kishore;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MyClass {
	public static void main(String[] args) {
		System.out.println("----> LIST <---- ");
		List<String> strList = new ArrayList<String>();
		strList.add("Kishore");
		strList.add("Roshini");
		strList.add("Shantha");
		strList.add("Arumugam");

		strList.forEach(System.out::println);
		System.out.println("\n----> SET <---- ");

		Set<String> strSet = new HashSet<String>();
		strSet.add("Kishore");
		strSet.add("Shantha");
		strSet.add("Arumugam");
		strSet.add("Roshini");
		strSet.add("Shantha");
		strSet.add("Arumugam");

		strSet.forEach(System.out::println);
	}
}
