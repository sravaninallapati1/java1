package factorial;

import java.util.Scanner;

public class Scan {


	public static void main(String[]args)
	{
	Scanner sc = new Scanner(System.in) ;
	System.out.println(" enter the id") ;
	int id = sc.nextInt() ;
	System.out.println("enter the name") ;
	String name = sc.next() ;
	System.out.println("enter the salary") ;
	float sal = sc.nextFloat() ;
	System.out.println("id+" + id+ " " + " name = " +name+ "  "+ "salary =" + sal);
}
}
