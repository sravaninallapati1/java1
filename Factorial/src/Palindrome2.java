import java.util.Scanner;


public class Palindrome2 
{
public static void main(String[] args)
{

Scanner sc = new Scanner(System.in);

System.out.println("Enter a string");
String str=sc.nextLine();

StringBuffer str1=new StringBuffer(str);
StringBuffer str2=new StringBuffer(str1);

 str1.reverse();

System.out.println("Orginal String ="+str2);
System.out.println("After Reverse ="+str1);

if(String.valueOf(str1).compareTo(String.valueOf(str2))==0)
  System.out.println("Result:Palindrome");
  else
   System.out.println("Result:Not Palindrome");

  }

}