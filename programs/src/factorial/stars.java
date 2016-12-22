package factorial;
import java.util.Scanner;

public class stars {


public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter n vlue");
	int n=sc.nextInt();
	int i,j;
	for(i=n;i>=0;i--)
	{
		for(j=i;j>=1;j--)
		{
			System.out.print("*");
			System.out.print("  ");
		}
		System.out.println();
	}
}
}
