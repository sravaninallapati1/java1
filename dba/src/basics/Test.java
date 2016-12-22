package basics;



import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Test 
{

	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		Employee employeeBean=new Employee();
		
		System.out.println("enter employee Id");
		employeeBean.setEmployeeId(input.nextInt());
		System.out.println("enter employee name");
		employeeBean.setEmployeeName(input.next());
		System.out.println("enter employee salary");
		employeeBean.setEmployeeSlary(input.nextDouble());
		System.out.println("enter employee exp");
		employeeBean.setEmployeeExp(input.nextInt());
		System.out.println("enter employee location");
		employeeBean.setEmployeeLocation(input.next());
		System.out.println("enter employee loan");
		employeeBean.setEmployeeLoan(input.nextDouble());
		
		
		DataBaseOperations dbo=new DataBaseOperations();
		
		
		/*int result=dbo.insertData(employeeBean);*/
		
		int result=dbo.insertDataUsingPrepared(employeeBean);
		System.out.println(result+ " data inserted");
		
		System.out.println("enter employee Id to search");
		int employeeId=input.nextInt();
		
		  ArrayList listOfEmp=dbo.search(employeeId);
		  Iterator itr=listOfEmp.iterator();
		 Employee employee=null;
		 System.out.println("Id \t Name \t salary \t exp\t location\t loan");
		  while(itr.hasNext())
		  {
			  employee=(Employee)itr.next();
			  
			  System.out.println(employee.getEmployeeId()+"\t"+employee.getEmployeeName()+"\t"+employee.getEmployeeSlary()+"\t"+employee.getEmployeeExp()+"\t"+employee.getEmployeeLocation()+"\t"+employee.getEmployeeLoan());
		  }
		  

	}

}
