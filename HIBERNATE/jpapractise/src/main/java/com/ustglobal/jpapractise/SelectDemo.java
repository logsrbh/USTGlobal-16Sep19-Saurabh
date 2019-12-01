package com.ustglobal.jpapractise;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ustglobal.jpapractise.dto.Student;

public class SelectDemo {
	
	public static void main(String[] args) {
		
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		
		
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Student student = entityManager.find(Student.class, 10);
		
		System.out.println("Id -- "+student.getId());
		System.out.println("Name -- "+student.getName());
		System.out.println("Age -- "+student.getAge());
		
		
		
		
		
		
		
	}

}
