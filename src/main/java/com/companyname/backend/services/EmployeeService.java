package com.companyname.backend.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.companyname.backend.entities.Employee;
import com.companyname.backend.models.EmployeeModel;
import com.companyname.backend.repositories.employee.EmployeeRepo;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepo employeeRepo;

	public void save(EmployeeModel employeeModel) {
		employeeRepo.saveAndFlush(mapFromModelToEntity(employeeModel));
	}

	public List<EmployeeModel> getAllEmployees() {
		List<EmployeeModel> employeeModelList = new ArrayList<EmployeeModel>();
		List<Employee> employeeList = employeeRepo.findAll();

		for (Employee employee : employeeList) {
			employeeModelList.add(mapFromEntityToModel(employee));
		}
		return employeeModelList;
	}

	EmployeeModel mapFromEntityToModel(Employee employeeEntity) {
		return new EmployeeModel(employeeEntity.getEmployeeId(),
				employeeEntity.getEmployeeName(), employeeEntity.getSalary());
	}

	Employee mapFromModelToEntity(EmployeeModel employeeModel) {
		return new Employee(employeeModel.getEmployeeId(),
				employeeModel.getEmployeeName(), employeeModel.getSalary());
	}

}
