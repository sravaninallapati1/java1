package test3;

import java.io.IOException;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Test.Data;
import Test.MyConnection;

import java.sql.PreparedStatement;

/**
 * Servlet implementation class Delete
 */
@WebServlet("/Delete")
public class Delete extends HttpServlet {
	
	Connection connection;
	PreparedStatement pst;
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Delete() {
        super();
        connection=MyConnection.getInstance().connection;
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
		Data db=new Data();
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String eid=request.getParameter("eid");
		db.setEid(eid);
		try {
		PreparedStatement pst=connection.prepareStatement("delete from emp where eid=?");
			pst.setString(1,db.getEid());
			int d=pst.executeUpdate();
			out.print("Successfully Deleted");
		} 
		
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		out.print("<html><body>");
		out.print("<form action='index.html' "+ ">");
		out.print("<input type='submit' value='Go'>");
		out.print("</form></body></html>");
		
	}



	}


