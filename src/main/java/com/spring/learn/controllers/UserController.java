package com.spring.learn.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.spring.learn.user.User;
import com.spring.learn.user.UserDaoService;


@RestController
public class UserController {
	
	
	@Autowired
	UserDaoService userDao;  
	
	@GetMapping("/users")
	public List<User> retriveAllUsers() {
		return userDao.findAllUser();
	}
	
	@GetMapping("/user/{id}")
	public User retriveUserById(@PathVariable int id) {
		return userDao.findUserById(id);
	}
	
	@GetMapping("/user/stream/{id}")
	public User retriveUserByIdAndStram(@PathVariable int id) {
		return userDao.findUserById(id);
	}

}
