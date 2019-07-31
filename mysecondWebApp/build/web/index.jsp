<%-- 
    Document   : index
    Created on : Dec 8, 2016, 9:05:33 AM
    Author     : Prajwal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css0.css" rel="stylesheet">
        <title>JSP Page</title>
    </head>
    <body>
        <div id="top">
        <h1>Welcome To ShopKart</h1>
        </div>
        <br><br>
        <div id="middle">
        <form action="loginValidateServlet">
            Username : <input type="text" name="uname"><br><br>
            Password : <input type="password" name="pass"><br><br>
            <input type="submit" name="submit" value="Login">
        </form>
            <br><br>
            Not a Member yet? <a href="register.jsp"> Register here </a>
        
        <br><br>
        <font style="color: red">
        <%
            if(request.getAttribute("err") != null)
            {
                out.println(request.getAttribute("err"));
            }
        %>
        </font>
        </div>
            <div id="bottom">
                Copyright &#169; Prajwal Verma
            </div>
    </body>
</html>
