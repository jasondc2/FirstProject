<%-- 
    Document   : login
    Created on : Nov 12, 2016, 7:55:42 PM
    Author     : jason
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sign Page</title>
    </head>
    <body>
         <span class="error" style="color:red;">${error}</span>
         <form action="Login" method="POST">
              Username: <input type="text" name="username" /><br />
              Password: <input type="password" name="password" /><br />
              <input type="submit" value="Sign In" />
         </form>
    </body>
</html>
