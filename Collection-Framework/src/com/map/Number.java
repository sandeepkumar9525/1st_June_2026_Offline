package com.map;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Number {

	public static void main(String[] args) {
		Map<String, String> linkedHashMap = new LinkedHashMap<String, String>();

		// Adding key and 
		linkedHashMap.put("Bihar", "Patna");
		linkedHashMap.put("GT", "GN");
		linkedHashMap.put("KT", "BLR");
		linkedHashMap.put("KT", "BLR");
		linkedHashMap.put("MHR", "MUB");
		linkedHashMap.put("PN", "CHG");
		linkedHashMap.put("HR", "CHG");

//		Set<Entry<String, String>> enterySet = linkedHashMap.entrySet();
//		Iterator<Entry<String, String>> itr = enterySet.iterator();
//		while (itr.hasNext()) {
//			Entry<String, String> res = itr.next();
//			System.out.println("Key- " + res.getKey() + " ,  Value- " + res.getValue());
//			
//			
//			
			
			
			Set<Entry<String,String>> entry = linkedHashMap.entrySet();
			Iterator<Entry<String,String>> itr= entry.iterator();
			while(itr.hasNext()) {
				Entry<String, String> enr= itr.next();
				System.out.println("Key - " + enr.getKey() + " , Value - " + enr.getValue());
			}
			
		}

	//}

}
