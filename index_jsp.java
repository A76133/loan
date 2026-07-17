package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <title>Consumer Loan Portal</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"styles.css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <link href=\"Styles.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("<header>\n");
      out.write("    <h1>Consumer Loan Portal</h1>\n");
      out.write("    <p>Simple • Fast • Secure</p>\n");
      out.write("</header>\n");
      out.write("\n");
      out.write("<nav>\n");
      out.write("    <a href=\"index.jsp\">Home</a>\n");
      out.write("    <a href=\"#about\">About</a>\n");
      out.write("    <a href=\"#registration\">Registration</a>\n");
      out.write("    <a href=\"AdminServlet\">Admin</a>\n");
      out.write("</nav>\n");
      out.write("\n");
      out.write("<section class=\"hero\">\n");
      out.write("    <h1>Apply for a Consumer Loan Easily</h1>\n");
      out.write("    <p>Get quick approvals and low-interest rates for your financial needs.</p>\n");
      out.write("</section>\n");
      out.write("\n");
      out.write("<section class=\"container\" id=\"registration\">\n");
      out.write("    <h2>Loan Registration Form</h2>\n");
      out.write("    <form action=\"RegistrationServlet\" method=\"post\">\n");
      out.write("        <input type=\"text\" name=\"name\" placeholder=\"Full Name\" required>\n");
      out.write("        <input type=\"email\" name=\"email\" placeholder=\"Email Address\" required>\n");
      out.write("        <input type=\"number\" name=\"phone\" placeholder=\"Phone Number\" required>\n");
      out.write("        <input type=\"number\" name=\"amount\" placeholder=\"Loan Amount ($)\" required>\n");
      out.write("        <textarea name=\"purpose\" rows=\"4\" placeholder=\"Purpose of Loan\" required></textarea>\n");
      out.write("        <button type=\"submit\">Submit Application</button>\n");
      out.write("    </form>\n");
      out.write("</section>\n");
      out.write("\n");
      out.write("<footer>\n");
      out.write("    <p>&copy; 2025 Consumer Loan Portal | All Rights Reserved</p>\n");
      out.write("    <p>Contact us: \n");
      out.write("       <a href=\"mailto:support@consumerloan.com\">support@consumerloan.com</a> | \n");
      out.write("       <a href=\"tel:+18001234567\">+1 800 123 4567</a></p>\n");
      out.write("</footer>\n");
      out.write("\n");
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
