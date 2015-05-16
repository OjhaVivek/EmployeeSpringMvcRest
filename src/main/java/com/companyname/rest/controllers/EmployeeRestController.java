package com.companyname.rest.controllers;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.companyname.backend.facade.EmployeeFacade;
import com.companyname.backend.models.EmployeeModel;

@Controller
@RequestMapping(value = "/api/employee", produces = APPLICATION_JSON_VALUE)
public class EmployeeRestController {

	@Autowired
	EmployeeFacade employeeFacade;

	@ResponseBody
	@RequestMapping(value = "/{employeeId}", method = RequestMethod.GET)
	public ResponseEntity<EmployeeModel> getEmployeeById(
			@PathVariable("employeeId") Integer employeeId) {
		ResponseEntity<EmployeeModel> response = null;
		EmployeeModel fetchedEmployee = employeeFacade
				.getEmployeeByEmployeeId(employeeId);
		if (fetchedEmployee == null) {
			response = new ResponseEntity<EmployeeModel>(HttpStatus.NOT_FOUND);
		} else {
			response = new ResponseEntity<EmployeeModel>(fetchedEmployee,
					HttpStatus.OK);
		}
		return response;

	}

	@ResponseBody
	@RequestMapping(method = RequestMethod.PUT, consumes = "application/json")
	public ResponseEntity<EmployeeModel> UpdateEmployee(
			@RequestBody EmployeeModel employeeModel) {
		ResponseEntity<EmployeeModel> response = null;
		if (employeeModel.getEmployeeId() == null) {
			response = new ResponseEntity<EmployeeModel>(HttpStatus.BAD_REQUEST);
		} else {
			EmployeeModel tempEmployeeModel = employeeFacade
					.getEmployeeByEmployeeId(employeeModel.getEmployeeId());
			if (tempEmployeeModel != null) {
				tempEmployeeModel.setEmployeeName(employeeModel
						.getEmployeeName());
				tempEmployeeModel.setSalary(employeeModel.getSalary());
				EmployeeModel tEM = employeeFacade
						.addEmployee(tempEmployeeModel);
				if (tEM == null) {
					response = new ResponseEntity<EmployeeModel>(
							HttpStatus.INTERNAL_SERVER_ERROR);
				} else {
					response = new ResponseEntity<EmployeeModel>(tEM,
							HttpStatus.OK);
				}
			} else {
				response = new ResponseEntity<EmployeeModel>(
						HttpStatus.NOT_FOUND);
			}
		}
		return response;

	}

	@ResponseBody
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<EmployeeModel>> fetchEmployeeList() {
		ResponseEntity<List<EmployeeModel>> response = null;
		List<EmployeeModel> employeeList = employeeFacade.getAllEmployees();
		if (employeeList == null || employeeList.isEmpty()) {
			response = new ResponseEntity<List<EmployeeModel>>(
					HttpStatus.NOT_FOUND);
		} else {
			response = new ResponseEntity<List<EmployeeModel>>(employeeList,
					HttpStatus.OK);
		}
		return response;
	}

	@ResponseBody
	@RequestMapping(method = RequestMethod.POST, consumes = "application/json")
	public ResponseEntity<String> postEmployee(
			@RequestBody EmployeeModel employeeModel) {
		ResponseEntity<String> response = null;
		if (employeeModel.getEmployeeId() != null) {
			response = new ResponseEntity<String>(HttpStatus.BAD_REQUEST);
		} else {
			EmployeeModel tEM = employeeFacade.addEmployee(employeeModel);
			if (tEM == null) {
				response = new ResponseEntity<String>(
						HttpStatus.INTERNAL_SERVER_ERROR);
			} else {
				response = new ResponseEntity<String>("Successfully updated",
						HttpStatus.OK);
			}
		}
		return response;
	}

	// not doing anything
	@RequestMapping(value = "/{employeeId}", method = RequestMethod.DELETE)
	public Boolean deleteEmployee(@PathVariable("employeeId") Integer employeeId) {

		return null;

	}

}
