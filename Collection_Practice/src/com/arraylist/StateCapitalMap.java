package com.arraylist;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class StateCapitalMap {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("Maharashtra", "Mumbai");
		map.put("Karnataka", "Banglore");
		map.put("Tamil Nadu", "Chennai");
		map.put("Bihar", "Patna");
		map.put("West Bengal", "Kolkata");
		
		for(Map.Entry<String, String> entry : map.entrySet()) {
			
			System.out.println("State : " + entry.getKey() + " Capital " + entry.getValue());
		}

	}

}
