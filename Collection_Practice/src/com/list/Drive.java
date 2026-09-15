package com.list;
import java.util.Set;
import java.util.HashSet;
public class Drive {
	
	int id;
	public Drive(int id) {
		this.id= id;
	}
//	@Override
//	public boolean equals(Object obj) {
//		Drive dv = (Drive) obj;
//		return this.id == dv.id;
//		
//	}
//	
//	
//	public int hashCode() {
//		return this.id;
//	}

	public static void main(String[] args) {
		
		Set<Drive> set = new HashSet<>();
		
		set.add(new Drive(22));
		set.add(new Drive(22));
	
		
		System.out.println("Set Size : " + set.size());
	}

}
