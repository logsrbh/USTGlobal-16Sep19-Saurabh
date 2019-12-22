package com.ustglobal.assesment.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.ustglobal.assesment.dto.Order;
import com.ustglobal.assesment.dto.Product;

@Repository
public class ProductDaoImpl implements ProductDAO {

	@PersistenceUnit
	private EntityManagerFactory factory;

	@Override
	public boolean addProduct(Product product) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			manager.persist(product);
			transaction.commit();
			return true;
		} catch (Exception e) {
			return false;
		}
	}// end of addproduct()

	@Override
	public boolean modifyProduct(Product product) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			Product prod = manager.find(Product.class, product.getId());
			prod.setName(product.getName());
			prod.setPrice(product.getPrice());
			prod.setCategory(product.getCategory());
			prod.setQuantity(product.getQuantity());
			prod.setCompany(product.getCompany());
			transaction.commit();
			return true;
		} catch (Exception e) {
			return false;
		}
	}// end of modifyproduct()

	@Override
	public Product getProductByName(String name) {
		EntityManager manager = factory.createEntityManager();
		try {
			String jpql = "from Product where name=:name";
			TypedQuery<Product> typedQuery = manager.createQuery(jpql, Product.class);
			typedQuery.setParameter("name", name);
			Product product = typedQuery.getSingleResult();
			return product;
		} catch (Exception e) {
			return null;
		}
	}// end of getProductByName()

	@Override
	public List<Product> getProductByCategory(String category) {
		EntityManager manager = factory.createEntityManager();
		String jpql = "from Product where category=:category";
		TypedQuery<Product> typedQuery = manager.createQuery(jpql, Product.class);
		typedQuery.setParameter("category", category);
		return typedQuery.getResultList();

	}// end of getProductByCategory()

	@Override
	public List<Product> getproductbyCompany(String company) {
		EntityManager manager = factory.createEntityManager();
		String jpql = "from Product where company=:company";
		TypedQuery<Product> typedQuery = manager.createQuery(jpql, Product.class);
		typedQuery.setParameter("company", company);
		return typedQuery.getResultList();

	}// end of getProductByCompany()

	@Override
	public boolean generateBill(List<Product> beans, double total_price, double price_with_gst) {
//		EntityManager manager = factory.createEntityManager();
//		EntityTransaction transaction = manager.getTransaction();
//		transaction.begin();
//		try {
//			for (Product productBean : beans) {
//				Product bean= manager.find(Product.class, productBean.getId());
//				int quantity = bean.getQuantity();
//				bean.setQuantity(quantity-1);
//				System.out.println(quantity);
//			}
//			Order oBean = new Order();
//			oBean.set;
//			oBean.setTotal_price(total_price);
//			oBean.setTotal_price_with_gst(total_with_gst);
//			manager.persist(oBean);
//			transaction.commit();
//			return true;
//		} catch (Exception e) {
//			e.printStackTrace();
//			return false;
//		}
		return true;
	}

}// end of class
