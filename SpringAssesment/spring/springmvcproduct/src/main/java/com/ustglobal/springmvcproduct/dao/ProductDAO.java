package com.ustglobal.springmvcproduct.dao;

import java.util.List;

import com.ustglobal.springmvcproduct.bean.OrderProduct;
import com.ustglobal.springmvcproduct.bean.Product;
import com.ustglobal.springmvcproduct.bean.User;

public interface ProductDAO {
	public User login(String email,String password);
	public boolean register(User user);
	public Product search(String pname);
	public boolean updatePassword(String email,String password);
	public List<OrderProduct> getProducts(String email);
	public boolean buyProduct(OrderProduct orderProduct);
}
