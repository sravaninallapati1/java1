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
 * Servlet implementation class SearchNAME
 */
@WebServlet("/SearchNAME")
public class SearchNAME extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchNAME() {
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
				
		    ArrayList<EmployeeBean> empList=dao.searchName(searchElement);
				
				
				HttpSession session=request.getSession();
				session.setAttribute("employeeList", empList);
				RequestDispatcher requestDis=request.getRequestDispatcher("searchNAME.jsp");
				
				requestDis.forward(request, response);
				
				}
				
								
			
		
	}


