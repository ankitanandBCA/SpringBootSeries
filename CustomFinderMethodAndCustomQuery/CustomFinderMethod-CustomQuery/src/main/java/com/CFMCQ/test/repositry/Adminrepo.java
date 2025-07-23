package com.CFMCQ.test.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.CFMCQ.test.entity.Admin;
import com.CFMCQ.test.entity.Employee;

@Repository
public interface Adminrepo extends JpaRepository<Admin, Integer> {

}
