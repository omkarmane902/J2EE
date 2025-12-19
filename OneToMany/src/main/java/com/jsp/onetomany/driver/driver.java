package com.jsp.onetomany.driver;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.onetomany.Department;
import com.jsp.onetomany.Employees;

public class driver {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pg");
		
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction et = em.getTransaction();
		
		
		Employees e1 = new Employees(101, "Omkar", 30000);
		Employees e2 = new Employees(102, "Ram", 28000);
		Employees e3 = new Employees(103, "Arun", 32000);
		
		List<Employees> list =Arrays.asList(e1,e2,e3);
		
		
		Department d = new Department(1, "HR dept", list);
		
		et.begin();
		
		em.persist(d);
		em.persist(e1);
		em.persist(e2);
		em.persist(e3);
		et.commit();
	}
	
	
	   
}
