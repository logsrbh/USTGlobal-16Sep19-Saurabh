package com.ustglobal.lms.dto;



import java.util.List;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class LibraryResponse {
	private int statusCode;
	private String message;
	private String description;
	private List<BookBean> book;
}
