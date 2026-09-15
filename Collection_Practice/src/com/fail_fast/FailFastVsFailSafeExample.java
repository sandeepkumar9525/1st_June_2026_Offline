package com.fail_fast;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class FailFastVsFailSafeExample {

	public static void main(String[] args) {
		
		System.out.println("----Fail Fast Example------");
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("1", "C");
		map.put("2", "D");
		map.put("3", "Z");
		
		Iterator<String> itr = map.keySet().iterator();
		while(itr.hasNext()) {
			String st = itr.next();
			map.put("4", "F");
			System.out.println(st);
		}
		
		
//		ConcurrentHashMap<String,String> hasMap = new ConcurrentHashMap<>();
//		hasMap.put("6", "U");
//		hasMap.put("7", "X");
//		hasMap.put("8", "A");
//		
//		Iterator<String> iter = hasMap.keySet().iterator();
//		while(iter.hasNext()) {
//			String cv= iter.next();
//			
//			
//			hasMap.put("11", "P");
//		}
//		System.out.println(hasMap);
//		
	}

}
