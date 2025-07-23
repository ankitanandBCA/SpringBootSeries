package com.CFMCQ.test.entity;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Admin {
	@Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String email;
	private String password;

}
