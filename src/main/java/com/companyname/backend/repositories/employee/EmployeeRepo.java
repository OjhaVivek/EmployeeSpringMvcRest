package com.companyname.backend.repositories.employee;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.companyname.backend.entities.Employee;
import com.companyname.backend.repositories.common.CommonJPARepository;

@Repository
public interface EmployeeRepo extends CommonJPARepository<Employee, String> {

	@Query(value = "From Employee")
	List<Employee> findAll();

	
}
