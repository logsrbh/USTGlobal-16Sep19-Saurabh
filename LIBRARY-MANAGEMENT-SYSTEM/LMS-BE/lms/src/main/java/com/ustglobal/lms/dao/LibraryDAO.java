package com.ustglobal.lms.dao;

import java.util.List;

import com.ustglobal.lms.dto.BookBean;
import com.ustglobal.lms.dto.LibrerianBean;
import com.ustglobal.lms.dto.StudentBean;

public interface LibraryDAO {
	public StudentBean loginStudent(StudentBean bean);
	public LibrerianBean loginLibrerian(LibrerianBean librerianBean);
	public boolean registerStudent(StudentBean bean);
	public boolean registerLibrerian(LibrerianBean bean);
	public BookBean searchBook(int id);
	public boolean addBook(BookBean bean);
	public boolean updatebook(BookBean bean);
	public boolean deletebook(int id);
	public List<BookBean> showAllBook();
}
