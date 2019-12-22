package com.ustglobal.assesment.dao;

import com.ustglobal.assesment.dto.User;

public interface UserDAO {
	
	public boolean register(User user);
	
	public User login(User user);
	

}
