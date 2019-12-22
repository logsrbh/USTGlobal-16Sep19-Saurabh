package com.ustglobal.lms.service;

import java.util.List;

import com.ustglobal.lms.dto.BookBean;
import com.ustglobal.lms.dto.LibrerianBean;
import com.ustglobal.lms.dto.StudentBean;

public interface LibraryService {
	public StudentBean loginStudent(StudentBean studentBean);
	public LibrerianBean loginLibrerian(LibrerianBean librerianBean);
	public boolean registerStudent(StudentBean bean);
	public boolean registerLibrerian(LibrerianBean bean);
	public BookBean searchBook(int id);
	public boolean addBook(BookBean bean);
	public boolean updatebook(BookBean bean);
	public boolean deletebook(int id);
	public List<BookBean> showAllBook();
	
}
