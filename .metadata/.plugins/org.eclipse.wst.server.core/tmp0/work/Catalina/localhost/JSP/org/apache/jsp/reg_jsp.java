/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.64
 * Generated at: 2016-12-22 18:25:50 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class reg_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("\r\n");
      out.write("<script type \"text/javascripit\">\r\n");
      out.write("\r\n");
      out.write("function validation()\r\n");
      out.write("{\r\n");
      out.write("\t\r\n");
      out.write("var employeeId=document.getElementById(employeeId).value;\r\n");
      out.write("if(employeeId==\" \"||employeeId==null)\r\n");
      out.write("\t{\r\n");
      out.write("\t//alert(\"please enter employeeid\");\r\n");
      out.write("\tdocument.getElementById(\"error\").innerHTML=\"please enter id\";\r\n");
      out.write("\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("else\r\n");
      out.write("\treturn true;\r\n");
      out.write("\t\r\n");
      out.write("\t}function clearFiled()\r\n");
      out.write("\t{\r\n");
      out.write("\t\tdocument.getElementById(\"error\")\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("</script>\r\n");
      out.write("<style type =\"text/css\">\r\n");
      out.write("#dot{\r\n");
      out.write("color:red;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body style=\"background-color:Moccasin\">\r\n");
      out.write("<div align=\"center\">\r\n");
      out.write("<h1>Employee details</h1>\r\n");
      out.write("\r\n");
      out.write("<form action=\"insertServlet\" method=\"post\">\r\n");
      out.write("\r\n");
      out.write(" <table>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td>Enter Employee Id:\r\n");
      out.write("      <sup id=\"dot\">.... </sup></td>\r\n");
      out.write("      <td><input type=\"text\" name=\"employeeId\" id= \"employeeid\" onkeypress=\"return clearField()\"/></td>\r\n");
      out.write("      <td><span id=\"error\"></span></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td>Enter Employee Name:</td>\r\n");
      out.write("      <td><input type=\"text\" name=\"employeeName\" /></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td>Enter Salary:</td>\r\n");
      out.write("      <td><input type=\"number\" name=\"employeeSalary\" /></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("     <tr>\r\n");
      out.write("      <td>Enter Location:</td>\r\n");
      out.write("      <td><input type=\"text\" name=\"employeeLocation\" /></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td>Enter Experience:</td>\r\n");
      out.write("      <td><input type=\"number\" name=\"employeeExp\" /></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("   <!--  <tr>\r\n");
      out.write("    <td>Enter Loan:</td>\r\n");
      out.write("    <td><input type=\"number\" name=\"employeeLoan\"/></td>\r\n");
      out.write("    </tr> -->\r\n");
      out.write("    \r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("<input type=\"submit\" value=\"Submit\" onclick=\"return validation()\">\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
