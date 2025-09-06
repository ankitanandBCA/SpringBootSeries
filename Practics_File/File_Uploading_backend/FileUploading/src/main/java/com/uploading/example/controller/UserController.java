package com.uploading.example.controller;

import com.uploading.example.entity.User;
import com.uploading.example.repositry.UserRepo;
import com.uploading.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:5500")
public class UserController {

    @Autowired
    UserService userService;

    @Autowired
    UserRepo userRepo;

    @PostMapping("/UploadFiles")
    public User Add(
            @RequestParam("desc")String desc,
            @RequestParam("file")MultipartFile file
            ) throws IOException {
             byte[] filebite= file.getBytes();

             User user=new User();
             user.setDescription(desc);
             user.setFile(filebite);

            return userService.addfile(user);
    }



    @GetMapping("/View")
    public List<User> findData()
    {
        return userService.view();
    }


    @GetMapping("/views/{id}")
    public ResponseEntity<byte[]> viewPdf(@PathVariable int id) {
        User notes = userService.getbyId(id);

        return ResponseEntity.ok()
                .header("Content-Type", "application/pdf")
                .header("Content-Disposition", "inline; filename=document.pdf")
                .body(notes.getFile());
    }



    @DeleteMapping("/delete/{id}")
    public Boolean deletedata(@PathVariable int id)
    {
        userRepo.deleteById(id);
        return true;
    }

}
