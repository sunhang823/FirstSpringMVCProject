package com.gontuseries.studentAdmissionController;

public class Address {
	
	private String country;
	private String state;
	private String city;
	private String street;
	private int zipcode;
	
	public void setCountry(String country) {
		this.country = country;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public void setStreet(String street) {
		this.street = street;
	}
	
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
	
	public String getCountry() {
		return country;
	}
	
	public String getState() {
		return state;
	}
	
	public String getCity() {
		return city;
	}
	
	public String getStreet() {
		return street;
	}
	
	public int getZipcode() {
		return zipcode;
	}
	

}
