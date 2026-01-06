package com.security.Controllers;

import com.security.Entity.User;
import com.security.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;


@GetMapping("/home")
    public  String home()
    {
        return "this is home page";
    }


    

    @GetMapping("/Allusers")
    public List<User> fetchalluser() {
        return userService.getAllUser();
    }

    @GetMapping("/users/{username}")
    public User returnbyusername(@PathVariable String username) {
        return userService.getUserById(username);
    }

    @PostMapping("/users")
    public User add(@RequestBody User u) {
        return userService.adduser(u);
    }
}

