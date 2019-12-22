package com.ustglobal.assesment.dto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.assesment.dao.ProductDAO;
import com.ustglobal.assesment.dto.Product;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDAO dao;
	
	@Override
	public boolean addProduct(Product product) {
		return dao.addProduct(product);
	}

	@Override
	public boolean modifyProduct(Product product) {
		return dao.modifyProduct(product);
	}

	@Override
	public Product getProductByName(String name) {
		return dao.getProductByName(name);
	}

	@Override
	public List<Product> getProductByCategory(String category) {
		return dao.getProductByCategory(category);
	}

	@Override
	public List<Product> getproductbyCompany(String company) {
		return dao.getproductbyCompany(company);
	}

	@Override
	public boolean generateBill(List<Product> beans, double total_price, double price_with_gst) {
		return dao.generateBill(beans, total_price, price_with_gst);
	}

}
