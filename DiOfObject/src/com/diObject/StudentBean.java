package com.diObject;

public class StudentBean {
	
	private int rollno;
	private String name;
	private AddressBean ad;
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAd(AddressBean ad) {
		this.ad = ad;
	}
	
	public void printStudentInfo()
	{
		System.out.println("Student Details Are");
		System.out.println("RollNo ="+rollno+" Name ="+name);
		ad.printAddress();
	}

}
