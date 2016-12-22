<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<script type="text/javascript">
function validation()
{
	var employeeId=document.getElementById("EmployeeId").value;
	if(employeeId==""||employeeId==null)
		{
		alert("please enter employyeId");
		document.getElemenyById("error").innerHTML="please enter id";
		return false;
		}
	else 
		return true;
		}
	function clearField()
	{
		document.getElementById("error").innerHTML="";
	}


</script>

</body>
</html>