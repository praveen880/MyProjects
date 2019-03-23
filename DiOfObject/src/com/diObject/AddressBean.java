package com.diObject;

public class AddressBean {
	private int platno;
	private String city;
	private int pincod;
	public int getPlatno() {
		return platno;
	}
	public void setPlatno(int platno) {
		this.platno = platno;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincod() {
		return pincod;
	}
	public void setPincod(int pincod) {
		this.pincod = pincod;
	}
	public void printAddress()
	{
		System.out.println("platNo ="+platno+" city ="+city+" pincode ="+pincod);
	}
}
