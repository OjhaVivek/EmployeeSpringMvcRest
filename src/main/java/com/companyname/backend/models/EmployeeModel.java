package com.companyname.backend.models;

import org.codehaus.jackson.annotate.JsonAutoDetect;

@JsonAutoDetect
public class EmployeeModel {

	private Integer employeeId;

	private String employeeName;

	private Long salary;
	
	public EmployeeModel() {
	
	}

	public EmployeeModel(Integer employeeId, String employeeName, Long salary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
	}

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public Long getSalary() {
		return salary;
	}

	public void setSalary(Long salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "EmployeeModel [employeeId=" + employeeId + ", employeeName="
				+ employeeName + ", salary=" + salary + "]";
	}
	
}
