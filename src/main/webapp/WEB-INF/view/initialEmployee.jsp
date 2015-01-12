<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">


<html xmlns="http://www.w3.org/1999/xhtml">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<head>
<meta content="en-us" http-equiv="Content-Language" />
<meta content="text/html; charset=utf-8" http-equiv="Content-Type" />
<title>Search Box&nbsp; Employee Id</title>

<script type="text/javascript">
	function div_show(id, name, sal) {
		var employeeId = document.getElementById('employeeIdTemp');
		var employeeName = document.getElementById('employeeNameTemp');
		var salary = document.getElementById('salaryTemp');
		employeeId.value = id;
		employeeName.value = name;
		salary.value = sal;

		var newWindow = window.open('addEmployeePage', 'Add Employee',
				'height=300,width=400');
	}
</script>

<style type="text/css">
.auto-style1 {
	font-size: xx-large;
}

.auto-style2 {
	margin-left: 6px;
}

.auto-style3 {
	margin-left: 104px;
}

.auto-style4 {
	font-size: x-large;
}

.auto-style5 {
	margin-left: 2px;
}
</style>
</head>

<body>


	<div style="width: 858px; height: 92px" class="auto-style1">
		<label id="Label2"><span class="auto-style1">Add Box<br />
				<button id="popup" class="auto-style5" name="Button1"
					style="width: 847px" type="button" onclick="div_show('','','')">Add
					Employee</button>
		</span><br /> </label>
	</div>

	<form:form action="fetchEmployees" class="auto-style2" method="get"
		style="height: 137px" commandName="employeeSearchForm">
		<label id="Label1"><span class="auto-style1">Search Box</span><br />
			<br /> <span class="auto-style4">Employee Id&nbsp;</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		</label>
		<form:input name="searchEmployeeId" path="employeeId"
			style="width: 165px" type="text" />
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 
	<span class="auto-style4">Employee Name</span>
		<form:input name="searchEmployeeName" path="employeeName" style="width: 165px" type="text" />
		<br />
		<br />
		<span class="auto-style4">Employee Salary</span>&nbsp; 
	<form:input name="searchSalary" path="salary"
			style="width: 164px" type="text" />&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	<input class="auto-style3" name="searchSubmit"
			style="width: 172px" type="submit" value="Fetch Results" />
		<br />
	</form:form>
	<div style="width: 858px; height: 545px" class="auto-style1">
		Search Results(Click to edit)<br />
		<table style="width: 100%" border="solid">
			<tr>
				<th style="width: 253px" class="auto-style4">Employee Id</th>
				<th style="width: 301px" class="auto-style4">Employee Name</th>
				<th class="auto-style4">Employee Salary</th>
			</tr>
			<%--          <% for(int i = 0; i < 3; i+=1) { %>  --%>
			<c:forEach items="${listEmployees}" var="singleEmployee">
				<tr onclick="div_show(${singleEmployee.employeeId},'${singleEmployee.employeeName}',${singleEmployee.salary})"
					onMouseOver="this.style.backgroundColor='#ff0000'"
					onMouseOut="this.style.backgroundColor='#ffffff'"
					style="cursor: pointer;">
					<td style="width: 253px" class="auto-style4"><c:out
							value="${singleEmployee.employeeId}" /></td>
					<td style="width: 301px" class="auto-style4"><c:out
							value="${singleEmployee.employeeName}" /></td>
					<td class="auto-style4"><c:out
							value="${singleEmployee.salary}" /></td>
				</tr>
			</c:forEach>
			<%--           <% } %>   --%>
		</table>
	</div>

	<!-- <form action="" method="post" style="visibility: hidden;" id="employee">  -->
	<input type="text" id="employeeIdTemp" name="employeeIdTemp"
		style="visibility: hidden;" />
	<input type="text" id="employeeNameTemp" name="employeeNameTemp"
		style="visibility: hidden;" />
	<input type="text" id="salaryTemp" name="salaryTemp"
		style="visibility: hidden;" />
	<!--  </form> -->

</body>

</html>
