package com.ustglobal.lms.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ustglobal.lms.dto.BookBean;
import com.ustglobal.lms.dto.LibraryResponse;
import com.ustglobal.lms.dto.LibrerianBean;
import com.ustglobal.lms.dto.StudentBean;
import com.ustglobal.lms.service.LibraryServiceImpl;


@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class LibraryController {
	@Autowired
	private LibraryServiceImpl service;
	@Autowired
	private LibraryResponse resp;

	@PostMapping(path="/registerstud",consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public LibraryResponse registerStudent(@RequestBody StudentBean bean) {
		if(service.registerStudent(bean)) {
			resp.setStatusCode(201);
			resp.setMessage("success");
			resp.setDescription("Student Register");
		} else {
			resp.setStatusCode(501);
			resp.setMessage("Failure");
			resp.setDescription("Student not register");
		}
		return resp;
	}

	@PostMapping(path="/registerlib",consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public LibraryResponse registerLib(@RequestBody LibrerianBean bean) {
		if(service.registerLibrerian(bean)) {
			resp.setStatusCode(201);
			resp.setMessage("success");
			resp.setDescription("Librerian Register");
		} else {
			resp.setStatusCode(501);
			resp.setMessage("Failure");
			resp.setDescription("Librerian not register");
		}
		return resp;
	}

	@PostMapping(path="/addbook",consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public LibraryResponse addBook(@RequestBody BookBean bean) {
		if(service.addBook(bean)) {
			resp.setStatusCode(201);
			resp.setMessage("success");
			resp.setDescription("New Book Added");
		} else {
			resp.setStatusCode(501);
			resp.setMessage("Failure");
			resp.setDescription("Can't add this book");
		}
		return resp;
	}

	@GetMapping(path="/searchbook",produces = MediaType.APPLICATION_JSON_VALUE)
	public LibraryResponse searchBook(@RequestParam("id")int id) {
			BookBean bean = service.searchBook(id);
		if(bean!=null) {
			resp.setStatusCode(201);
			resp.setMessage("success");
			resp.setDescription("Book available");
			resp.setBook(Arrays.asList(bean));
		} else {
			resp.setStatusCode(501);
			resp.setMessage("Failure");
			resp.setDescription("Book not available");
		}
		return resp;
	}

	@PutMapping(path="/updatebook",consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public LibraryResponse updateBook(@RequestBody BookBean bean) {
		if(service.updatebook(bean)) {
			resp.setStatusCode(201);
			resp.setMessage("success");
			resp.setDescription("Book information update");
		} else {
			resp.setStatusCode(501);
			resp.setMessage("Failure");
			resp.setDescription("Book information not updated");
		}
		return resp;
	}
	
	@DeleteMapping(path="/delete",produces = MediaType.APPLICATION_JSON_VALUE)
	public LibraryResponse deleteBook(@RequestParam("id")int id) {
		if(service.deletebook(id)) {
			resp.setStatusCode(201);
			resp.setMessage("success");
			resp.setDescription("Book information deleted");
		} else {
			resp.setStatusCode(401);
			resp.setMessage("Failure");
			resp.setDescription("Book not found");
		}
		return resp;
	}
	
	@PostMapping(path = "student/login", consumes = MediaType.APPLICATION_JSON_VALUE,
					produces = MediaType.APPLICATION_JSON_VALUE)
	public LibraryResponse studentLogin(@RequestBody StudentBean bean) {
		LibraryResponse libraryResponse = new LibraryResponse();
		StudentBean studentBean = service.loginStudent(bean);
		if(studentBean != null ) {
			libraryResponse.setStatusCode(201);
			libraryResponse.setMessage("Success");
			libraryResponse.setDescription("Login Successfull");
		} else {
			libraryResponse.setStatusCode(401);
			libraryResponse.setMessage("Failure");
			libraryResponse.setDescription("Enter Valid rollno And Password");
		}
		
		return libraryResponse;
		
	}
	
	@PostMapping(path = "librarian/login", consumes = MediaType.APPLICATION_JSON_VALUE,
						produces = MediaType.APPLICATION_JSON_VALUE)
	public LibraryResponse librarianLogin(@RequestBody LibrerianBean bean) {
	
		LibraryResponse libraryResponse = new LibraryResponse();
		LibrerianBean librerianBean = service.loginLibrerian(bean);
		
		if(librerianBean != null) {
			libraryResponse.setStatusCode(201);
			libraryResponse.setMessage("Success");
			libraryResponse.setDescription("Login Successfully");
			
		} else {
			
			libraryResponse.setStatusCode(401);
			libraryResponse.setMessage("Failure");
			libraryResponse.setDescription("Enter Valid id and password");
		}
		return  libraryResponse;
	}
	
	@GetMapping(path = "/show",
			produces = MediaType.APPLICATION_JSON_VALUE)
	public LibraryResponse showAllBook() {
		LibraryResponse response = new LibraryResponse();
		List<BookBean> beans =	service.showAllBook();
		if(!beans.isEmpty()) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Data Found in the DB");
			response.setBook(beans);
		}else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Data Not Found in the DB");
			
		}
		
		return response;
	
	}

}