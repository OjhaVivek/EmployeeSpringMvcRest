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
			
			System.out.println("Creating new Employee with name Shreya and salary 1000000 ");
			employeeModel = new EmployeeModel(null,"Shreya", 1000000L);
			employeeFacade.addEmployee(employeeModel);
			
			System.out.println("Complete list of employees: \n"+employeeFacade.getAllEmployees());
		}
}
