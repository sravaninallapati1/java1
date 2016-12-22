package dp;
import java.*;
import java.util.ArrayList;

public class Example 
{
	public static void main(String[]args)
	{
		ArrayList al=new ArrayList();
		al.add("sravs");
		al.add("venky");
		ArrayList<String>al1=new ArrayList<String>();
		al1.add("venky");
		al1.add("bujji");
		ArrayList<Integer>al2=new ArrayList<Integer>();
		al2.add(1000);
		al2.add(500);
			
	}
	Example  emp= new Example ();
			emp.getid(1);
			emp.getname("sravs");
			
	
		ArrayList<Example >alemp=new ArrayList<Example>() ;
		al.emp.add(emp);
	Iterator it=alemp.iterator();
	while(it.hasnext())
	{
		Example emp = new (Example)it.next();
	
		
System.out.println(emp.getid);
System.out.println(emp.getname);
}
}}
