package com.spring.autowire;

public class Company 
{
	private String companyName;
	private String companyType;
	private String ceo;
	private Address address;

	public Company() {
		super();
	}

	public Company(String companyName, String companyType, String ceo, Address address) {
		super();
		this.companyName = companyName;
		this.companyType = companyType;
		this.ceo = ceo;
		this.address = address;
	}
	
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCompanyType() {
		return companyType;
	}
	public void setCompanyType(String companyType) {
		this.companyType = companyType;
	}
	public String getCeo() {
		return ceo;
	}
	public void setCeo(String ceo) {
		this.ceo = ceo;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Company [companyName=" + companyName + ", companyType=" + companyType + ", ceo=" + ceo + ", address="
				+ address + "]";
	}
	
	

}
