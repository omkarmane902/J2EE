package com.jsp.manytoone.driver;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.manytoone.entity.Customer;
import com.jsp.manytoone.entity.Orders;

public class driver {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pg");

		EntityManager em = emf.createEntityManager();

		EntityTransaction et = em.getTransaction();

		Customer c = new Customer(101, "omkar", "pune");

		Orders o1 = new Orders(1, "mobile", 200000.0, c);
		Orders o2 = new Orders(2, "watch", 2000.0, c);
		Orders o3 = new Orders(3, "mouse", 10000.0, c);

		et.begin();

		em.persist(o1);
		em.persist(o2);
		em.persist(o3);
		em.persist(c);
		et.commit();

	}

}
