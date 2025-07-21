package com.LoginReg.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.LoginReg.crud.entity.Users;
import com.LoginReg.crud.request.LoginRequest;
import com.LoginReg.crud.service.UserService;

@RestController
public class UserController {
	@Autowired
	UserService userservice;
	
	@PostMapping("/add")
	@CrossOrigin(origins = "http://127.0.0.1:5500")
	public Users addusers(@RequestBody Users user)
	{
		return userservice.adduser(user);
	}

	
	@PostMapping("/loginUser")
	@CrossOrigin(origins = "http://127.0.0.1:5500")
	public Boolean loginUser(@RequestBody LoginRequest loginRequest) {
		return userservice.loginUser(loginRequest);
		
   }
	
	

}
