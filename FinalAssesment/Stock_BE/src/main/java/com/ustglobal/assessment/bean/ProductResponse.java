package com.ustglobal.assessment.bean;

import java.util.List;

public class ProductResponse {

	private int statusCode;

	private String message;

	private String description;
	
	private List<ProductBean> productBean;
    
	private List<OrderBean> orderBean;
	public List<OrderBean> getOrderBean() {
		return orderBean;
	}

	public void setOrderBean(List<OrderBean> orderBean) {
		this.orderBean = orderBean;
	}

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<ProductBean> getProductBean() {
		return productBean;
	}

	public void setProductBean(List<ProductBean> productBean) {
		this.productBean = productBean;
	}
	
	
}
