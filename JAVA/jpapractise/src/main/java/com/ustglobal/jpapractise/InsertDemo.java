package com.ustglobal.jpapractise;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpapractise.dto.Student;

public class InsertDemo {

	public static void main(String[] args) {

		Student student = new Student();
		student.setId(10);
		student.setName("Dinga");
		student.setAge(25);

		EntityTransaction entityTransaction = null;
		EntityManager entityManager = null;

		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");

			entityManager = entityManagerFactory.createEntityManager();

			entityTransaction = entityManager.getTransaction();

			entityTransaction.begin();

			entityManager.persist(student);

			System.out.println("Data Inserted");

			entityTransaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();

		}

		entityManager.close();

	}

}
