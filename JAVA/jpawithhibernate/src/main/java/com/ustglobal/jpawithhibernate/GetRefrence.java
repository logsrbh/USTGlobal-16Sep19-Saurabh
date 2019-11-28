package com.ustglobal.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernate.dto.Product;

public class GetRefrence {
	
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Product product= entityManager.getReference(Product.class, 102);
		
		System.out.println(product.getPid());
		System.out.println(product.getPname());
		System.out.println(product.getQuantity());
		
		entityManager.close();
		
	} // end of main

}// end of class
