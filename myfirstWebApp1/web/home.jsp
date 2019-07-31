<%-- 
    Document   : home.jsp
    Created on : Dec 4, 2016, 3:39:29 PM
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
        <h1>
        <center>
        Welcome <%
                    out.println(request.getAttribute("u"));
                %>
        </center>
        </h1>
    </body>
</html>
