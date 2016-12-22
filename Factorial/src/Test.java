import java.util.Scanner;
import java.io.*;





class LoanException extends Exception
{
	public String toString(){
		return "no matching";
	}
}
public class Test {
	public static void main(String[] args) throws Exception
	{
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter your choice");
		int s=sc.nextInt();
		Employee[] empArray=new Employee[2];
		
		switch(s)
		{
		case 1:
			
				
		Employee empBean;
		for(int i=0;i<=1;i++)
		{
			empBean=new Employee();
		System.out.println("enter employee id");
		empBean.setId(sc.nextInt());
		System.out.println("enter name");
		empBean.setName(sc.next());
		System.out.println("enter employee location");
		empBean.setLocation(sc.next());
		System.out.println("enter employee experience");
		empBean.setExp(sc.nextInt());
		System.out.println("enter employee loan");
		empBean.setLoan(sc.nextLong());
		System.out.println("enter employee emi");
		empBean.setEmi(sc.nextInt());
		System.out.println("enter employee sal");
		empBean.setSal(sc.nextLong());


		empArray[i]=empBean;
		}
		
		for(int i=0;i<=1;i++)
		{
			Employee emp=(Employee)empArray[i];
			System.out.println(i+1 +" details");
			System.out.println("Id = "+ emp.getId());
			System.out.println("Name = " +emp.getName());
			System.out.println("location = " +emp.getLocation());
			System.out.println("exp = " +emp.getExp());
			System.out.println("loan = " +emp.getLoan());
			System.out.println("emi = " +emp.getEmi());
			System.out.println("sal = " +emp.getSal());
			
		}
		
		case 2:
		
			int tempid;
			System.out.println("enter employee id to update");
		 tempid=sc.nextInt();
		for(int i=0;i<=1;i++)
		{
			
			Employee emp=(Employee)empArray[i];
			if(emp.getId()==tempid)
			{
				System.out.println("enter the name to update");
				emp.setName(sc.next());
			
				empArray[i]=emp;
			}
			}
		for(int i=0;i<=1;i++)
		{
			Employee emp=(Employee)empArray[i];
			System.out.println(i+1 +" details");
			System.out.println("Id = "+ emp.getId());
			System.out.println("Name = " +emp.getName());
			
			
		}
		
		case 3:int m;
		System.out.println("enter id to delete");
		 m=sc.nextInt();
			for(int i=0;i<=1;i++)
			{
				
				Employee emp=(Employee)empArray[i];
				if(emp.getId()==m)
				{
					
					emp.setName(null);
					emp.setLocation(null);
					emp.setLoan(0);
					emp.setEmi(0);
					emp.setSal(0);
					emp.setExp(0);
					
					empArray[i]=emp;
				}
				}
			for(int i=0;i<=1;i++)
			{
				Employee1 emp=(Employee1)empArray[i];
				System.out.println(i+1 +" details");
				System.out.println("Id = "+ emp.getId());
				System.out.println("Name = " +emp.getName());
				System.out.println("location = " +emp.getLocation());
				System.out.println("exp = " +emp.getExp());
				System.out.println("loan = " +emp.getLoan());
				System.out.println("emi = " +emp.getEmi());
				System.out.println("sal = " +emp.getSal());
				
			}
		case 4:for(int i=0;i<=1;i++)
		{
			Employee1 emp=(Employee1)empArray[i];
			if(emp.getExp()>=2&&emp.getExp()<=3&&emp.getSal()>=240000&&emp.getSal()<=300000)
		{
				long h;
				h=emp.getSal()/2;
				System.out.println("the loan will be" +h);
				int emi=(int)(h*14)/(9*100);
				emp.setEmi(emi);
				emp.setLoan(h);
				empArray[i]=emp;
		}
			else if(emp.getExp()>=3&&emp.getSal()>=300000)
			{
				long h;
				h=(3*emp.getSal())/4;
				System.out.println("the loan will be" +h);
				int emi=(int)(h*14)/(9*100);
				emp.setEmi(emi);
				emp.setLoan(h);
				empArray[i]=emp;
			}
			else
				throw new LoanException();
			
		}
		for(int i=0;i<=1;i++)
		{
			Employee emp=(Employee)empArray[i];
			System.out.println(i+1 +" details");
			System.out.println("Id = "+ emp.getId());
			System.out.println("Name = " +emp.getName());
			System.out.println("location = " +emp.getLocation());
			System.out.println("exp = " +emp.getExp());
			System.out.println("loan = " +emp.getLoan());
			System.out.println("emi = " +emp.getEmi());
			System.out.println("sal = " +emp.getSal());
		}
		case 5:System.out.println("enter id to view");
		int k=sc.nextInt();
		for(int i=0;i<=1;i++)
		{
			Employee emp=(Employee)empArray[i];
			if(emp.getId()==k)
			{
			 long d=emp.getSal()/12;
			 int ms=(int)(d-emp.getEmi());
			 emp.setMs(ms);
			 empArray[i]=emp;
			 
			}
		}
		for(int i=0;i<=1;i++)
		{
			Employee emp=(Employee)empArray[i];
			System.out.println(i+1 +" details");
			System.out.println("Id = "+ emp.getId());
			System.out.println("Name = " +emp.getName());
			System.out.println("location = " +emp.getLocation());
			System.out.println("exp = " +emp.getExp());
			System.out.println("loan = " +emp.getLoan());
			System.out.println("emi = " +emp.getEmi());
			System.out.println("sal = " +emp.getSal());
			System.out.println("ms = " +emp.getMs());
		}
		case 6:System.exit(0);
		default:System.out.println("no case");
		}
		
	}
}


