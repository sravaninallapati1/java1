import java.util.Scanner;


public class Cloud 
{
	public static void main(String[]args)
	{   
		Scanner sc= new Scanner(System.in) ;
		System.out.println("enter a string1") ;
		String str=sc.next(); 
		System.out.println("enter a string2");
		String str1=sc.next();
		
		for(int i=0 ; i<=str.length()-1; i++)
		{
			System.out.println(str.charAt(i)) ;
			System.out.println(str.codePointAt(i)) ;
		System.out.println(str.concat("sravs")) ;
		System.out.println(str.intern()) ;
		System.out.println(str.replace('s','v')) ;
		System.out.println(str.replaceAll("sravs","venky")) ;
		System.out.println(str.replaceFirst("mummy","daddy")) ;
		System.out.println(str.substring(1,4)) ;
		System.out.println(str.toLowerCase()) ;
		System.out.println(str.toString()) ;
		System.out.println(str.toUpperCase()) ;
		System.out.println(str.trim()) ;
		System.out.println(str.codePointCount(1,4)) ;
		System.out.println(str.codePointBefore(3)) ;
		System.out.println(str.startsWith("bujji")) ;
		System.out.println(str.startsWith("sravs",4)) ;
		System.out.println(str.matches("dillu"));
		System.out.println(str.length()) ;
		System.out.println(str.lastIndexOf(3)) ;
		System.out.println(str.lastIndexOf("sravs"));
		System.out.println(str.compareTo(str1));
		
	}
	

}

	private static char[] valueOf(boolean b) {
		// TODO Auto-generated method stub
		return null;
	}
}