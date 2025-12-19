package com.jsp.onetomany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Department {
     @Id
	 private int id;
	 private String name;
	 
	 
	 @OneToMany
	List<Employees>list;
	 
	 public Department() {
	}

	 public Department(int id, String name, List<Employees> list) {
		super();
		this.id = id;
		this.name = name;
		this.list = list;
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

	 public List<Employees> getList() {
		 return list;
	 }

	 public void setList(List<Employees> list) {
		 this.list = list;
	 }

	
}
