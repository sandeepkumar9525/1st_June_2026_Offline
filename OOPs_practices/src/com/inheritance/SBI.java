package com.inheritance;

public class SBI {
	public void whichOne() {
		System.out.println("Kodewala");
	}

}

class AccountInfo extends SBI{
	public void what() {
		System.out.println("Academy");
	}
}
class PremiumShavingAccount extends AccountInfo{
	public void where() {
		System.out.println("Banglore");
	}
	public static void main(String[] args) {
		PremiumShavingAccount st = new PremiumShavingAccount();
		st.whichOne();
		st.what();
		st.where();
		
	}
}