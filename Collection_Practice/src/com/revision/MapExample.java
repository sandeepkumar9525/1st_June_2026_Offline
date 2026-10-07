package com.revision;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();

		map.put("Alice", 25);
		map.put("Bob", 30);

		int aliceAge = map.get("Alice");
		System.out.println("Alice's Age : " + aliceAge);

		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " is " + entry.getValue());
		}

	}

}
