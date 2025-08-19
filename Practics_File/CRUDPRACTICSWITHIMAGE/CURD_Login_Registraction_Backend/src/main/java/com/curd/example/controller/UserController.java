package com.curd.example.controller;

import com.curd.example.entity.User;
import com.curd.example.repositry.UserRepo;
import com.curd.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:5500")
public class UserController
{
    @Autowired
    UserService userService;

    @Autowired
    UserRepo userRepo;

    @PostMapping("/register")
    public User adduser(@RequestParam("name")String name,
                        @RequestParam("email")String email,
                        @RequestParam("file")MultipartFile file,
                        @RequestParam("password")String password
                        ) throws IOException {
        byte[] imagebyte=file.getBytes();

        User user=new User();
        user.setName(name);
        user.setEmail(email);
        user.setFile(imagebyte);
        user.setPassword(password);

        return userService.add(user);
    }


    @GetMapping("/allDatas")
    public List<User> getdata(){
        return userService.getall();
    }


    @DeleteMapping("/delete/{id}")
    public Boolean deletedatas(@PathVariable int id)
    {
        userService.deletedata(id);
        return true;
    }






// update data
/*
    @PutMapping("/update")
    public User up(@RequestBody User user)
    {
        return userService.updateUsers(user);

    }
*/
@PutMapping("/update/{id}")
public ResponseEntity<User> up(@PathVariable int id, @RequestBody User user) {
    user.setId(id); // ensure id set ho
    User updatedUser = userService.updateUsers(user);
    return ResponseEntity.ok(updatedUser);
}



    


}

