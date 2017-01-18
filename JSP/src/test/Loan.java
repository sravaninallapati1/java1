package test;

import java.io.IOException;


import java.io.PrintWriter;
import java.sql.Connection;
import java.util.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mysql.jdbc.PreparedStatement;

/**
 * Servlet implementation class Loan
 */
//@WebServlet("/Loan")
public class Loan extends HttpServlet {
	Connection connection= null;
	PreparedStatement ps= null;
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Loan() {
        super();
        connection=MyConnection.getInstance().connection;
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
		

		
response.setContentType("text/html");  
		
		String eid=request.getParameter("EmployeeId");
		DaoOperations dao=new DaoOperations();
		ArrayList<EmployeeBean> empList=dao.loan(eid);
		
RequestDispatcher requestDispact=request.getRequestDispatcher("loan.jsp");
		
		HttpSession session=request.getSession();
		session.setAttribute("employeelist",empList);
		
		
			requestDispact.forward(request, response);
		
	}
	
		
		
		
		
	}



	

	


