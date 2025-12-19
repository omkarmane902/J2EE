package com.jsp.onetoone.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Person {
    
	@Id
	private int id;
    private String name;
    private int age;
    
    @OneToOne
    private Passport Passport_id;
    
    public Person() {
	}

	public Person(int id, String name, int age, Passport passport_id) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		Passport_id = passport_id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Passport getPassport_id() {
		return Passport_id;
	}

	public void setPassport_id(Passport passport_id) {
		Passport_id = passport_id;
	}
	
	
    
	

}
