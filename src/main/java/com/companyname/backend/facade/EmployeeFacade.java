package com.companyname.backend.facade;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import com.companyname.backend.models.EmployeeModel;
import com.companyname.backend.services.EmployeeService;

@Component
public class EmployeeFacade {

	@Autowired
	EmployeeService employeeService;
	
	@CacheEvict(value = { "filteredEmployees", "allEmployees" }, allEntries = true)
	public EmployeeModel addEmployee(EmployeeModel employeeModel)
	{
		try {
			return employeeService.save(employeeModel);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	@Cacheable("filteredEmployees")
	public List<EmployeeModel> findFilteredEmployees(EmployeeModel employeeModel)
	{
//		uncomment the following block while testing caching
		/*try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/
		try {
			return employeeService.getFilteredEmployees(employeeModel);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	@Cacheable("allEmployees")
	public List<EmployeeModel> getAllEmployees()
	{
//		uncomment the following block while testing caching
		/*try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/
		try {
			return employeeService.getAllEmployees();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public EmployeeModel getEmployeeByEmployeeId(Integer employeeId)
	{
		try {
			return employeeService.getEmployeeById(employeeId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
