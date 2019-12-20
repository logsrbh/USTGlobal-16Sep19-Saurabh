package com.ustglobal.assessment.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Order_Info")
public class OrderBean {
	@Column
	@Id
	@GeneratedValue
    private int oid;
	
	@Column
	private double price;
	
	@Column
	private double total_price_with_gst;

	public int getOid() {
		return oid;
	}

	public void setOid(int oid) {
		this.oid = oid;
	}

	public double getTotal_price() {
		return price;
	}

	public void setTotal_price(double price) {
		this.price = price;
	}

	public double getTotal_price_with_gst() {
		return total_price_with_gst;
	}

	public void setTotal_price_with_gst(double total_price_with_gst) {
		this.total_price_with_gst = total_price_with_gst;
	}

}
