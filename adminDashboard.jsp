<%-- 
    Document   : adminDashboard
    Created on : 26 Oct, 2025, 8:33:28 PM
    Author     : patid
--%>

<%@page import="Loan.AdminServlet"%>
<%@page import="Loan.User"%>
<%@page import="Loan.Dao" %>
<%@ page import="java.util.*,java.sql.*" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    List<String[]> loanList = (List<String[]>) request.getAttribute("loanList");
    if(loanList == null) loanList = new ArrayList<>();

    int totalApps = request.getAttribute("totalApps") != null ? (Integer)request.getAttribute("totalApps") : 0;
    int approvedApps = request.getAttribute("approvedApps") != null ? (Integer)request.getAttribute("approvedApps") : 0;
    int pendingApps = request.getAttribute("pendingApps") != null ? (Integer)request.getAttribute("pendingApps") : 0;
%>

<!DOCTYPE html>
<html>
<head>
    <title>Admin Dashboard</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background: #f4f4f9;
            margin: 0;
            padding: 0;
        }

        /* Navbar */
        nav {
            background: #2e7d32;
            display: flex;
            justify-content: space-between;
            align-items: center;
            padding: 12px 25px;
            color: white;
        }
        nav ul {
            list-style: none;
            display: flex;
            gap: 25px;
            margin: 0;
            padding: 0;
        }
        nav ul li a {
            text-decoration: none;
            color: white;
            font-weight: bold;
            padding: 6px 12px;
            border-radius: 5px;
            transition: 0.3s;
        }
        nav ul li a:hover {
            background: rgba(255,255,255,0.2);
        }

        /* Dashboard summary cards */
        .cards {
            display: flex;
            justify-content: space-around;
            margin: 20px auto;
            max-width: 900px;
            gap: 20px;
        }
        .card {
            background: #fff;
            border-radius: 12px;
            padding: 20px;
            flex: 1;
            text-align: center;
            box-shadow: 0 5px 20px rgba(0,0,0,0.1);
        }
        .card h2 {
            margin: 0 0 10px;
            color: #2e7d32;
        }
        .card p {
            font-size: 24px;
            margin: 0;
            font-weight: bold;
        }

        /* Table */
        table {
            width: 90%;
            margin: 20px auto;
            border-collapse: collapse;
            background: #fff;
            border-radius: 12px;
            overflow: hidden;
            box-shadow: 0 5px 20px rgba(0,0,0,0.1);
        }
        table th, table td {
            padding: 12px 15px;
            border-bottom: 1px solid #ddd;
            text-align: center;
        }
        table th {
            background: #2e7d32;
            color: white;
        }
        table tr:nth-child(even) {
            background: #f9f9f9;
        }

        /* Approve button */
        button {
            padding: 6px 12px;
            background: #ff7043;
            color: white;
            border: none;
            border-radius: 6px;
            cursor: pointer;
            transition: 0.3s;
        }
        button:hover {
            background: #f4511e;
        }

        /* Footer */
        footer {
            background: #2e7d32;
            color: white;
            text-align: center;
            padding: 15px 0;
            margin-top: 50px;
        }
    </style>
</head>
<body>

<nav>
    <div><strong>Admin Dashboard</strong></div>
    <ul>
        <li><a href="AdminServlet">Home</a></li>
        <li><a href="LogoutServlet">Logout</a></li>
    </ul>
</nav>

<div class="cards">
    <div class="card">
        <h2>Total Applications</h2>
        <p><%= totalApps %></p>
    </div>
    <div class="card">
        <h2>Approved Applications</h2>
        <p><%= approvedApps %></p>
    </div>
    <div class="card">
        <h2>Pending Applications</h2>
        <p><%= pendingApps %></p>
    </div>
</div>
   
    <%
     User obj=new User();
     List<User> li=Dao.loadLoanList();
     
    
    %>
<table>
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Email</th>
        <th>Phone</th>
        <th>Amount</th>
        <th>Purpose</th>
         <th>status</th>
        <th>Created Us</th>
        <th>Delete</th>
        
    </tr>

<%
    
    for(User loan : li) {
        
%>
<tr>
    <td><%= loan.getId() %></td> <!-- ID -->
    <td><%= loan.getName() %></td> <!-- Name -->
    <td><%= loan.getEmail() %></td> <!-- Email -->
    <td><%= loan.getPhone() %></td> <!-- Phone -->
    <td><%= loan.getAmount() %></td> <!-- Amount -->
    <td><%= loan.getPurpose() %></td> <!-- Purpose -->
    
    <td>
        <%= loan.getStatus() %>
        <% if("Pending".equalsIgnoreCase(loan.getStatus())) { %>
            <form action="ApproveLoanServlet" method="post" style="display:inline;">
                <input type="hidden" name="id" value="<%= loan.getId() %>">
                <button >Approve</button>
               
            </form>
                 
        <% } %>
    </td>
    
    <td><%= loan.getCreated_at() %></td><!--created us-->
    <td>
        <form action="delete" method="post" style="display:inline;">
                <input type="hidden" name="id" value="<%= loan.getId() %>">
                <button >delete</button>
               
            </form>
    
    </td>
</tr>
<% } %>
</table>

<footer>
    Contact us: admin@creditloan.com | +91-1234567890
</footer>

</body>
</html>
