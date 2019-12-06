package com.ustglobal.springboot.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ustglobal.springboot.dto.EmployeeBean;
import com.ustglobal.springboot.dto.EmployeeResponse;
import com.ustglobal.springboot.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService service;

	@PostMapping(path="/add", 
					consumes = MediaType.APPLICATION_JSON_VALUE,
					produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse addEmployee(@RequestBody EmployeeBean bean) {

		EmployeeResponse response = new EmployeeResponse();
		if(service.addEmployee(bean)) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Data Added to the DB");
		}else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Data Not Added to the DB");
		}
		return response;

	}//end of addEmployee

	@PutMapping(path = "/modify", 
					consumes = MediaType.APPLICATION_JSON_VALUE,
					produces = MediaType.APPLICATION_JSON_VALUE)
	public boolean modifyEmployee(@RequestBody EmployeeBean bean) {
		EmployeeResponse response = new EmployeeResponse();
		if(service.modifyEmployee(bean)) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Data Modified in the DB");
			
		}else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Data Not Modified in the DB");
		}
		return service.modifyEmployee(bean);
	
	}//end of modifyEmployee()


	@DeleteMapping(path="/delete/{id}",
						produces = MediaType.APPLICATION_JSON_VALUE )
	public EmployeeResponse deleteEmployee(@PathVariable("id")int id) {
		EmployeeResponse response = new EmployeeResponse();
		if(service.deleteEmployee(id)) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Data Modified in the DB");
			
		}else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Data Not Modified in the DB");
		}
		return response;
		

	}//end of deleteEmployee

	
	@GetMapping(path = "/get",
					produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse getEmployee(@RequestParam("id")int id) {
		
		EmployeeResponse response = new EmployeeResponse();
		EmployeeBean bean =	service.getEmployee(id);
		if(bean!=null) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Data Found in the DB");
			response.setEmployeeBeans(Arrays.asList(bean));
		}else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Data Not Found in the DB");
			
		}
		
		return response;

	}//end of getEmployee()

	
	@GetMapping(path = "/get-all",
					produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse getAllEmployee() {
		EmployeeResponse response = new EmployeeResponse();
		List<EmployeeBean> beans =	service.getAllEmployee();
		if(!beans.isEmpty()) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Data Found in the DB");
			response.setEmployeeBeans(beans);
		}else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Data Not Found in the DB");
			
		}
		
		return response;
		

	}//end of getAllEmployee()
	
	@GetMapping(path = "/exce", produces = MediaType.APPLICATION_JSON_VALUE )
	public void createException() {
		int i = 1/0;
	}

}//end of EmployeeController
