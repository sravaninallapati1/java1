package test;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SearchEXP
 */
@WebServlet("/SearchEXP")
public class SearchEXP extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchEXP() {
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
		String searchElement=request.getParameter("searchElement");


		PrintWriter out=response.getWriter();
				DaoOperations dao=new DaoOperations();
				
		    ArrayList<EmployeeBean> empList=dao.searchEXP(searchElement);
				
				
				HttpSession session=request.getSession();
				session.setAttribute("employeeList", empList);
				RequestDispatcher requestDis=request.getRequestDispatcher("searchEXP.jsp");
				
				requestDis.forward(request, response);
				
				}
				
								
			
		
	}


