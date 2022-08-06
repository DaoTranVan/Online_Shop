<%-- 
    Document   : new
    Created on : Mar 13, 2022, 5:15:55 PM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style type="text/css">
            <%@include file="css/index.css" %>
        </style>
    </head>
    <body>
        <h1>Add a new Product</h1>
        <h3 style="color: red">${requestScope.error}</h3>
        <form action="add">
            <div class="newp">
                <div class="newa"><p1>Enter ProductID</p1><p2><input type="text" name="pid"/></p2></div></br>
                <div class="newa"><p1>Enter ProductName</p1><p2><input type="text" name="name"/></p2></div></br>
                <div class="newa"><p1>Enter CategoryID</p1><p2><input type="text" name="cid"/></p2></div></br>
                <div class="newa"><p1>Enter Images</p1><p2><input type="text" name="img"/></p2></div></br>
                <div class="newa"><p1>Enter Price</p1><p2><input type="text" name="price"/></p2></div></br>
            </div>
            <div class="news"><input class="newps" type="submit" value="SAVE"/></div><br/>
        </form>
    </body>
</html>
