package com.practics.example.service;

import com.practics.example.entity.User;
import com.practics.example.repositry.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

@Autowired
    UserRepo userRepo;

public User adduser(User u)
{
   return userRepo.save(u);
}

public User loginuser(String email,String password)
{
   return userRepo.findByEmailAndPassword(email,password);
}


}
