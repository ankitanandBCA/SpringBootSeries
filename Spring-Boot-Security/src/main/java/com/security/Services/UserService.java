package com.security.Services;

import com.security.Entity.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    List<User> list = new ArrayList<>();

    public UserService() {
        list.add(new User("Ankit_Anand", "Ankit@1234", "ankit@gmail.com"));
        list.add(new User("Shreya_Shukla", "Shreya@1234", "shukla@gmail.com"));
        list.add(new User("Shreya_Chuhan", "Chuhan@1234", "chuhan@gmail.com"));
    }

    // get all users
    public List<User> getAllUser() {
        return list;
    }

    // get user by username
    public User getUserById(String username) {
        return list.stream()
                .filter(user -> user.getUsername().equals(username))
                .findFirst()
                .orElse(null);
    }

    // add new user
    public User adduser(User u) {
        list.add(u);
        return u;
    }
}
