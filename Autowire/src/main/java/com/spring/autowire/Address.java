package com.spring.autowire;

public class Address 
{
	private String streetName;
	private String landMark;
	private long pincode;

	public Address() {
		super();
	}

	public Address(String streetName, String landMark, long pincode) {
		super();
		this.streetName = streetName;
		this.landMark = landMark;
		this.pincode = pincode;
	}
	
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getLandMark() {
		return landMark;
	}
	public void setLandMark(String landMark) {
		this.landMark = landMark;
	}
	public long getPincode() {
		return pincode;
	}
	public void setPincode(long pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [streetName=" + streetName + ", landMark=" + landMark + ", pincode=" + pincode + "]";
	}
	
	

}
