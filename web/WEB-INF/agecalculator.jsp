<%-- 
    Document   : agecalculator
    Created on : 23-Sep-2022, 8:27:45 AM
    Author     : Kyle Helmer
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form action="age" method="post" >
        Enter your Age: <input type="text" name="userAge" value="">
        <br>
        <input type="submit" value="Age next birthday">
       
        <p>
            ${message}
        </p>
            <a href="arithmetic">Arithmetic Calculator</a>
        </form>   
                
    </body>
</html>
