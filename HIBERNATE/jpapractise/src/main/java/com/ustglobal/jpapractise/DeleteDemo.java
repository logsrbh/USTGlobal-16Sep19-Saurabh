package com.ustglobal.jpapractise;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpapractise.dto.Student;

public class DeleteDemo {
	
	
	public static void main(String[] args) {
		
		

		EntityTransaction entityTransaction = null;
		EntityManager entityManager = null;

		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");

			entityManager = entityManagerFactory.createEntityManager();

			entityTransaction = entityManager.getTransaction();

			entityTransaction.begin();

			Student student= entityManager.find(Student.class, 10);
			
			entityManager.remove(student);

			
			
			System.out.println("Deleted");
			


			entityTransaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();

		}

		entityManager.close();
		
		
		
	}

}
