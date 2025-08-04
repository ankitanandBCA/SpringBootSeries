package com.practics.example.controller;

import com.practics.example.entity.UserInfo;
import com.practics.example.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
public class UserInfoController {
@Autowired
    UserInfoService
    userInfoService;



@PostMapping("/upload")
@CrossOrigin(origins = "http://127.0.0.1:5500")

    public UserInfo addUser(
            @RequestParam("name") String name,
            @RequestParam("email") String email,
            @RequestParam("mobile") String mobile,
            @RequestParam("image") MultipartFile image
    ) {
try{
    byte[] imagebyte=image.getBytes();
    UserInfo userInfo=new UserInfo();
    userInfo.setName(name);
    userInfo.setEmail(email);
    userInfo.setMobilenumber(Long.parseLong(mobile));
    userInfo.setImage(imagebyte);

    return userInfoService.add(userInfo);


} catch (Exception e) {
    throw new RuntimeException(e);
}

    }
}
