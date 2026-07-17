package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Loan.AdminServlet;
import Loan.User;
import Loan.Dao;
import java.util.*;
import java.sql.*;

public final class adminDashboard_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    List<String[]> loanList = (List<String[]>) request.getAttribute("loanList");
    if(loanList == null) loanList = new ArrayList<>();

    int totalApps = request.getAttribute("totalApps") != null ? (Integer)request.getAttribute("totalApps") : 0;
    int approvedApps = request.getAttribute("approvedApps") != null ? (Integer)request.getAttribute("approvedApps") : 0;
    int pendingApps = request.getAttribute("pendingApps") != null ? (Integer)request.getAttribute("pendingApps") : 0;

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <title>Admin Dashboard</title>\n");
      out.write("    <style>\n");
      out.write("        body {\n");
      out.write("            font-family: Arial, sans-serif;\n");
      out.write("            background: #f4f4f9;\n");
      out.write("            margin: 0;\n");
      out.write("            padding: 0;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* Navbar */\n");
      out.write("        nav {\n");
      out.write("            background: #2e7d32;\n");
      out.write("            display: flex;\n");
      out.write("            justify-content: space-between;\n");
      out.write("            align-items: center;\n");
      out.write("            padding: 12px 25px;\n");
      out.write("            color: white;\n");
      out.write("        }\n");
      out.write("        nav ul {\n");
      out.write("            list-style: none;\n");
      out.write("            display: flex;\n");
      out.write("            gap: 25px;\n");
      out.write("            margin: 0;\n");
      out.write("            padding: 0;\n");
      out.write("        }\n");
      out.write("        nav ul li a {\n");
      out.write("            text-decoration: none;\n");
      out.write("            color: white;\n");
      out.write("            font-weight: bold;\n");
      out.write("            padding: 6px 12px;\n");
      out.write("            border-radius: 5px;\n");
      out.write("            transition: 0.3s;\n");
      out.write("        }\n");
      out.write("        nav ul li a:hover {\n");
      out.write("            background: rgba(255,255,255,0.2);\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* Dashboard summary cards */\n");
      out.write("        .cards {\n");
      out.write("            display: flex;\n");
      out.write("            justify-content: space-around;\n");
      out.write("            margin: 20px auto;\n");
      out.write("            max-width: 900px;\n");
      out.write("            gap: 20px;\n");
      out.write("        }\n");
      out.write("        .card {\n");
      out.write("            background: #fff;\n");
      out.write("            border-radius: 12px;\n");
      out.write("            padding: 20px;\n");
      out.write("            flex: 1;\n");
      out.write("            text-align: center;\n");
      out.write("            box-shadow: 0 5px 20px rgba(0,0,0,0.1);\n");
      out.write("        }\n");
      out.write("        .card h2 {\n");
      out.write("            margin: 0 0 10px;\n");
      out.write("            color: #2e7d32;\n");
      out.write("        }\n");
      out.write("        .card p {\n");
      out.write("            font-size: 24px;\n");
      out.write("            margin: 0;\n");
      out.write("            font-weight: bold;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* Table */\n");
      out.write("        table {\n");
      out.write("            width: 90%;\n");
      out.write("            margin: 20px auto;\n");
      out.write("            border-collapse: collapse;\n");
      out.write("            background: #fff;\n");
      out.write("            border-radius: 12px;\n");
      out.write("            overflow: hidden;\n");
      out.write("            box-shadow: 0 5px 20px rgba(0,0,0,0.1);\n");
      out.write("        }\n");
      out.write("        table th, table td {\n");
      out.write("            padding: 12px 15px;\n");
      out.write("            border-bottom: 1px solid #ddd;\n");
      out.write("            text-align: center;\n");
      out.write("        }\n");
      out.write("        table th {\n");
      out.write("            background: #2e7d32;\n");
      out.write("            color: white;\n");
      out.write("        }\n");
      out.write("        table tr:nth-child(even) {\n");
      out.write("            background: #f9f9f9;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* Approve button */\n");
      out.write("        button {\n");
      out.write("            padding: 6px 12px;\n");
      out.write("            background: #ff7043;\n");
      out.write("            color: white;\n");
      out.write("            border: none;\n");
      out.write("            border-radius: 6px;\n");
      out.write("            cursor: pointer;\n");
      out.write("            transition: 0.3s;\n");
      out.write("        }\n");
      out.write("        button:hover {\n");
      out.write("            background: #f4511e;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* Footer */\n");
      out.write("        footer {\n");
      out.write("            background: #2e7d32;\n");
      out.write("            color: white;\n");
      out.write("            text-align: center;\n");
      out.write("            padding: 15px 0;\n");
      out.write("            margin-top: 50px;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<nav>\n");
      out.write("    <div><strong>Admin Dashboard</strong></div>\n");
      out.write("    <ul>\n");
      out.write("        <li><a href=\"AdminServlet\">Home</a></li>\n");
      out.write("        <li><a href=\"LogoutServlet\">Logout</a></li>\n");
      out.write("    </ul>\n");
      out.write("</nav>\n");
      out.write("\n");
      out.write("<div class=\"cards\">\n");
      out.write("    <div class=\"card\">\n");
      out.write("        <h2>Total Applications</h2>\n");
      out.write("        <p>");
      out.print( totalApps );
      out.write("</p>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"card\">\n");
      out.write("        <h2>Approved Applications</h2>\n");
      out.write("        <p>");
      out.print( approvedApps );
      out.write("</p>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"card\">\n");
      out.write("        <h2>Pending Applications</h2>\n");
      out.write("        <p>");
      out.print( pendingApps );
      out.write("</p>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("   \n");
      out.write("    ");

     User obj=new User();
     List<User> li=Dao.loadLoanList();
     
    
    
      out.write("\n");
      out.write("<table>\n");
      out.write("    <tr>\n");
      out.write("        <th>ID</th>\n");
      out.write("        <th>Name</th>\n");
      out.write("        <th>Email</th>\n");
      out.write("        <th>Phone</th>\n");
      out.write("        <th>Amount</th>\n");
      out.write("        <th>Purpose</th>\n");
      out.write("         <th>status</th>\n");
      out.write("        <th>Created Us</th>\n");
      out.write("        \n");
      out.write("    </tr>\n");
      out.write("\n");

    
    for(User loan : li) {
        

      out.write("\n");
      out.write("<tr>\n");
      out.write("    <td>");
      out.print( loan.getId() );
      out.write("</td> <!-- ID -->\n");
      out.write("    <td>");
      out.print( loan.getName() );
      out.write("</td> <!-- Name -->\n");
      out.write("    <td>");
      out.print( loan.getEmail() );
      out.write("</td> <!-- Email -->\n");
      out.write("    <td>");
      out.print( loan.getPhone() );
      out.write("</td> <!-- Phone -->\n");
      out.write("    <td>");
      out.print( loan.getAmount() );
      out.write("</td> <!-- Amount -->\n");
      out.write("    <td>");
      out.print( loan.getPurpose() );
      out.write("</td> <!-- Purpose -->\n");
      out.write("    \n");
      out.write("    <td>\n");
      out.write("        ");
      out.print( loan.getStatus() );
      out.write("\n");
      out.write("        ");
 if("Pending".equalsIgnoreCase(loan.getStatus())) { 
      out.write("\n");
      out.write("            <form action=\"ApproveLoanServlet\" method=\"post\" style=\"display:inline;\">\n");
      out.write("                <input type=\"hidden\" name=\"id\" value=\"");
      out.print( loan.getId() );
      out.write("\">\n");
      out.write("                <button >Approve</button>\n");
      out.write("               \n");
      out.write("            </form>\n");
      out.write("                 \n");
      out.write("        ");
 } 
      out.write("\n");
      out.write("    </td>\n");
      out.write("    \n");
      out.write("    <td>");
      out.print( loan.getCreated_at() );
      out.write("</td><!--created us-->\n");
      out.write("</tr>\n");
 } 
      out.write("\n");
      out.write("</table>\n");
      out.write("\n");
      out.write("<footer>\n");
      out.write("    Contact us: admin@creditloan.com | +91-1234567890\n");
      out.write("</footer>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
