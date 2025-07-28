package com.imageuploding.example.controller;

import com.imageuploding.example.entity.Image;
import com.imageuploding.example.repositry.ImageRepo;
import com.imageuploding.example.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.*;

@RestController
public class ImageController {

    @Autowired
    ImageService imageService;

    @Autowired
    ImageRepo imageRepo;

    @PostMapping("/uploadimage")
    @CrossOrigin(origins = "http://127.0.0.1:5500")
    public ResponseEntity<?> Add(@RequestParam ("name")String name, @RequestParam("pimage")MultipartFile pimage)
    {
        try{
            ResponseEntity<Image> ok = ResponseEntity.ok(imageService.saveimage(name, pimage));
            System.out.println("image uplode successfully ");
            return ok;
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }
    @GetMapping("/getall")
    @CrossOrigin(origins = "http://127.0.0.1:5500")
    public ResponseEntity<List<Map<String, Object>>> getAllImages() {
        List<Image> images = imageRepo.findAll();
        List<Map<String, Object>> result = new ArrayList<>();

        for (Image img : images) {
            Map<String, Object> map = new HashMap<>();
            map.put("id", img.getId());
            map.put("name", img.getName());
            map.put("pimage", Base64.getEncoder().encodeToString(img.getPimage())); // 👈 base64 string
            result.add(map);
        }

        return ResponseEntity.ok(result);
    }

}





