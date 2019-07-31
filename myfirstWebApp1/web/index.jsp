<%-- 
    Document   : index
    Created on : Dec 4, 2016, 12:13:03 PM
    Author     : Prajwal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body style="text-align: center">
        <h1>Welcome </h1><br><br>
        
        <form action="loginServlet2">
            Username : <input type="text" name="textUser"/><br><br>
            Password  : <input type="password" name="textPass"/><br><br> 
            <input type="Submit" value="Login"/>
        </form>
    </body>
</html>
