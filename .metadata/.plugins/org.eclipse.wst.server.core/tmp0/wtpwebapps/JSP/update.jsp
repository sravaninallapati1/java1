<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="update" method="post">
<table align="center">
<tr>
      <td>Enter Employee Id to update:</td>
      <td><input type="text" name="employeeId" /></td>
    </tr>

    <tr>
      <td>Enter Employee Name To Update:</td>
      <td><input type="text" name="employeeName" /></td>
    </tr>

     <tr>
      <td>Enter Salary To Update:</td>
      <td><input type="number" name="employeeSalary" /></td>
    </tr>
     <tr>
      <td>Enter Location To Update:</td>
      <td><input type="text" name="employeeLocation" /></td>
    </tr>
    <tr>
      <td>Enter Experience To Update:</td>
      <td><input type="number" name="employeeExp" /></td>
    </tr>
   <!-- <tr>
    <td>Enter Loan to Update:</td>
    <td><input type="number" name="employeeLoan"/></td>
    </tr> -->
</table>
<input type="submit" value="Submit">
</form> 

</body>
</html>