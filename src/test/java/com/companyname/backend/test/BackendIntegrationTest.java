package com.companyname.backend.test;

import java.util.Date;
import java.util.List;

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
//			testing cacheable
			Date startTime = new Date();
			List<EmployeeModel> employeeList = employeeFacade.getAllEmployees();
			Date endTime = new Date();
			
			System.out.println("Start Time: "+startTime+"\n End Time:"+endTime);
			System.out.println("Employee List: "+employeeList);
			
			startTime = new Date();
			employeeList = employeeFacade.getAllEmployees();
			endTime = new Date();
			System.out.println("Second Start Time: "+startTime+"\nSecond End Time:"+endTime);
			System.out.println("Second Employee List: "+employeeList);
			
			EmployeeModel employeeModel = new EmployeeModel(null,"Vivek",150000000L);
			startTime = new Date();
			employeeList = employeeFacade.findFilteredEmployees(employeeModel);
			endTime = new Date();
			System.out.println("Start Time for filtered: "+startTime+"\nEnd Time for filtered:"+endTime);
			System.out.println("Employee List for filtered: "+employeeList);
			
			startTime = new Date();
			employeeList = employeeFacade.findFilteredEmployees(employeeModel);
			endTime = new Date();
			System.out.println("Second Start Time for filtered: "+startTime+"\nSecond End Time for filtered:"+endTime);
			System.out.println("Second Employee List for filtered: "+employeeList);
			
//			testing cacheEvict
			EmployeeModel employeeModel1 = new EmployeeModel(null,"Deepika",1400000L);
			employeeFacade.addEmployee(employeeModel1);
			
			startTime = new Date();
			employeeList = employeeFacade.findFilteredEmployees(employeeModel);
			endTime = new Date();
			System.out.println("Third Start Time for filtered: "+startTime+"\nThird End Time for filtered:"+endTime);
			System.out.println("Third Employee List for filtered: "+employeeList);
			
		}
}
