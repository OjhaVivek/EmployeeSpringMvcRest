package com.companyname.backend.facade;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
	
	Logger logger = LoggerFactory.getLogger(EmployeeFacade.class);
	
	@CacheEvict(value = { "filteredEmployees", "allEmployees" }, allEntries = true)
	public EmployeeModel addEmployee(EmployeeModel employeeModel)
	{
		logger.info("EmployeeFacade::addEmployee() called");
		try {
			return employeeService.save(employeeModel);
		} catch (Exception e) {
			logger.error("Error saving employee details",e);
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
		logger.info("EmployeeFacade::findFilteredEmployees() called");
		try {
			//throw new Exception();
			return employeeService.getFilteredEmployees(employeeModel);
		} catch (Exception e) {
			logger.error("Error getting employees ",e);
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
		logger.info("EmployeeFacade::getAllEmployees() called");
		try {
			return employeeService.getAllEmployees();
		} catch (Exception e) {
			logger.error("Error getting employees ",e);
		}
		return null;
	}
	
	public EmployeeModel getEmployeeByEmployeeId(Integer employeeId)
	{
		logger.info("EmployeeFacade::getEmployeeByEmployeeId() called");
		try {
			return employeeService.getEmployeeById(employeeId);
		} catch (Exception e) {
			logger.error("Error getting employee ",e);
		}
		return null;
	}
}
