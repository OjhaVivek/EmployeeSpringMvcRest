package com.companyname.rest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.companyname.backend.facade.EmployeeFacade;
import com.companyname.backend.models.EmployeeModel;

@RestController
@RequestMapping("/api/employee")
public class EmployeeRestController {

	@Autowired
	EmployeeFacade employeeFacade;

	@RequestMapping(value = "/{employeeId}", method = RequestMethod.GET)
	public EmployeeModel getEmployeeById(@PathVariable("employeeId") Integer employeeId) {
		return employeeFacade.getEmployeeByEmployeeId(employeeId);

	}

	@RequestMapping(value = "/{employeeId}", method = RequestMethod.PUT, consumes = "application/json")
	public EmployeeModel UpdateEmployee(
			@RequestBody EmployeeModel employeeModel,
			@PathVariable("employeeId") Integer employeeId) {
		EmployeeModel tempEmployeeModel = employeeFacade
				.getEmployeeByEmployeeId(employeeId);
		if (tempEmployeeModel != null) {
			tempEmployeeModel.setEmployeeName(employeeModel.getEmployeeName());
			tempEmployeeModel.setSalary(employeeModel.getSalary());
			EmployeeModel tEM = employeeFacade.addEmployee(tempEmployeeModel);
			if (tEM == null) {
				return null;
			}
		}
		return tempEmployeeModel;

	}

	@RequestMapping(method = RequestMethod.GET)
	public List<EmployeeModel> fetchEmployeeList() {

		return employeeFacade.getAllEmployees();
	}

	@RequestMapping(method = RequestMethod.POST, consumes = "application/json")
	public Boolean postEmployee(@RequestBody EmployeeModel employeeModel) {

		if (employeeModel.getEmployeeId() != null) {
			return false;
		}
		EmployeeModel tEM = employeeFacade.addEmployee(employeeModel);
		if (tEM == null) {
			return false;
		}
		return true;
	}

	// not doing anything
	@RequestMapping(value = "/{employeeId}", method = RequestMethod.DELETE)
	public Boolean deleteEmployee(@PathVariable("employeeId") Integer employeeId) {

		return null;

	}

}
