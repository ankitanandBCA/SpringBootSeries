package com.uploading.example.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "users")  // "user" reserved hai, isliye plural use kar rahe hain
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;

    @Column(name = "description")  // "desc" ko "description" column bana diya
    private String description;

    @Lob
    @Column(name = "file", columnDefinition = "LONGBLOB")
    private byte[] file;

    public User() {}

    public User(int userId, String description, byte[] file) {
        this.userId = userId;
        this.description = description;
        this.file = file;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public byte[] getFile() {
        return file;
    }

    public void setFile(byte[] file) {
        this.file = file;
    }
}
