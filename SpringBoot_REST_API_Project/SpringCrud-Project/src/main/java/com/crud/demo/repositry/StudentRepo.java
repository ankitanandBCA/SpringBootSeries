package com.crud.demo.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crud.demo.entity.Students;

@Repository
public interface StudentRepo extends JpaRepository<Students, Integer> {

}
