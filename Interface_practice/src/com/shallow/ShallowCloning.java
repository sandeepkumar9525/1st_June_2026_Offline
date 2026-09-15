package com.shallow;

class Address implements Cloneable {
	String city;

	public Address(String city) {
		this.city = city;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
class Student implements Cloneable{
	
	String name;
	Address addr;
	public Student(String name, Address addr) {
		this.name = name;
		this.addr= addr;
		
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		// shallow cloning
		Student s = (Student) super.clone();
		
		// deep cloning
		s.addr=(Address) this.addr.clone();
		
		return s;
	}
}
public class ShallowCloning {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Address ad = new Address("Bihar");
		Student st = new Student("Sandeep", ad);
		
		// deep  cloning
		Student student = (Student) st.clone();
		
		// original address change
		st.addr.city ="Banglore";
		
		System.out.println("Orginal Student city:"+ st.addr.city);
		System.out.println("Cloned Student city : " + st.addr.city);

	}

}
