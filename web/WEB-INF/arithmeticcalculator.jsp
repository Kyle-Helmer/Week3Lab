<%-- 
    Document   : arithmeticcalculator
    Created on : 23-Sep-2022, 8:27:21 AM
    Author     : Kyle Helmer
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form action="arithmetic" method="post">
            
        First: <input type="text" name="first" value="${first}"><br>
        Second: <input type="text" name="second" value="${second}"><br>
        <input type="submit" name="operation" value="+">
        <input type="submit" name="operation" value="-">
        <input type="submit" name="operation" value="*">
        <input type="submit" name="operation" value="%">
        <br>
        <p>
            Result: ${result}
        </p>
        <a href="age">Age Calculator</a>
        </form>
        
    </body>
</html>
