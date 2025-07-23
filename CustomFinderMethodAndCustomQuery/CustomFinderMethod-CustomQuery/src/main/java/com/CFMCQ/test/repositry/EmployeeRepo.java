package com.CFMCQ.test.repositry;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.CFMCQ.test.entity.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
	
	public List<Employee> findByEmailAndPassword(String email, String password);
	
	@Query(value = "SELECT * FROM employee", nativeQuery = true)
	public List<Employee> getAllEmp();

	
	@Query(value = "SELECT * FROM employee WHERE name = :name and password=:pass", nativeQuery = true)
	public List<Employee> getEmpByname(@Param("name") String name,@Param("pass")String password);


}



