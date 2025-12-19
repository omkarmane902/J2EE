package com.jsp.onetoone.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Passport {

	@Id
    private int id;
    private String passportNo;
    private String country;
    
    public Passport() {
	}

	public Passport(int id, String passportNo, String country) {
		super();
		this.id = id;
		this.passportNo = passportNo;
		this.country = country;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPassportNo() {
		return passportNo;
	}

	public void setPassportNo(String passportNo) {
		this.passportNo = passportNo;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
    
    
	
	
	
}
