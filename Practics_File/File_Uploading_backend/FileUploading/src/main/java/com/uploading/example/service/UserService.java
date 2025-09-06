package com.uploading.example.service;

import com.uploading.example.entity.User;
import com.uploading.example.repositry.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepo userRepo;

    public User addfile(User user)
    {
        return userRepo.save(user);
    }


    public List<User> view()
    {
        return userRepo.findAll();
    }

    public User getbyId(int id)
    {
        return userRepo.findById(id).orElseThrow(() -> new RuntimeException("File Not Found"));
    }
}
