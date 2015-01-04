package com.companyname.backend.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.companyname.backend.entities.Employee;

@Repository
public interface EmployeeRepo extends CommonJPARepository<Employee, String> {

	@Query(value = "From Employee")
	List<Employee> findAll();

}
