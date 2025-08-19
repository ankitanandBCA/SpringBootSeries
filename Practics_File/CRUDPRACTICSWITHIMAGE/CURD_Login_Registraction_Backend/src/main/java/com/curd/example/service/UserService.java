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


/*
   public User updateUsers(User user)
   {
       Optional<User> user1 = userRepo.findById(user.getId());
       User user2 = user1.get();
       user2.setName(user.getName());
       user2.setEmail(user.getEmail());
       user2.setPassword(user.getPassword());

       return userRepo.save(user2);

   }


 */

    public User updateUsers(User u) {
        return userRepo.findById(u.getId())
                .map(existingUser -> {
                    existingUser.setName(u.getName());
                    existingUser.setEmail(u.getEmail());
                    existingUser.setPassword(u.getPassword());
                    return userRepo.save(existingUser);
                })
                .orElseThrow(() -> new RuntimeException("User not found with id: " + u.getId()));
    }






}

