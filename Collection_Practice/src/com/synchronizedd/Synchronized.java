package com.synchronizedd;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Synchronized {

	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<>();
		
		map.put(101, "Rahul");
		map.put(102, "Rohit");
		map.put(103, "Golu");
		map.put(104, "Moun");
		
		
		Map<Integer, String> maplev=Collections.synchronizedMap(map);
		
		System.out.println(map);
		
		maplev.put(103, "Mohan");
		
		System.out.println(maplev);

	}

}
