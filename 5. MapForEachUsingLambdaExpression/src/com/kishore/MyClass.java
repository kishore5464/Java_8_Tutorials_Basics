package com.kishore;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class MyClass {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(0101, "Kishore");
		map.put(0706, "Roshini");
		map.put(2005, "Shantha");
		map.put(1002, "Arumugam");

		map.forEach((key, value) -> {
			System.out.println("Key: " + key + " & Value: " + value);
		});

		map.forEach(new BiConsumer<Integer, String>() {

			@Override
			public void accept(Integer key, String value) {
				// TODO Auto-generated method stub

			}
		});
	}
}
