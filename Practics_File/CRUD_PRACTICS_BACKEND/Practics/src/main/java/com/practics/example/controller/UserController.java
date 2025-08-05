package com.practics.example.controller;

import com.practics.example.entity.User;
import com.practics.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/add")
    @CrossOrigin(origins = "http://127.0.0.1:5500")
    public User addUsers(@RequestBody User u)
    {
        return  userService.adduser(u);
    }

    @PostMapping("/login")
    @CrossOrigin(origins="http://127.0.0.1:5500")
    public ResponseEntity<?> loginusers(@RequestBody User u)
    {
        String email=u.getEmail();
        String password=u.getPassword();

        User loginuser = userService.loginuser(email, password);

        if(loginuser!=null)
        {
            return  ResponseEntity.ok(loginuser);
        }else {
            return ResponseEntity.status(401).body("invalid details");
        }

    }



}
