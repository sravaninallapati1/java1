package factorial;
import java.io.*;

public class Buffer {
public static void main(String[]args) throws IOException
	

	{
		BufferedReader objectref = new BufferedReader(new InputStreamReader(System.in));
		{
			System.out.println("enter the id") ;
		String rID = objectref.readLine();
		Integer i1= new Integer(rID) ;
		int id= i1.intValue() ;
	System.out.println("enter the name");
	String name = objectref.readLine() ;
	System.out.println("enter the salary") ;
	String rsal = objectref.readLine();
	double sal = Double.parseDouble(rsal) ;
	System.out.println(" id = " + id) ;
	System.out.println(" name = " + name) ;
	System.out.println(" sal = " + sal) ;
		}
	}
	

}
