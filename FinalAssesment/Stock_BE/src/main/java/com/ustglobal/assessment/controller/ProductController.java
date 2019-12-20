package com.ustglobal.assessment.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ustglobal.assessment.bean.OrderBean;
import com.ustglobal.assessment.bean.ProductBean;
import com.ustglobal.assessment.bean.ProductResponse;
import com.ustglobal.assessment.service.ProductDaoService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ProductController {

@Autowired
private ProductDaoService service;
	
@PostMapping(path="/addproduct",
consumes= {MediaType.APPLICATION_JSON_VALUE},
produces= {MediaType.APPLICATION_JSON_VALUE})
public ProductResponse add(@RequestBody ProductBean bean)
{
	ProductResponse response=new ProductResponse();
	if(service.addproduct(bean))
	{
		
		response.setMessage("Success");
		response.setDescription("Data Added succesfully!!!");
		response.setStatusCode(200);
		return response;
	}
	else
	{
		response.setMessage("Failure");
		response.setDescription("Data Not Added succesfully!!!");
		response.setStatusCode(400);
		return response;
	}
	
}
@PostMapping(path="/addproducttocart/{price}",
consumes= {MediaType.APPLICATION_JSON_VALUE},
produces= {MediaType.APPLICATION_JSON_VALUE})
public ProductResponse addproducttocart(@PathVariable("price")int price, OrderBean bean)
{
	ProductResponse response=new ProductResponse();
	bean.setTotal_price_with_gst(price+5);
	bean.setTotal_price(price);
	if(service.addproducttocart(bean))
	{
		
		response.setMessage("Success");
		response.setDescription("Data Added succesfully!!!");
		response.setStatusCode(200);
		return response;
	}
	else
	{
		response.setMessage("Failure");
		response.setDescription("Data Not Added succesfully!!!");
		response.setStatusCode(400);
		return response;
	}
	
}

@PostMapping(path="/modifyproduct",
consumes= {MediaType.APPLICATION_JSON_VALUE},
produces= {MediaType.APPLICATION_JSON_VALUE})
public ProductResponse modify(@RequestBody ProductBean bean)
{
	ProductResponse response=new ProductResponse();
	if(service.modifyproduct(bean))
	{
		
		response.setMessage("Success");
		response.setDescription("Data Added succesfully!!!");
		response.setStatusCode(200);
		return response;
	}
	else
	{
		response.setMessage("Failure");
		response.setDescription("Data Not Added succesfully!!!");
		response.setStatusCode(400);
		return response;
	}
	
}
@DeleteMapping(path="/delete/{id}",
consumes= {MediaType.APPLICATION_JSON_VALUE},
produces= {MediaType.APPLICATION_JSON_VALUE})
public ProductResponse remove(@PathVariable("id")int id )
{
	ProductResponse response=new ProductResponse();
	if(service.deleteproduct(id))
	{
		
		response.setMessage("Success");
		response.setDescription("Data Added succesfully!!!");
		response.setStatusCode(200);
		return response;
	}
	else
	{
		response.setMessage("Failure");
		response.setDescription("Data Not Added succesfully!!!");
		response.setStatusCode(400);
		return response;
	}
	
}
@GetMapping(path="/getallproducts",produces=MediaType.APPLICATION_JSON_VALUE)
public ProductResponse getAllDetails(){
	ProductResponse response=new ProductResponse();
	 List<ProductBean> list=service.getAllDetails();
	if(list!=null) {
		response.setStatusCode(200);
		response.setMessage("success");
		response.setDescription("all data fetched successfully");
		response.setProductBean(list);
	}
	else {
		response.setStatusCode(400);
		response.setMessage("Failure");
		response.setDescription("all data not fetched successfully");
	}
	return response;
	
	
}
@GetMapping(path="/viewcart",produces=MediaType.APPLICATION_JSON_VALUE)
public ProductResponse viewCart(){
	ProductResponse response=new ProductResponse();
	 List<OrderBean> list=service.viewCart();
	if(list!=null) {
		response.setStatusCode(200);
		response.setMessage("success");
		response.setDescription("all data fetched successfully");
		response.setOrderBean(list);
	}
	else {
		response.setStatusCode(400);
		response.setMessage("Failure");
		response.setDescription("all data not fetched successfully");
	}
	return response;
	
	
}

}
