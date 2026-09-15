package com.marker.interfacee;

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

class Student implements Cloneable {
	String name;
	Address addr; // this is Reference object

	public Student(String name, Address addr) {
		this.name = name;
		this.addr = addr;

	}

//	@override
//	protected Object clone() {
//		return super.clone();
//	}

	@Override
	protected Object clone() throws CloneNotSupportedException {

		// return super.clone(); this is shallow cloning

		// deep Cloning
		Student st = (Student) super.clone();
		st.addr = (Address) this.addr.clone();
		return st;
	}
	
}

public class CloningDemo {

		public static void main(String[] args) throws CloneNotSupportedException {

			Address ad = new Address("DL");
			Student student = new Student("Sandeep", ad);

			Student st = (Student) student.clone();
			st.addr.city = " BLR";
			System.out.println("Orignal Student city : " + student.addr.city);
			System.out.println("Cloned Student City : " + st.addr.city);

		}
	}


