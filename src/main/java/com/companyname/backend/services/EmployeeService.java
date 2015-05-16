package com.companyname.backend.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.companyname.backend.entities.Employee;
import com.companyname.backend.models.EmployeeModel;
import com.companyname.backend.repositories.employee.EmployeeRepo;
import com.companyname.backend.specifications.EmployeeSpecifications;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepo employeeRepo;

	@Transactional
	public EmployeeModel save(EmployeeModel employeeModel) {
		return mapFromEntityToModel(employeeRepo
				.saveAndFlush(mapFromModelToEntity(employeeModel)));
	}

	@Transactional
	public void delete(Integer employeeId) {
		employeeRepo.deleteById(employeeId);
	}

	@Transactional(readOnly = true)
	public List<EmployeeModel> getFilteredEmployees(EmployeeModel employeeModel) {
		List<EmployeeModel> employeeModelList = new ArrayList<EmployeeModel>();
		List<Employee> employeeList = employeeRepo
				.findAll(EmployeeSpecifications
						.filteredEmployeeBasedOnProps(employeeModel));

		for (Employee employee : employeeList) {
			employeeModelList.add(mapFromEntityToModel(employee));
		}
		return employeeModelList;
	}

	@Transactional(readOnly = true)
	public List<EmployeeModel> getAllEmployees() {
		List<EmployeeModel> employeeModelList = new ArrayList<EmployeeModel>();
		List<Employee> employeeList = employeeRepo.findAll();

		for (Employee employee : employeeList) {
			employeeModelList.add(mapFromEntityToModel(employee));
		}
		return employeeModelList;
	}

	@Transactional(readOnly = true)
	public EmployeeModel getEmployeeById(Integer employeeId) {
		Employee employee = employeeRepo.findById(employeeId);
		EmployeeModel employeeModel = null;
		if (employee != null) {
			employeeModel = mapFromEntityToModel(employee);
		}
		return employeeModel;
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
