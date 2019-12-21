//package com.ustglobal.emailapp.dao;
//
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.EntityTransaction;
//import javax.persistence.PersistenceUnit;
//import javax.persistence.TypedQuery;
//
//import org.springframework.stereotype.Repository;
//
//import com.ustglobal.emailapp.dto.User_Info;
//
//@Repository
//public class ChangePasswordImpl implements ChangePassword{
//
//	@PersistenceUnit
//	private EntityManagerFactory factory;
//	@Override
//	public boolean changepassword(User_Info info) {
//		String jpql = "from User_Info where email=:email";
//		EntityManager manager = factory.createEntityManager();
//		EntityTransaction transaction = manager.getTransaction();
//		TypedQuery<User_Info> query = manager.createQuery(jpql, User_Info.class);
//		transaction.begin();
//		query.setParameter("password", query.getParameters());
//		//User_Info user = query.getSingleResult();
//		transaction.commit();
//		return true;
//
//	}
//}
