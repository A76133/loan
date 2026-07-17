<%-- 
    Document   : admin
    Created on : 26 Oct, 2025, 8:01:54 PM
    Author     : patid
--%>

<style>
    body {
        font-family: Arial, sans-serif;
        background: #f2f2f2;
        margin: 0;
        padding: 0;
    }

    /* Navbar */
    nav {
        background: #2e7d32; /* Dark green */
        display: flex;
        justify-content: space-between;
        align-items: center;
        padding: 12px 25px;
        border-radius: 0 0 8px 8px;
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
    nav ul li a:hover, nav ul li a.active {
        background: rgba(255,255,255,0.2);
    }

    /* Footer */
    footer {
        background: #2e7d32; /* Dark green, same as navbar */
        color: white;
        text-align: center;
        padding: 15px 0;
        margin-top: 50px;
        border-radius: 8px 8px 0 0;
    }

    /* Login Form */
    .login-container {
        max-width: 400px;
        margin: 80px auto;
        padding: 30px;
        background: white;
        border-radius: 12px;
        box-shadow: 0 8px 25px rgba(0,0,0,0.15);
    }
    .login-container h2 {
        text-align: center;
        margin-bottom: 25px;
        color: #333;
    }
    .login-container input[type="text"], 
    .login-container input[type="password"] {
        width: 100%;
        padding: 12px 15px;
        margin: 10px 0;
        border: 1px solid #ccc;
        border-radius: 8px;
    }
    .login-container button {
        width: 100%;
        padding: 12px;
        margin-top: 15px;
        border: none;
        border-radius: 8px;
        background: linear-gradient(45deg, #ff9966, #ff5e62);
        color: white;
        font-weight: bold;
        cursor: pointer;
        transition: all 0.3s ease;
    }
    .login-container button:hover {
        background: linear-gradient(45deg, #ff7b6a, #ff3f43);
    }

    .error-msg {
        color: red;
        text-align: center;
        margin-top: 10px;
    }
</style>



</head>
<body>
    <link href="Styles.css" rel="stylesheet" type="text/css"/>
<!-- Navbar (Same as other pages) -->
<nav style="background-color: #00aaff; padding: 15px; ">
    <div class="logo"><a href="index.jsp" style="color:white; font-weight:bold; font-size:1.2em;">LoanPortal</a></div>
    <ul>
        <li><a href="index.html">Home</a></li>
        <li><a href="index.html">About</a></li>
        <li><a href="index.html">Registration</a></li>
        <li><a href="admin.jsp" class="active">Admin</a></li>
    </ul>
</nav>

<!-- Login Form -->
<div class="login-container">
    <h2>Admin Login</h2>
    <form action="AdminServlet" method="post">
        <input type="text" name="username" placeholder="Username" required>
        <input type="password" name="password" placeholder="Password" required>
        <button type="submit">Login</button>
    </form>

    <% if(request.getAttribute("error") != null) { %>
        <div class="error-msg"><%= request.getAttribute("error") %></div>
    <% } %>
</div>


<footer>
    <p>&copy; 2025 Consumer Loan Portal | All Rights Reserved</p>
    <p>Contact us: 
       <a href="mailto:support@consumerloan.com">support@consumerloan.com</a> | 
       <a href="tel:+18001234567">+1 800 123 4567</a></p>
</footer>
</body>
</html>


