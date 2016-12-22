package dp; 

class Singleton 
{
	private static Singleton singleobj=new Singleton();
private Singleton()
{
//default constructor//
}	

public static Singleton getinstance()
{
	return singleobj;
}
public void display()
{
	System.out.println("the singleton clas");
}
}
class Test 
{
	public static void main(String []args)
	{
		Singleton.getinstance().display();
	}
	}
	
