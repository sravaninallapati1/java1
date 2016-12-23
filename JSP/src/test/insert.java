package test;

import java.io.IOException;




import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import test.MyConnection;

/**
 * Servlet implementation class insert
 */
//@WebServlet("/insert")
public class insert extends HttpServlet {
	Connection connection = null;
	PreparedStatement ps= null;
	
	
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public insert() {
        super();
        
    	
        
        // TODO Auto-generated constructor stub
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
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		String employeeId=request.getParameter("employeeId");
		String employeeName=request.getParameter("employeeName");
		String employeeSalary=request.getParameter("employeeSalary");
		String employeeLocation=request.getParameter("employeeLocation");
		String employeeExp=request.getParameter("employeeExp");
		
		
		double salary;
		float exp;
		
		
		 salary=Double.parseDouble(employeeSalary);
		 exp=Float.parseFloat(employeeExp);
		 
		
		
	
		EmployeeBean employeeBean=new EmployeeBean();
		employeeBean.setEmployeeId(employeeId);
		employeeBean.setEmployeeName(employeeName);
		employeeBean.setEmployeeSalary(salary);
		employeeBean.setEmployeeLocation(employeeLocation);
		employeeBean.setEmployeeExp(exp);
		
				
		DaoOperations dao=new DaoOperations();
		int result=dao.insertData(employeeBean);
		
		RequestDispatcher requestDispact=request.getRequestDispatcher("succes.jsp");
		
		HttpSession session=request.getSession();
		session.setAttribute("employeeId", employeeId);
		
		if(result>0)
		{
			requestDispact.forward(request, response);
		}
		
		
		
		
		
		
	}



	}


