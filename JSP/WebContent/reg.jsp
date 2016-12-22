<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<script type "text/javascripit">

function validation()
{
	
var employeeId=document.getElementById(employeeId).value;
if(employeeId==" "||employeeId==null)
	{
	//alert("please enter employeeid");
	document.getElementById("error").innerHTML="please enter id";
	return false;
	}
else
	return true;
	
	}function clearFiled()
	{
		document.getElementById("error")
	}
	
</script>
<style type ="text/css">
#dot{
color:red;
}
</style>
</head>
<body style="background-color:Moccasin">
<div align="center">
<h1>Employee details</h1>

<form action="insertServlet" method="post">

 <table>
    <tr>
      <td>Enter Employee Id:
      <sup id="dot">.... </sup></td>
      <td><input type="text" name="employeeId" id= "employeeid" onkeypress="return clearField()"/></td>
      <td><span id="error"></span></td>
    </tr>

    <tr>
      <td>Enter Employee Name:</td>
      <td><input type="text" name="employeeName" /></td>
    </tr>

    <tr>
      <td>Enter Salary:</td>
      <td><input type="number" name="employeeSalary" /></td>
    </tr>
     <tr>
      <td>Enter Location:</td>
      <td><input type="text" name="employeeLocation" /></td>
    </tr>
    <tr>
      <td>Enter Experience:</td>
      <td><input type="number" name="employeeExp" /></td>
    </tr>
   <!--  <tr>
    <td>Enter Loan:</td>
    <td><input type="number" name="employeeLoan"/></td>
    </tr> -->
    
</table>

<input type="submit" value="Submit" onclick="return validation()">
</form>

</div>

</body>
</html>