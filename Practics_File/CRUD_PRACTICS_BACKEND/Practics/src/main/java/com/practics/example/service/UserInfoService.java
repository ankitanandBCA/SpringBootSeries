package com.practics.example.service;

import com.practics.example.entity.UserInfo;
import com.practics.example.repositry.UserInfoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserInfoService {

    @Autowired
    UserInfoRepo userInfoRepo;

    public UserInfo addUserInfo(UserInfo userInfo)
    {
        return userInfoRepo.save(userInfo);
    }


    public List<UserInfo> getAllData(){
        return userInfoRepo.findAll();
    }

    public Boolean deletedata(int userid)
    {
        userInfoRepo.deleteById(userid);
        return true;
    }

// update data

    public UserInfo updateById(int userid, UserInfo newData) {
        UserInfo existingUser = userInfoRepo.findById(userid).orElse(null);

        if (existingUser != null) {
            existingUser.setName(newData.getName());
            existingUser.setEmail(newData.getEmail());
            existingUser.setMobilenumber(newData.getMobilenumber());

            if (newData.getImage() != null) {
                existingUser.setImage(newData.getImage());
            }

            return userInfoRepo.save(existingUser);
        } else {
            return null;
        }
    }







}
