package com.LoginReg.crud.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.LoginReg.crud.entity.Users;
import com.LoginReg.crud.repo.UserRepo;
import com.LoginReg.crud.request.LoginRequest;

@Service
public class UserService {
	
	@Autowired
	UserRepo userrepo;
	
	public Users adduser(Users user)
	{
		return userrepo.save(user);
		
	}
	
public Boolean loginUser(LoginRequest loginRequest) {
		
		Optional<Users> user = userrepo.findById(loginRequest.getUserId());
		Users user1 = user.get();
		
		if(user1 == null) {
			return false;
		}
		
		
		
		if(!user1.getPassword().equals(loginRequest.getPassword())) {
			return false;
		}
		
		return true;
		
		
		
	}
	

}
