package com.ustglobal.assesment.dto.service;

import java.util.List;

import com.ustglobal.assesment.dto.Product;

public interface ProductService {

	public boolean addProduct(Product product);

	public boolean modifyProduct(Product product);

	public Product getProductByName(String name);

	public List<Product> getProductByCategory(String category);

	public List<Product> getproductbyCompany(String company);
	
	public boolean generateBill(List<Product> beans,double total_price,double price_with_gst);
}
