package com.jsp.onetoone.driver;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.onetoone.entity.Passport;
import com.jsp.onetoone.entity.Person;


public class Driver {

	public static void main(String[] args) {
		
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pg");
		
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction et = em.getTransaction();
		

        Passport pa = new Passport(201, "12345", "INDIA");
        Person ps = new Person(101, "omkar", 18, pa);
        
        
        et.begin();
	    em.persist(pa);
	    em.persist(ps);
	    
		et.commit();
	}
}
