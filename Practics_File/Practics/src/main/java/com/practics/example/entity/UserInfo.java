package com.practics.example.entity;

import jakarta.persistence.*;

@Entity
public class UserInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String email;
    private long mobilenumber;
    @Lob
    @Column(name="image",columnDefinition = "LONGBLOB")
    private byte[] image;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getMobilenumber() {
        return mobilenumber;
    }

    public void setMobilenumber(long mobilenumber) {
        this.mobilenumber = mobilenumber;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }


    public UserInfo(String name, String email, long mobilenumber, byte[] image) {
        this.name = name;
        this.email = email;
        this.mobilenumber = mobilenumber;
        this.image = image;
    }

    public UserInfo()
    {

    }
}
