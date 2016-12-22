
public class Parent1 {



private int i;//encap 
private int j; 
public String name ;
int Arrray []=new int[];

public void display()
{ 
this.i= j;
this.j= this.i+ i+j;

String st=new String();
System.out.println("enter the name") ;

}
class child extends Parent1 //inher 
{ 
	this.name= "sravs";
public void display()//method overiding 
{ 
super(i,j) ;
} 


public void mul(int i, int j) 
{ 
int k=i*j; 
System.out.println("mul of 2 int val is:"+k); 

} 
public void mul(float i,float j)//method overloading 
{ 
double z=i*j; 
System.out.println("mul val of 2 double is:"+z); 
} 
} 
class Son 
{ 

public static void main(String args[]) 
{ 
	System.out.println("the value z") ;
Parent1 p=new Parent1(); 
son( int k) ;
Parent1 pt=new child(); 
child cd=new child(); 
p.display(); 
cd.mul(2, 20); 
cd.mul(2.2, 1.1); 
pt.display(); 
} 
} 
