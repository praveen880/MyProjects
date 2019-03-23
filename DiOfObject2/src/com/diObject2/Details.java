package com.diObject2;

public class Details {

	private long adhaarno;
	private String address;
	private String married;
	private int age;
	


	public void setAdhaarno(long adhaarno) {
		this.adhaarno = adhaarno;
	}



	public void setAddress(String address) {
		this.address = address;
	}


	public void setMarried(String married) {
		this.married = married;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public void printDetails() {
		// TODO Auto-generated method stub
		
		System.out.println("ADHAAR NO   ="+adhaarno);
		System.out.println("ADDRESS     ="+address);
		System.out.println("MARRIED     ="+married);
		System.out.println("AGE         ="+age);
	}
}
