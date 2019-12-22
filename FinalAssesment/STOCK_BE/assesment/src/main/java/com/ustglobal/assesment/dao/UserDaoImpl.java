package com.ustglobal.assesment.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.ustglobal.assesment.dto.User;

@Repository
public class UserDaoImpl implements UserDAO {

	@PersistenceUnit
	private EntityManagerFactory factory;

	@Override
	public boolean register(User user) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			manager.persist(user);
			transaction.commit();
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public User login(User user) {

		EntityManager manager = factory.createEntityManager();
		Query query = manager.createQuery("from User where id=:id and password=:password");
		query.setParameter("id", user.getId());
		query.setParameter("password", user.getPassword());
		try {
			User user1 = (User) query.getSingleResult();
			return user1;
		} catch (Exception e) {
			return null;
		}
	}

}
