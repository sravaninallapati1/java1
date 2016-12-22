import java.util.Scanner;


public class Factorial {
	
	public static void main(String[]args) 
	{
	int n = 7 ;
	int i ;
	Scanner sc= new Scanner(System.in) ;
	
	System.out.println("enter a number") ;
	n= sc.nextInt() ;
	
int result = 1 ;
{
for(i=1; i<=n ; i++)
	result= result*i ;
}
System.out.println(result) ;
}
}