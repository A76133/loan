package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("<style>\n");
      out.write("    body {\n");
      out.write("        font-family: Arial, sans-serif;\n");
      out.write("        background: #f2f2f2;\n");
      out.write("        margin: 0;\n");
      out.write("        padding: 0;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    /* Navbar */\n");
      out.write("    nav {\n");
      out.write("        background: #2e7d32; /* Dark green */\n");
      out.write("        display: flex;\n");
      out.write("        justify-content: space-between;\n");
      out.write("        align-items: center;\n");
      out.write("        padding: 12px 25px;\n");
      out.write("        border-radius: 0 0 8px 8px;\n");
      out.write("        color: white;\n");
      out.write("    }\n");
      out.write("    nav ul {\n");
      out.write("        list-style: none;\n");
      out.write("        display: flex;\n");
      out.write("        gap: 25px;\n");
      out.write("        margin: 0;\n");
      out.write("        padding: 0;\n");
      out.write("    }\n");
      out.write("    nav ul li a {\n");
      out.write("        text-decoration: none;\n");
      out.write("        color: white;\n");
      out.write("        font-weight: bold;\n");
      out.write("        padding: 6px 12px;\n");
      out.write("        border-radius: 5px;\n");
      out.write("        transition: 0.3s;\n");
      out.write("    }\n");
      out.write("    nav ul li a:hover, nav ul li a.active {\n");
      out.write("        background: rgba(255,255,255,0.2);\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    /* Footer */\n");
      out.write("    footer {\n");
      out.write("        background: #2e7d32; /* Dark green, same as navbar */\n");
      out.write("        color: white;\n");
      out.write("        text-align: center;\n");
      out.write("        padding: 15px 0;\n");
      out.write("        margin-top: 50px;\n");
      out.write("        border-radius: 8px 8px 0 0;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    /* Login Form */\n");
      out.write("    .login-container {\n");
      out.write("        max-width: 400px;\n");
      out.write("        margin: 80px auto;\n");
      out.write("        padding: 30px;\n");
      out.write("        background: white;\n");
      out.write("        border-radius: 12px;\n");
      out.write("        box-shadow: 0 8px 25px rgba(0,0,0,0.15);\n");
      out.write("    }\n");
      out.write("    .login-container h2 {\n");
      out.write("        text-align: center;\n");
      out.write("        margin-bottom: 25px;\n");
      out.write("        color: #333;\n");
      out.write("    }\n");
      out.write("    .login-container input[type=\"text\"], \n");
      out.write("    .login-container input[type=\"password\"] {\n");
      out.write("        width: 100%;\n");
      out.write("        padding: 12px 15px;\n");
      out.write("        margin: 10px 0;\n");
      out.write("        border: 1px solid #ccc;\n");
      out.write("        border-radius: 8px;\n");
      out.write("    }\n");
      out.write("    .login-container button {\n");
      out.write("        width: 100%;\n");
      out.write("        padding: 12px;\n");
      out.write("        margin-top: 15px;\n");
      out.write("        border: none;\n");
      out.write("        border-radius: 8px;\n");
      out.write("        background: linear-gradient(45deg, #ff9966, #ff5e62);\n");
      out.write("        color: white;\n");
      out.write("        font-weight: bold;\n");
      out.write("        cursor: pointer;\n");
      out.write("        transition: all 0.3s ease;\n");
      out.write("    }\n");
      out.write("    .login-container button:hover {\n");
      out.write("        background: linear-gradient(45deg, #ff7b6a, #ff3f43);\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .error-msg {\n");
      out.write("        color: red;\n");
      out.write("        text-align: center;\n");
      out.write("        margin-top: 10px;\n");
      out.write("    }\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <link href=\"Styles.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("<!-- Navbar (Same as other pages) -->\n");
      out.write("<nav style=\"background-color: #00aaff; padding: 15px; \">\n");
      out.write("    <div class=\"logo\"><a href=\"index.jsp\" style=\"color:white; font-weight:bold; font-size:1.2em;\">LoanPortal</a></div>\n");
      out.write("    <ul>\n");
      out.write("        <li><a href=\"index.html\">Home</a></li>\n");
      out.write("        <li><a href=\"index.html\">About</a></li>\n");
      out.write("        <li><a href=\"index.html\">Registration</a></li>\n");
      out.write("        <li><a href=\"admin.jsp\" class=\"active\">Admin</a></li>\n");
      out.write("    </ul>\n");
      out.write("</nav>\n");
      out.write("\n");
      out.write("<!-- Login Form -->\n");
      out.write("<div class=\"login-container\">\n");
      out.write("    <h2>Admin Login</h2>\n");
      out.write("    <form action=\"AdminServlet\" method=\"post\">\n");
      out.write("        <input type=\"text\" name=\"username\" placeholder=\"Username\" required>\n");
      out.write("        <input type=\"password\" name=\"password\" placeholder=\"Password\" required>\n");
      out.write("        <button type=\"submit\">Login</button>\n");
      out.write("    </form>\n");
      out.write("\n");
      out.write("    ");
 if(request.getAttribute("error") != null) { 
      out.write("\n");
      out.write("        <div class=\"error-msg\">");
      out.print( request.getAttribute("error") );
      out.write("</div>\n");
      out.write("    ");
 } 
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("<footer>\n");
      out.write("    <p>&copy; 2025 Consumer Loan Portal | All Rights Reserved</p>\n");
      out.write("    <p>Contact us: \n");
      out.write("       <a href=\"mailto:support@consumerloan.com\">support@consumerloan.com</a> | \n");
      out.write("       <a href=\"tel:+18001234567\">+1 800 123 4567</a></p>\n");
      out.write("</footer>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
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
