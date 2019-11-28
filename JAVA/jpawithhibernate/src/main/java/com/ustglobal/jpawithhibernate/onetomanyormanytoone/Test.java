package com.ustglobal.jpawithhibernate.onetomanyormanytoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class Test {

	public static void main(String[] args) {
		
		
		PencilBox box = new PencilBox();
		box.setBid(10);
		box.setBname("Natraj-Box");
		
		
		Pencil pencil1 = new Pencil();
		pencil1.setPid(10);
		pencil1.setPcolor("black");
		pencil1.setPencilbox(box);
		
		Pencil pencil2 = new Pencil();
		pencil2.setPid(20);
		pencil2.setPcolor("Red");
		pencil2.setPencilbox(box);
		
		
		
		EntityTransaction entityTransaction =null;
		EntityManager entityManager =null ;
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.persist(pencil1);
			entityManager.persist(pencil2);
			System.out.println("Record Saved");
			entityTransaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();

		}
		entityManager.close();
		
	}// end of main

}// end of class