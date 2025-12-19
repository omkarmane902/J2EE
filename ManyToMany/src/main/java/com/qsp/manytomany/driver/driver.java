package com.qsp.manytomany.driver;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.qsp.manytomany.entity.Actors;
import com.qsp.manytomany.entity.Movies;

public class driver {

	public static void main(String[] args) {
		
		
EntityManagerFactory emf = Persistence.createEntityManagerFactory("pg");
		
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction et = em.getTransaction();
		
		
		Movies m1= new Movies(1, "Dangal");
		Movies m2= new Movies(2, "Baahubali 2");
		Movies m3= new Movies(3, "Pushpa 2");
		
		
		
		List<Movies> movies1 = Arrays.asList(m1,m3);
		Actors a1 = new Actors(101, "Aamir Khan", movies1);
		
		
		List<Movies> movies2 = Arrays.asList(m2,m3);
		Actors a2 = new Actors(102, "Rukh Khan", movies2); 
		
		
		List<Movies> movies3 = Arrays.asList(m2,m1);
		Actors a3 = new Actors(103, "Allu Arjun", movies3); 
		
		et.begin();
		
		em.persist(m1); 
		em.persist(m2); 
		em.persist(m3); 
		em.persist(a1); 
		em.persist(a2); 
		em.persist(a3); 
		et.commit();
	}
	
	
	
}
