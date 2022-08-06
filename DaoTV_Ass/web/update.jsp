<%-- 
    Document   : update
    Created on : Mar 13, 2022, 6:41:44 PM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
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
        <form action="update" method="post">
            <div class="newp">
                <div class="newa"><p1>Enter ProductID</p1><p2><input type="number" readonly name="pid" value="${p.productID}"/></p2></div></br>
                <div class="newa"><p1>Enter ProductName</p1><p2><input type="text" name="name" value="${p.productName}"/></p2></div></br>
                <div class="newa"><p1>Enter CategoryID</p1><p2><input type="text" name="cid" value="${p.categoryID}"/></p2></div></br>
                <div class="newa"><p1>Enter Image</p1><p2><input type="text" name="img" value="${p.img}"/></p2></div></br>
                <div class="newa"><p1>Enter Price</p1><p2><input type="text" name="price" value="${p.price}"/></p2></div></br>
            </div>
<!--            enter ID: <input type="number" readonly name="pid" value="${p.productID}"/><br/>
            enter name: <input type="text" name="name" value="${p.productName}"/><br/>
            enter categoryID: <input type="text" name="cid" value="${p.categoryID}"/><br/>
            enter img: <input type="text" name="img" value="${p.img}"/><br/>
            enter price: <input type="text" name="price" value="${p.price}"/><br/>-->
            <div class="news"><input type="submit" value="UPDATE"/></div><br/>
            
        </form>
    </body>
</html>
