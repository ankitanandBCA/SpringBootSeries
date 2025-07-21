package com.LoginReg.crud.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.LoginReg.crud.entity.Users;

@Repository
public interface UserRepo extends JpaRepository<Users, String>  {

}
