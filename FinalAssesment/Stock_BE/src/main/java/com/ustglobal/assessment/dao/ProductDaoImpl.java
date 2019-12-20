package com.ustglobal.assessment.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.ustglobal.assessment.bean.OrderBean;
import com.ustglobal.assessment.bean.ProductBean;
@Repository
public class ProductDaoImpl implements ProductDao{

	@PersistenceUnit
	EntityManagerFactory factory;
	
	@Override
	public boolean addproduct(ProductBean bean) {
		EntityManager manager=factory.createEntityManager();
		EntityTransaction trans=manager.getTransaction();
		trans.begin();
		try {
			
			manager.persist(bean);
			trans.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean deleteproduct(int id) {
		EntityManager manager=factory.createEntityManager();
		EntityTransaction trans=manager.getTransaction();
		trans.begin();
		ProductBean bean=manager.find(ProductBean.class, id);
		if(bean!=null)
		{
		manager.remove(bean);
		trans.commit();
		return true;
		}
		return false;
	}

	@Override
	public boolean modifyproduct(ProductBean bean) {
		EntityManager manager=factory.createEntityManager();
		EntityTransaction tx=manager.getTransaction();
		tx.begin();
		if(bean!=null)
		{
		ProductBean product=manager.find(ProductBean.class, bean.getId());
		product.setName(bean.getName());
		product.setCompany(bean.getCompany());
		product.setPrice(bean.getPrice());
		product.setQuantity(bean.getQuantity());
		product.setCategory(bean.getCategory());
		
		tx.commit();
		return true;
		}
		else
		{
			return false;
		}
		}

	@Override
	public boolean addproducttocart(OrderBean bean) {
		EntityManager manager=factory.createEntityManager();
		EntityTransaction trans=manager.getTransaction();
		trans.begin();
		try {
			
			manager.persist(bean);
			trans.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public List<ProductBean> getAllDetails() {
		EntityManager manager=factory.createEntityManager();
		EntityTransaction tx=manager.getTransaction();
		String jpql="from ProductBean";
		Query query=manager.createQuery(jpql,ProductBean.class);
		List<ProductBean> list=query.getResultList();
		return list;
		}

	@Override
	public List<OrderBean> viewCart() {
		EntityManager manager=factory.createEntityManager();
		EntityTransaction tx=manager.getTransaction();
		String jpql="from OrderBean";
		Query query=manager.createQuery(jpql,OrderBean.class);
		List<OrderBean> list=query.getResultList();
		return list;
		}

	
	
	
}

