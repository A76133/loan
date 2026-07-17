<%-- 
    Document   : success
    Created on : 26 Oct, 2025, 7:39:14 PM
    Author     : patid
--%>

<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Welcome</title>
    <meta http-equiv="refresh" content="10;URL=index.html">
    <link rel="stylesheet" href="styles.css">
</head>
<body>
    <link href="Styles.css" rel="stylesheet" type="text/css"/>
<header>
    <h1>Welcome, <%= request.getAttribute("username") %> 🎉</h1>
    <p>Your consumer loan application has been submitted successfully.</p>
</header>

<section class="container" style="text-align:center;">
    <h2>Redirecting to home page in 10 seconds...</h2>
    <p>Thank you for choosing our services.</p>
</section>

<footer>
    <p>&copy; 2025 Consumer Loan Portal</p>
</footer>
</body>
</html>



