<%-- 
    Document   : s
    Created on : 2025. 3. 14, 오후 3:44:29
    Author     : WIN 11 PRO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration</title>
    </head>
    <body>
        <h2>Registration Form</h2>
        
        <form action="welcome.jsp" method="post">
            <label name="email">Email:</label><br>
            <input name="email" value=""><br>
            <br>
            <label name="name">Name:</label><br>
            <input name="name" value=""><br>
            <br>
            <br>
            <label name="password">Password:</label><br>
            <input name="email" value=""><br>
            <br>
            <br>
            <form>
                <label name="gender">Gender:</label><br>
                <input type="radio" id="gen1" name="gen1" value="Male"><br>
                <label for="gen1">Male</label><br>
                <input type="radio" id="gen2" name="gen2" value="Female"><br>
                <label for="gen2">Female</label>
                <br>
            </form>
            <br>
            <br>
            <label name="facvol">Favcol:</label>
            <input name="favcol" value="">
            <br>
            <br>
            <label name="tos">Tos:</label>
            <input name="tos" value="">
            <br>
            <br>
                <input type="submit" value="Submit">
        </form>
    </body>
</html>
