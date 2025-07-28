package com.imageuploding.example.service;

import com.imageuploding.example.entity.Image;
import com.imageuploding.example.repositry.ImageRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Service
public class ImageService {

    @Autowired
    ImageRepo imageRepo;

    public Image saveimage(String name, MultipartFile Image) throws IOException
    {
        Image image=new Image();
        image.setName(name);
        image.setPimage(Image.getBytes());

          return imageRepo.save(image);
    }
}
