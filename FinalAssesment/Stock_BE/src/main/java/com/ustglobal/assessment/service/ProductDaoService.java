package com.ustglobal.assessment.service;

import java.util.List;

import com.ustglobal.assessment.bean.OrderBean;
import com.ustglobal.assessment.bean.ProductBean;

public interface ProductDaoService {

	public boolean addproduct(ProductBean bean);

	public boolean deleteproduct(int id);

	public boolean modifyproduct(ProductBean bean);

	public boolean addproducttocart(OrderBean bean);

	public List<ProductBean> getAllDetails();

	public List<OrderBean> viewCart();

}
