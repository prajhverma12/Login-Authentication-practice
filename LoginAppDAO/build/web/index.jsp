<%-- 
    Document   : index
    Created on : Dec 13, 2016, 7:58:12 AM
    Author     : Prajwal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <center>
        <h1>Welcome</h1><br><br>
        <form action="LoginAuthServlet">
            <input type="text" name="username" placeholder="Enter Your Username"/><br><br>
            <input type="password" name="pass" placeholder="Enter Your Password"/><br><br>
            <input type="submit" name="submit" value="Login"/><br><br>
        </form>
        </center>
    </body>
</html>
