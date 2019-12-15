package com.kishore;

import java.util.ArrayList;
import java.util.List;

public class MyClass {
	public static void main(String[] args) {
		List<String> strList = new ArrayList<String>();
		strList.add("Kishore");
		strList.add("Roshini");
		strList.add("Shantha");
		strList.add("Arumugam");
		
		strList.forEach(System.out::println);
	}
}
