package com.practics.example.service;

import com.practics.example.entity.UserInfo;
import com.practics.example.repositry.UserInfoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserInfoService {

    @Autowired
    UserInfoRepo userInfoRepo;

    public UserInfo add(UserInfo userInfo)
    {
        return userInfoRepo.save(userInfo);
    }
}
