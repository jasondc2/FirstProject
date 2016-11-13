<%-- 
    Document   : home
    Created on : Nov 12, 2016, 7:56:38 PM
    Author     : jason
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome</title>
    </head>
    <body>
        <h1>Welcome ${username}</h1>
        <br><br>
        <form action="Logout" method="POST">
              <input type="submit" value="Logout" />
         </form>
    </body>
</html>
