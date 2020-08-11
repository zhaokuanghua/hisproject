package com.neuedu.his.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neuedu.his.model.bean.User;
import com.neuedu.his.model.mapper.UserMapper;

@Service
public class UserService {

	@Autowired
	private UserMapper mapper;
	
	public User login(User user) {
		return mapper.login(user);
	}
}
