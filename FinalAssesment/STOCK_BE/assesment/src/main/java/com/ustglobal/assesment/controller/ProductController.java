package com.ustglobal.assesment.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ustglobal.assesment.dto.Product;
import com.ustglobal.assesment.dto.ProductResponse;
import com.ustglobal.assesment.dto.User;
import com.ustglobal.assesment.dto.service.ProductService;
import com.ustglobal.assesment.dto.service.UserService;

@RestController
@CrossOrigin(origins ="*", allowedHeaders = "*")
public class ProductController {

	@Autowired
	private ProductService service;

	@Autowired
	private UserService userservice;

	@PostMapping(path = "/add", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ProductResponse addProduct(@RequestBody Product product) {
		ProductResponse resp = new ProductResponse();
		if (service.addProduct(product)) {
			resp.setStatuscode(201);
			resp.setMessage("Sucess");
			resp.setDescription("Product Added");
		} else {
			resp.setStatuscode(401);
			resp.setMessage("Failed");
			resp.setDescription("Product Not Added");
		}
		return resp;

	}

	@PostMapping(path = "/modify", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ProductResponse modifyProduct(@RequestBody Product product) {
		ProductResponse resp = new ProductResponse();
		if (service.modifyProduct(product)) {
			resp.setStatuscode(201);
			resp.setMessage("Sucess");
			resp.setDescription("Product Updated");
		} else {
			resp.setStatuscode(401);
			resp.setMessage("Failed");
			resp.setDescription("Product Not Updated");
		}
		return resp;
	}

	@GetMapping(path = "/getbyname/{name}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ProductResponse getProductByName(@PathVariable("name") String name) {
		ProductResponse resp = new ProductResponse();
		Product product = service.getProductByName(name);
		if (product != null) {
			resp.setStatuscode(201);
			resp.setMessage("Sucess");
			resp.setDescription("Product Found");
			resp.setProducts(Arrays.asList(product));
		} else {
			resp.setStatuscode(401);
			resp.setMessage("Failed");
			resp.setDescription("Product Not Found");
		}
		return resp;
	}

	@GetMapping(path = "/getbycategory/{category}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ProductResponse getProductByCategory(@PathVariable("category") String category) {
		ProductResponse resp = new ProductResponse();
		List<Product> product = service.getProductByCategory(category);
		if (product != null) {
			resp.setStatuscode(201);
			resp.setMessage("Sucess");
			resp.setDescription("Product Found");
			resp.setProducts(product);
		} else {
			resp.setStatuscode(401);
			resp.setMessage("Failed");
			resp.setDescription("Product Not Found");
		}
		return resp;
	}

	@GetMapping(path = "/getbycompany/{company}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ProductResponse getProductByCompany(@PathVariable("company") String company) {
		ProductResponse resp = new ProductResponse();
		List<Product> product = service.getproductbyCompany(company);
		if (product != null) {
			resp.setStatuscode(201);
			resp.setMessage("Sucess");
			resp.setDescription("Product Found");
			resp.setProducts(product);
		} else {
			resp.setStatuscode(401);
			resp.setMessage("Failed");
			resp.setDescription("Product Not Found");
		}
		return resp;
	}

	@PostMapping(path = "/register", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ProductResponse userRegistration(@RequestBody User user) {
		ProductResponse resp = new ProductResponse();
		if (userservice.register(user)) {
			resp.setStatuscode(201);
			resp.setMessage("success");
			resp.setDescription("Registration Sucess");
		} else {
			resp.setStatuscode(401);
			resp.setMessage("Failed");
			resp.setDescription("Registration Failed");
		}
		return resp;
	}

	@PostMapping(path = "/login", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ProductResponse userLogin(@RequestBody User user) {
		ProductResponse resp = new ProductResponse();
		User user1 = userservice.login(user);
		if (user1 != null) {
			resp.setStatuscode(201);
			resp.setMessage("success");
			resp.setDescription("Login Sucess");
		} else {
			resp.setStatuscode(401);
			resp.setMessage("Failed");
			resp.setDescription("Login Failed");
		}
		return resp;
	}
}
