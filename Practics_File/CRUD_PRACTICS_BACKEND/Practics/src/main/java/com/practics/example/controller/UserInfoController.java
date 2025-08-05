package com.practics.example.controller;

import com.practics.example.entity.UserInfo;
import com.practics.example.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
public class UserInfoController {

    @Autowired
    UserInfoService userInfoService;

    @PostMapping("/upload")
    @CrossOrigin(origins = "http://127.0.0.1:5500")
    public UserInfo add(
            @RequestParam("name")String name,
            @RequestParam("email")String email,
            @RequestParam("mobile")String mobilenumber,
            @RequestParam("image")MultipartFile image
            ){

      try{
          byte[] imagebyte=image.getBytes();
          UserInfo userInfo=new UserInfo();
          userInfo.setName(name);
          userInfo.setEmail(email);
          userInfo.setMobilenumber(Long.parseLong(mobilenumber));
          userInfo.setImage(imagebyte);

          return userInfoService.addUserInfo(userInfo);

      } catch (Exception e) {
          throw new RuntimeException(e);
      }

    }


    @GetMapping("/views")
    @CrossOrigin(origins = "http://127.0.0.1:5500")
    public List<UserInfo> getdata()
    {
        return userInfoService.getAllData();
    }

    @DeleteMapping("/delete/{userid}")
    @CrossOrigin(origins = "http://127.0.0.1:5500")
    public Boolean deletedatas(@PathVariable int userid)
    {
        userInfoService.deletedata(userid);
        return true;
    }


    // update data

    @PutMapping("/update/{id}")
    @CrossOrigin(origins = "http://127.0.0.1:5500")
    public UserInfo updateById(
            @PathVariable int id,
            @RequestParam("name") String name,
            @RequestParam("email") String email,
            @RequestParam("mobilenumber") long mobilenumber,
            @RequestParam(value = "image", required = false) MultipartFile image
    ) {
        try {
            UserInfo userData = new UserInfo();
            userData.setName(name);
            userData.setEmail(email);
            userData.setMobilenumber(mobilenumber);

            if (image != null && !image.isEmpty()) {
                userData.setImage(image.getBytes());
            }

            return userInfoService.updateById(id, userData);
        } catch (Exception e) {
            throw new RuntimeException("Update failed", e);
        }
    }





}
