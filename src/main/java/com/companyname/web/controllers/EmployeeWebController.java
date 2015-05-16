package com.companyname.web.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.companyname.backend.facade.EmployeeFacade;
import com.companyname.backend.models.EmployeeModel;

@Controller
public class EmployeeWebController {

	@Autowired
	EmployeeFacade employeeFacade;

	private static final String VIEW_INDEX = "initialEmployee";

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String welcome(ModelMap model) {

		EmployeeModel employeeModel = new EmployeeModel();
		model.addAttribute("employeeSearchForm", employeeModel);
		return VIEW_INDEX;

	}

	@RequestMapping(value = "/addEmployeePage", method = RequestMethod.GET)
	public String getAddEmployee(ModelMap model) {

		EmployeeModel employeeModel = new EmployeeModel();
		model.addAttribute("employeeForm", employeeModel);
		return "addEmployee";

	}

	@RequestMapping(value = "/fetchEmployees", method = RequestMethod.GET)
	public String fetchEmployees(
			@ModelAttribute("employeeSearchForm") EmployeeModel employeeModel,
			ModelMap model) {

		model.addAttribute("employeeSearchForm", employeeModel);
		List<EmployeeModel> listEmployees = employeeFacade
				.findFilteredEmployees(employeeModel);
		model.addAttribute("listEmployees", listEmployees);
		return VIEW_INDEX;

	}

	@RequestMapping(value = "/saveEmployee", method = RequestMethod.POST)
	public String postAddEmployee(
			@ModelAttribute("employeeForm") EmployeeModel employeeModel) {

		/*EmployeeModel tempEmployeeModel = employeeFacade
				.getEmployeeByEmployeeId(employeeModel.getEmployeeId());
		if (tempEmployeeModel != null) {
			// This means Employee already exists. Don't do anything. Will be
			// useful in case anyone
			// modifies client side code to try stuff.
		} else {*/
			employeeFacade.addEmployee(employeeModel);
		/*}*/
		return "successfulAdd";

	}

}
