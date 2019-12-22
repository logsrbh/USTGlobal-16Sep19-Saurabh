package com.ustglobal.lms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.lms.dao.LibraryDAO;
import com.ustglobal.lms.dto.BookBean;
import com.ustglobal.lms.dto.LibrerianBean;
import com.ustglobal.lms.dto.StudentBean;
@Service
public class LibraryServiceImpl implements LibraryService{
	
	@Autowired
	private LibraryDAO dao;
	@Override
	public StudentBean loginStudent(StudentBean studentBean) {
		return dao.loginStudent(studentBean);
	}

	@Override
	public LibrerianBean loginLibrerian(LibrerianBean librerianBean) {
		return dao.loginLibrerian(librerianBean);
	}

	@Override
	public boolean registerStudent(StudentBean bean) {
		return dao.registerStudent(bean);
	}

	@Override
	public boolean registerLibrerian(LibrerianBean bean) {
		return dao.registerLibrerian(bean);
	}

	@Override
	public BookBean searchBook(int id) {
		return dao.searchBook(id);
	}

	@Override
	public boolean addBook(BookBean bean) {
		return dao.addBook(bean);
	}

	@Override
	public boolean updatebook(BookBean bean) {
		return dao.updatebook(bean);
	}

	@Override
	public boolean deletebook(int id) {
		return dao.deletebook(id);
	}

	@Override
	public List<BookBean> showAllBook() {
		return dao.showAllBook();
	}

}
