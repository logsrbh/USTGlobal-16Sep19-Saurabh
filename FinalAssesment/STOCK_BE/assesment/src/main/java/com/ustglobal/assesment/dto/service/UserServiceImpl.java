package com.ustglobal.assesment.dto.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.assesment.dao.UserDAO;
import com.ustglobal.assesment.dto.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO dao;

	@Override
	public boolean register(User user) {
		return dao.register(user);

	}

	@Override
	public User login(User user) {
		return dao.login(user);
	}

}
