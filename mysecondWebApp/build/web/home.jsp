<%-- 
    Document   : home
    Created on : Dec 8, 2016, 8:46:57 PM
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
        </ul>
        <%
            if(session.getAttribute("u")!= null)
            {
                session.setAttribute("msg", "Your session has expired!! Please login again ");
                response.sendRedirect("index.jsp");
            }
        %>
        <div id="top">
             <h1>Welcome <% out.println(session.getAttribute("u")); %></h1>
        <h3>Things To Buy</h3>
        
        <a href="clothes.jsp">Clothes</a><br><br>
        <a href="laptop.jsp">Laptops</a><br><br>
        <a href="homeapp.jsp">Home Appliance</a><br><br>
        </div>
        
        <div id="bottom">
            <a href="Logout">Logout</a><br>
            Copyright &#169; Prajwal Verma
        </div>
    </body>
</html>
