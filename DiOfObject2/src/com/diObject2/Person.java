package com.diObject2;

public class Person {

	private int pid;
	private String name;
	private Details det;
	
	public void setPid(int pid) {
		this.pid = pid;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDet(Details det) {
		this.det = det;
	}

	public void printPersonDetails()
	{
		System.out.println("PERSON ID   ="+pid );
		System.out.println("PERSON NAME ="+name);
		det.printDetails();
		
	}
}
