<%-- 
    Document   : register
    Created on : Dec 8, 2016, 10:48:20 AM
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
        <h3>Enter your Details here </h3>
        </div>
        <div id="middle">
        <form action="RegisterServlet">
            Mobile No : <input type="number" name="mobile_no"><br><br>
            Name : <input type="text" name="username"><br><br>
            Login ID : <input type="text" name="lgn_id"><br><br>
            Password : <input type="password" name="password"><br><br>
            Address : <input type="text" name="address"><br><br>
            Email ID : <input type="email" name="email"><br><br>
            Gender : <input type="radio" name="gender" value="Male">Male <input type="radio" name="gender" value="Female">Female <br><br>
            <input type="submit" name="submit" value="Register">
            
        </form>
        </div>
        <div id="bottom">
                Copyright &#169; Prajwal Verma
            </div>
        
    </body>
</html>
