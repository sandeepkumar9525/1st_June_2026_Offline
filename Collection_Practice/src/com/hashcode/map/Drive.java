package com.hashcode.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Drive {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("Some key"); // hashmap --> put(Key , Value) 
		
		
		Map<String, String> map = new HashMap<String, String>();
		
		// Adding key and value
		map.put("Bihar", "Patna");
		map.put("GT", "GN");
		map.put("KT", "BLR");
		map.put("KT", "BLR");
		map.put("MHR", "MUB");
		map.put("PN", "CHG");
		map.put("HR", "CHG");
	//	System.out.println(map);
		
		//System.out.println(map.get("KT"));
		
		

		Map<String, String> linkedHashMap = new LinkedHashMap<String, String>();
		
		// Adding key and value
		linkedHashMap.put("Bihar", "Patna");
		linkedHashMap.put("GT", "GN");
		linkedHashMap.put("KT", "BLR");
		linkedHashMap.put("KT", "BLR");
		linkedHashMap.put("MHR", "MUB");
		linkedHashMap.put("PN", "CHG");
		linkedHashMap.put("HR", "CHG");
		
		//System.out.println(linkedHashMap);
		
		

		Map<String, String> trreMap = new TreeMap<String, String>();
		
		// Adding key and value
		trreMap.put("Bihar", "Patna");
		trreMap.put("GT", "GN");
		trreMap.put("KT", "BLR");
		trreMap.put("KT", "BLR");
		trreMap.put("MHR", "MUB");
		trreMap.put("PN", "CHG");
		trreMap.put("HR", "CHG");
		
		System.out.println(trreMap);
		
		
	}

}
