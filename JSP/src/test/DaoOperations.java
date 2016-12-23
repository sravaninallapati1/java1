  package test;
 import java.sql.*;

             import java.util.ArrayList;
             import java.util.Iterator;



             public class DaoOperations {
             	Connection connection;
             	PreparedStatement pst;
             	ResultSet resultSet;

             	public DaoOperations() {
             		connection = MyConnection.getInstance().connection;
             	}

             	public int insertData(EmployeeBean employeeBean) {
             		int result = 0;
             		String query = "insert into employee values(?,?,?,?,?,?)";

             		try {
             			pst = connection.prepareStatement(query);
             			pst.setString(1, employeeBean.getEmployeeId());
             			pst.setString(2, employeeBean.getEmployeeName());
             			pst.setDouble(3, employeeBean.getEmployeeSalary());
             			pst.setString(4, employeeBean.getEmployeeLocation());
             			pst.setFloat(5, employeeBean.getEmployeeExp());
             			pst.setDouble(6, employeeBean.getEmployeeLoan());


             			result = pst.executeUpdate();

             		} catch (SQLException e) {
             			// TODO Auto-generated catch block
             			e.printStackTrace();
             		}

             		return result;

             	}
             	
             	
             	public ArrayList<EmployeeBean> search(String searchElement)
             	{
             		ArrayList<EmployeeBean> employeeList=new ArrayList<EmployeeBean>();
             		
             		String query="select EmployeeId,EmployeeName,EmployeeSalary,EmployeeLocation,EmployeeExp,EmployeeLoan from employee where EmployeeId=?";
             		
             		try {
             			pst=connection.prepareStatement(query);
             			pst.setString(1, searchElement);
             			
             			resultSet=pst.executeQuery();
             			
             			EmployeeBean empBean=null;
             			while(resultSet.next())
             			{
             				empBean=new EmployeeBean();
             				empBean.setEmployeeId(resultSet.getString(1));
             				empBean.setEmployeeName(resultSet.getString(2));
             				empBean.setEmployeeSalary(resultSet.getDouble(3));
             				empBean.setEmployeeLocation(resultSet.getString(4));
             				empBean.setEmployeeExp(resultSet.getFloat(5));
             				empBean.setEmployeeLoan(resultSet.getDouble(6));
             				employeeList.add(empBean);
             				
             			}
             			
             			
             		} catch (SQLException e) {
             			// TODO Auto-generated catch block
             			e.printStackTrace();
             		}
             		
             		return employeeList;
             	}
             	public ArrayList<EmployeeBean> searchName(String searchElement)
             	{
             		ArrayList<EmployeeBean> employeeList=new ArrayList<EmployeeBean>();
             		
             		String query="select EmployeeId,EmployeeName,EmployeeSalary,EmployeeLocation,EmployeeExp,EmployeeLoan from employee where EmployeeName=?";
             		
             		try {
             			pst=connection.prepareStatement(query);
             			pst.setString(1, searchElement);
             			
             			resultSet=pst.executeQuery();
             			
             			EmployeeBean empBean=null;
             			while(resultSet.next())
             			{
             				empBean=new EmployeeBean();
             				empBean.setEmployeeId(resultSet.getString(1));
             				empBean.setEmployeeName(resultSet.getString(2));
             				empBean.setEmployeeSalary(resultSet.getDouble(3));
             				empBean.setEmployeeLocation(resultSet.getString(4));
             				empBean.setEmployeeExp(resultSet.getFloat(5));
             				empBean.setEmployeeLoan(resultSet.getDouble(6));
             				employeeList.add(empBean);
             				
             			}
             			
             			
             		} catch (SQLException e) {
             			// TODO Auto-generated catch block
             			e.printStackTrace();
             		}
             		
             		return employeeList;
             	}
             	public ArrayList<EmployeeBean> searchSalary(double searchElement)
             	{
             		ArrayList<EmployeeBean> employeeList=new ArrayList<EmployeeBean>();
             		
             		String query="select EmployeeId,EmployeeName,EmployeeSalary, EmployeeLocation,EmployeeExp,EmployeeLoan from employee where employeeSalary=?";
             		
             		try {
             			pst=connection.prepareStatement(query);
             			pst.setDouble(1, searchElement);
             			
             			resultSet=pst.executeQuery();
             			
             			EmployeeBean empBean=null;
             			while(resultSet.next())
             			{
             				empBean=new EmployeeBean();
             				empBean.setEmployeeId(resultSet.getString(1));
             				empBean.setEmployeeName(resultSet.getString(2));
             				empBean.setEmployeeSalary(resultSet.getDouble(3));
             				empBean.setEmployeeLocation(resultSet.getString(4));
             				empBean.setEmployeeExp(resultSet.getFloat(5));
             				empBean.setEmployeeLoan(resultSet.getDouble(6));
             				employeeList.add(empBean);
             				
             			}
             			
             			
             		} catch (SQLException e) {
             			// TODO Auto-generated catch block
             			e.printStackTrace();
             		}
             		
             		return employeeList;
             		
             	}
             	public ArrayList<EmployeeBean> searchName(String searchElement)
             	{
             		ArrayList<EmployeeBean> employeeList=new ArrayList<EmployeeBean>();
             		
             		String query="select EmployeeId,EmployeeName,EmployeeSalary,EmployeeLocation,EmployeeExp,EmployeeLoan from employee where EmployeeName=?";
             		
             		try {
             			pst=connection.prepareStatement(query);
             			pst.setString(1, searchElement);
             			
             			resultSet=pst.executeQuery();
             			
             			EmployeeBean empBean=null;
             			while(resultSet.next())
             			{
             				empBean=new EmployeeBean();
             				empBean.setEmployeeId(resultSet.getString(1));
             				empBean.setEmployeeName(resultSet.getString(2));
             				empBean.setEmployeeSalary(resultSet.getDouble(3));
             				empBean.setEmployeeLocation(resultSet.getString(4));
             				empBean.setEmployeeExp(resultSet.getFloat(5));
             				empBean.setEmployeeLoan(resultSet.getDouble(6));
             				employeeList.add(empBean);
             				
             			}
             			
             			
             		} catch (SQLException e) {
             			// TODO Auto-generated catch block
             			e.printStackTrace();
             		}
             		
             		return employeeList;
             	}
             		public int update(EmployeeBean employeeBean)
             		{
             			int x=0;
             			String query="update employee set EmployeeName=?,EmployeeSalary=?,Employeelocation=?,EmployeeExp=?,EmployeeLoan=? where EmployeeId=?";
             		try
             		{
             			pst=connection.prepareStatement(query);
             			
             			pst.setString(1,employeeBean.getEmployeeName());
             			pst.setDouble(2,employeeBean.getEmployeeSalary());
             			pst.setFloat(4,employeeBean.getEmployeeExp());
             			pst.setString(3,employeeBean.getEmployeeLocation());
             			pst.setDouble(5,employeeBean.getEmployeeLoan());
             			
             			pst.setString(6,employeeBean.getEmployeeId());
             			
             			 x=	pst.executeUpdate();
             			
             	    System.out.println("updated rows:"+ x);
             			
             		}
             			catch(SQLException e)
             			{
             				e.printStackTrace();
             			}
             		return x;
             		
             		}
             		public int delete(String EmployeeId)
             		{
             			int x=0;
             			String query="delete from employee where EmployeeId=?";
             			
             			try 
             			{
             				pst=connection.prepareStatement(query);
             				
             				pst.setString(1, EmployeeId);
             				
             				 x=	pst.executeUpdate();
             				System.out.println("deleted rows:"+ x);

             			}
             			catch (SQLException e) 
             			{
             				// TODO Auto-generated catch block
             				e.printStackTrace();
            			}
             			return x;
             		}
             	public ArrayList<EmployeeBean> loan(String Id) 
             		
             		{
             			double eLoan;
             			ArrayList<EmployeeBean> loe=search(Id);
             			
             			
             			Iterator<EmployeeBean> itt=loe.iterator();
             			EmployeeBean ee=null;             			while(itt.hasNext())             			{             			ee=(EmployeeBean)itt.next();             			             			if(ee.getEmployeeExp()>2 && ee.getEmployeeExp()<4)
             			{
             				eLoan=ee.getEmployeeSalary()/2;
            			ee.setEmployeeLoan(eLoan);
            			//emi=(ee.getEmployeeLoan())*14/900;
            			//ee.setEmployeeEmi(emi);
             			}
            		else
            		{
            			
            			System.out.println("not eligible for loan");
            			
            		}
            	
             			}
             			return loe;
             			}
            		
            	public ArrayList<EmployeeBean> loanUpdate(String tempid) 
            		{
            			ArrayList<EmployeeBean> employeeList=loan(tempid);
            			
            			EmployeeBean empBean=null;
            		
            			String query="update employee set EmployeeLoan=? where EmployeeId=?";
            		

            			try {
            				
            				Iterator it=employeeList.iterator();
            				while(it.hasNext())
            				{
            					empBean=(EmployeeBean)it.next();
            				pst = connection.prepareStatement(query);
            				pst.setDouble(1, empBean.getEmployeeLoan());
            			
            				pst.setString(2, tempid);
            				
            				pst.executeUpdate();
            				}
            				
            				
            			} catch (SQLException e) {
            				// TODO Auto-generated catch block
            				e.printStackTrace();
            			}
            			
            			
            			
            			return employeeList;
            			
            		}
            }
             			
             				             	             	             	             	             	             	             	             	                          