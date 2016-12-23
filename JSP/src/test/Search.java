package test;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mysql.jdbc.PreparedStatement;

/**
 * Servlet implementation class Search
 */
@WebServlet("/Search")
public class Search extends HttpServlet {
	Connection connection= null;
	PreparedStatement ps= null;
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Search() {
        super();
        connection= MyConnection.getInstance().connection;
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
		String searchElement=request.getParameter("dropdwn");

		DaoOperations dao=new DaoOperations();
		if(searchElement.equals("id"))
		{
			RequestDispatcher requestDis=request.getRequestDispatcher("searchID.jsp");
			
			requestDis.forward(request, response);
		}
		else if(searchElement.equals("name"))
		{
RequestDispatcher requestDis=request.getRequestDispatcher("searchNAME.jsp");
			
			requestDis.forward(request, response);
		}
		else if(searchElement.equals("sal"))
		{
RequestDispatcher requestDis=request.getRequestDispatcher("searchSALARY.jsp");
			
			requestDis.forward(request, response);
		}
		else if(searchElement.equals("location"))
		{
RequestDispatcher requestDis=request.getRequestDispatcher("searchLOCATION.jsp");
			
			requestDis.forward(request, response);
		}
		else if(searchElement.equals("exp"))
		{
RequestDispatcher requestDis=request.getRequestDispatcher("searchEXP.jsp");
			
			requestDis.forward(request, response);

		
	}


	}
}

