package com.companyname.backend.facade;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.companyname.backend.models.EmployeeModel;
import com.companyname.backend.services.EmployeeService;

@Component
public class EmployeeFacade {

	@Autowired
	EmployeeService employeeService;
	
	public void addEmployee(EmployeeModel employeeModel)
	{
		employeeService.save(employeeModel);
	}
	
	public List<EmployeeModel> getAllEmployees()
	{
		return employeeService.getAllEmployees();
	}
}