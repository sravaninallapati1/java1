 <%@page import="java.util.Iterator"%>
<%@page import="test.EmployeeBean"%>
<%@page import="java.util.ArrayList"%>


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title> VIEW EMPLOYEE DETAILS</title>
</head>
<body style="background-color:DarkKhaki ">

<div align="center">

<h2>Update Employee Details</h2>

<form action="UpdateValues" method="post">
Enter Employee Id :
<input type="text" name="search" />
<input type="submit" value="Update By Id"><br>
</form>

<%
Object obj=session.getAttribute("employeeList");

if(obj!=null)
{
	%>
	<form action="update" method="post">
	<table><br>

	<%
	ArrayList<EmployeeBean> employeeList=(ArrayList)obj;
	Iterator iterator=employeeList.iterator();
	EmployeeBean employeebean=null;
	while(iterator.hasNext())
	{
		employeebean=(EmployeeBean)iterator.next();
		%>
		<tr>
		
<td>Employee Id:<br><input type="text" value="<%= employeebean.getEmployeeId() %>" name="Employid" readonly/></td>
<td>Employee Name:<input type="text" value="<%= employeebean.getEmployeeName()  %>" name="EmployeeName"/></td>
<td>Employee Salary:<input type="text" value="<%= employeebean.getEmployeeSalary() %>" name="EmployeeSalary"/></td>
<td>Employee Exp:<input type="text" value="<%= employeebean.getEmployeeExp() %>" name="EmployeeExp"/></td>
<td>Employee Location:<input type="text" value="<%= employeebean.getEmployeeLocation() %>" name="EmployeeLocation"/></td>


		</tr>
		
	<%	
	}
	session.removeAttribute("employeeList");
	
}
else
	
{
	out.print("No Data");
}

%>

</table>
<input type="submit" value="Update" />
</form>
<br>
<br>
<br>
<a href="index.html">Go To HomePage</a>
</div>


</body>
</html>