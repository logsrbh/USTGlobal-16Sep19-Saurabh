package com.ustglobal.assessment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.assessment.bean.OrderBean;
import com.ustglobal.assessment.bean.ProductBean;
import com.ustglobal.assessment.dao.ProductDao;

@Service
public class ProductDaoServiceImpl implements ProductDaoService{

	@Autowired
	private ProductDao dao;
	
	@Override
	public boolean addproduct(ProductBean bean) {
		return dao.addproduct(bean);
	}

	@Override
	public boolean deleteproduct(int id) {
		return dao.deleteproduct(id);
	}

	@Override
	public boolean modifyproduct(ProductBean bean) {
		return dao.modifyproduct(bean);
	}

	@Override
	public boolean addproducttocart(OrderBean bean) {
		return dao.addproducttocart(bean);
	}

	@Override
	public List<ProductBean> getAllDetails() {
		return dao.getAllDetails();
	}

	@Override
	public List<OrderBean> viewCart() {
		return dao.viewCart();
	}

}
