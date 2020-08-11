package com.neuedu.his.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neuedu.his.model.bean.User;
import com.neuedu.his.model.service.UserService;

@CrossOrigin
@RestController
public class LoginController {

	@Autowired
	private UserService userservice;
	
	@RequestMapping("login")
	public String login(User user,HttpSession session) {
		User loginUser = userservice.login(user);
		if(loginUser == null) {
			return "{\"result\":\"failure\"}";
		}else {
			return "{\"userid\":\""+loginUser.getUserid()+"\"}";
		}
		
		
	}
}
