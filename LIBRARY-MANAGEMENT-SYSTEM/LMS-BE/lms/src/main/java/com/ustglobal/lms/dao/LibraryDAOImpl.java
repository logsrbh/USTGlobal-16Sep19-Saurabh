package com.ustglobal.lms.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.ustglobal.lms.dto.BookBean;
import com.ustglobal.lms.dto.LibrerianBean;
import com.ustglobal.lms.dto.StudentBean;

@Repository
public class LibraryDAOImpl implements LibraryDAO {

	@PersistenceUnit
	private EntityManagerFactory factory;

	@Override
	public StudentBean loginStudent(StudentBean studentBean) {
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createQuery("from StudentBean where rollno=:rollno and password=:password");
		query.setParameter("rollno", studentBean.getRollno());
		query.setParameter("password", studentBean.getPassword());
		studentBean = (StudentBean) query.getSingleResult();
		return studentBean;
	}

	@Override
	public LibrerianBean loginLibrerian(LibrerianBean librerianBean) {
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createQuery("from LibrerianBean where libid=:libid and password=:password");
		query.setParameter("libid", librerianBean.getLibid());
		query.setParameter("password", librerianBean.getPassword());
		librerianBean = (LibrerianBean) query.getSingleResult();
		return librerianBean;
	}

	@Override
	public boolean registerStudent(StudentBean bean) {

		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			manager.persist(bean);
			transaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean registerLibrerian(LibrerianBean bean) {

		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			manager.persist(bean);
			transaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public BookBean searchBook(int id) {

		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			BookBean bean = manager.find(BookBean.class, id);
			transaction.commit();
			return bean;
		} catch (Exception e) {

			e.printStackTrace();
			return null;
		}
	}

	@Override
	public boolean addBook(BookBean bean) {

		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			manager.persist(bean);
			transaction.commit();
			return true;
		} catch (Exception e) {

			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean updatebook(BookBean bean) {

		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			BookBean book = manager.find(BookBean.class, bean.getBid());
			book.setBname(bean.getBname());
			book.setBauthor(bean.getBauthor());
			book.setPublication(bean.getPublication());
			transaction.commit();
			return true;
		} catch (Exception e) {

			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean deletebook(int id) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			BookBean bean = manager.find(BookBean.class, id);
			manager.remove(bean);
			transaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public List<BookBean> showAllBook() {
		String jpql = "from BookBean";
		EntityManager manager = factory.createEntityManager();
		TypedQuery<BookBean> query = manager.createQuery(jpql, BookBean.class);
		List<BookBean> bookBeans = query.getResultList();
		return bookBeans;

	}

}
