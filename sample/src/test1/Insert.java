package test1;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;




import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Test.Data;
import Test.MyConnection;



/**
 * Servlet implementation class Insert
 */
//@WebServlet("/Insert")
public class Insert extends HttpServlet {
	Connection connection=null;
	PreparedStatement ps=null;
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Insert() {
        super();
        connection=MyConnection.getInstance().connection;
    	
     
     
	}
    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		Data db=new Data();
		response.setContentType("text/html");  
		PrintWriter out=response.getWriter();
		String eid=request.getParameter("eid");
		String ename=request.getParameter("ename");
		String esal=request.getParameter("esal");
		String eloc=request.getParameter("eloc");
		String eexp=request.getParameter("eexp");
		
		double slary;
		int exp;
		try
		{
			slary=Double.parseDouble(esal);
		 exp=Integer.parseInt(eexp);
			
		}
		catch(Exception e)
		{
			slary=0;
			exp=0;
		}
		db.setEid(eid);
		db.setEname(ename);
		db.setEsal(slary);
		db.setEloc(eloc);
		db.setEexp(exp);
		
		try{
			
			PreparedStatement ps = connection.prepareStatement("insert into emp values(?,?,?,?,?)");
				  
				ps.setString(1,db.getEid());  
				ps.setString(2,db.getEname());  
				ps.setDouble(3,db.getEsal());  
				ps.setString(4,db.getEloc()); 
				ps.setInt(5,db.getEexp()); 
		
				int i=ps.executeUpdate();  
				
			out.print("Successfully Registered");	
			}
			
			catch (SQLException e) 
			{
			
				out.print(e);
			}
		out.print("<html><body>");
		out.print("<form action='index.html' "+ ">");
		out.print("<input type='submit' value='Go'>");
		out.print("</form></body></html>");
		
		
	}
	



	}


