import java.io.*;
	class Employee implements Serializable
	{
		public static String location;
		public static double sal;
		public static String name;
		public static int id;
		int eid;
		String ename;
		double esalary;
		public static void serialization() throws Exception
		{
			Employee employee=new Employee() ;
			employee.eid= 100;
			employee.ename="sravs";
			employee.esalary= 25000.00;
			FileOutputStream fos=new FileOutputStream(new File("d:/serial.txt"));
			ObjectOutputStream oos= new ObjectOutputStream(fos);
			oos.writeObject(employee);
			System.out.println("serialization done") ;
		}
		public static void deserilizable() throws Exception
		{
			FileInputStream fis=new FileInputStream(("d:/serial.txt"));
			ObjectInputStream ois= new ObjectInputStream(fis);
			Object oj=ois.readObject();
			Employee emp=(Employee)oj;
			System.out.println("after desirialization");
			System.out.println("Id="+emp.eid);
			System.out.println("name="+emp.ename);
			System.out.println("salary="+emp.esalary);
		}
		public static void main(String[]args) throws Exception
		{
			serialization();
			//deserilization();
		}
	
	
	

	
	
}
	
