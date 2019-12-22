package com.ustglobal.assesment.dto.service;

import com.ustglobal.assesment.dto.User;

public interface UserService {

	public boolean register(User user);

	public User login(User user);

}
