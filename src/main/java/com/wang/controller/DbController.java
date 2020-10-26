package com.wang.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wang.bean.User;
import com.wang.service.UserService;

@RestController
public class DbController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping("getUserList")
	public String getAllUser() {
		List<User> users=userService.queryAll();
		StringBuilder userstr=new StringBuilder();
		for(User user: users) {
			userstr.append(user.toString());
			userstr.append("	");
		}
		return userstr.toString();
	}
	
	@RequestMapping("getUserRole")
	public String getUserRole() {
		List<User> users=userService.getUserAndRoles("ping.xia");
		StringBuilder userstr=new StringBuilder();
		for(User user: users) {
			userstr.append(user.getRoledata());
			userstr.append("	");
		}
		return userstr.toString();
	}
}
