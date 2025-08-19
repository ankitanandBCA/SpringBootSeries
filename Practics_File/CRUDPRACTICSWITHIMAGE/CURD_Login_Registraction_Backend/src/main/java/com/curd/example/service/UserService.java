package com.curd.example.service;

import com.curd.example.entity.User;
import com.curd.example.repositry.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepo userRepo;
    public User add(User user)
    {
        return userRepo.save(user);
    }

    public List<User> getall()
    {
        return userRepo.findAll();
    }

    public Boolean deletedata(int id)
    {
        userRepo.deleteById(id);
        return true;
    }








}
