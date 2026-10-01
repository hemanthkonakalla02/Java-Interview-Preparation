package com.springcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("company")
public class Company 
{
	@Value("${companyName}")
	private String companyName;
	
	@Value("${companyType}")
	private String companyType;
	
	@Value("${ceo}")
	private String ceo;
	
	@Autowired
	private Address address;
	
	public Company()
	{
		
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
