<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html xmlns="http://www.w3.org/1999/xhtml">

<head>
<meta content="en-us" http-equiv="Content-Language" />
<meta content="text/html; charset=utf-8" http-equiv="Content-Type" />
<title>Enter Employee Details&nbsp; Employee</title>

<script type="text/javascript">

	function closeSelf(formVariable) {
		var id = formVariable.employeeId.value;
		var name = formVariable.employeeName.value;
		var salary = formVariable.salary.value;
		if (name == null || name == "" || salary == null || salary == ""
				|| salary != parseInt(salary, 10) || salary < 0) {
			alert("All Values are mandatory. Salary Should be positive integer");
		} else {
			var form = document.getElementById('employeeAddForm');
			form.submit();
			//alert("Data Updated");
		}
	}
</script>

<style type="text/css">
.auto-style1 {
	margin-left: 48px;
}

.auto-style2 {
	font-size: xx-large;
}

.auto-style3 {
	margin-left: 44px;
}
</style>
</head>

<body onload="myFunction()">
 <script>
	 function myFunction() {
				var id = window.opener.document.getElementById("employeeIdTemp");
				var name = window.opener.document.getElementById("employeeNameTemp");
				var salary = window.opener.document.getElementById("salaryTemp");
				var outputFrm = document.forms['employeeAddForm'];

				outputFrm.elements['employeeId'].defaultValue = id.value;
				outputFrm.elements['employeeName'].defaultValue = name.value;
				outputFrm.elements['salary'].defaultValue = salary.value;
				
				outputFrm.elements['employeeId'].readOnly = true;

 }
 </script>

	<form:form action="saveEmployee" method="POST" id="employeeAddForm" name = "employeeAddForm"
		modelAttribute="employeeForm" style="height: 207px; width: 384px">
		<label id="Label1"><span class="auto-style2">Enter
				Employee Details</span><br /> <br /> Employee
			Id&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			<form:input name="employeeId" id="employeeId" path="employeeId" style="width: 182px"
				type="text" /><br /> <br /> Employee Name: </label>
		<form:input class="auto-style1" name="employeeName" id="employeeName"
			path="employeeName" style="width: 182px" type="text" />
		<br />
		<br />
		<label id="Label2">Employee
			Salary:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		</label>
		<form:input name="salary" id="salary" path="salary" style="width: 182px"
			type="text" />
		<br />
		<br />
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		<input class="auto-style3" name="Add" style="width: 91px"
			type="button" value="Save"
			onclick="closeSelf(document.getElementById('employeeAddForm'));" />
	</form:form>

</body>

</html>
