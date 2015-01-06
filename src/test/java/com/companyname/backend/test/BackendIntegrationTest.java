package com.companyname.backend.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.companyname.backend.facade.EmployeeFacade;
import com.companyname.backend.models.EmployeeModel;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath:/spring/application-config.xml" })
public class BackendIntegrationTest {

		@Autowired
		EmployeeFacade employeeFacade;
		
		@Test
		public void mainTest()
		{
			EmployeeModel employeeModel = new EmployeeModel(1,null,null);
			System.out.println("Searching employee using id "+employeeFacade.findFilteredEmployees(employeeModel));
		
			employeeModel = new EmployeeModel(null,"Arjun",null);
			System.out.println("Searching employee using name "+employeeFacade.findFilteredEmployees(employeeModel));
			
			employeeModel = new EmployeeModel(null,null,150000000L);
			System.out.println("Searching employee using salary "+employeeFacade.findFilteredEmployees(employeeModel));
			
			employeeModel = new EmployeeModel(null,"Vivek",150000000L);
			System.out.println("Searching employee using name and salary "+employeeFacade.findFilteredEmployees(employeeModel));
			
			System.out.println("Updating salary of new Employee with id 3 to 1500000 ");
			employeeModel = new EmployeeModel(3,null,null);
			employeeModel = employeeFacade.findFilteredEmployees(employeeModel).get(0);
			employeeModel.setSalary(1500000L);
			employeeFacade.addEmployee(employeeModel);
			
			System.out.println("Complete list of employees: \n"+employeeFacade.getAllEmployees());
		}
}
