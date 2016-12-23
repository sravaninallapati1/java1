package test;

import java.io.IOException;

import java.io.PrintWriter;
import java.sql.*;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



import test.EmployeeBean;

/**
 * Servlet implementation class update
 */
@WebServlet("/update")
public class update extends HttpServlet {
	Connection connection=null;
	PreparedStatement pst=null;
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public update() {
        super();
        // TODO Auto-generated constructor stub
       
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		EmployeeBean db=new EmployeeBean();
		response.setContentType("text/html");  
		PrintWriter out=response.getWriter();
		String eid=request.getParameter("employeeId");
		String ename=request.getParameter("employeeName");
		String esal=request.getParameter("employeeSalary");
		String eloc=request.getParameter("employeeLocation");
		String eexp=request.getParameter("employeeExp");
		String eloan=request.getParameter("employeeLoan");
		double salary;
		Float exp;
		double loan;
		try
		{
			salary=Double.parseDouble(esal);
		 exp=Float.parseFloat(eexp);
			loan=Double.parseDouble(eloan);
		}
		catch(Exception e)
		{
			salary=0;
			exp=0.0f;
			loan=0;
		}
		
    db.setEmployeeId(eid);
	db.setEmployeeName(ename);
	db.setEmployeeSalary(salary);
	db.setEmployeeLocation(eloc);
	db.setEmployeeExp(exp);	
	db.setEmployeeLoan(loan);
		

	


	DaoOperations dbo=new DaoOperations();
	int x=dbo.update(db);
RequestDispatcher requestDispact=request.getRequestDispatcher("success.jsp");
	
	HttpSession session=request.getSession();
	session.setAttribute("employeeId",eid);
	
	if(x>0)
	{
		requestDispact.forward(request, response);
	}
	

}
}
		
		
		
	



	


