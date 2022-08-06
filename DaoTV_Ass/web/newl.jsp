<%-- 
    Document   : newp
    Created on : Mar 13, 2022, 8:15:06 PM
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
        <h1>Add new infomation for PC</h1>
        <h3 style="color: red">${requestScope.error}</h3>
        <form action="addil">
            <div class="newp">
                <div class="newa"><p1>Enter CPU</p1><p2><input type="text" name="cpu"/></p2></div></br>
                <div class="newa"><p1>Enter GPU</p1><p2><input type="text" name="gpu"/></p2></div></br>
                <div class="newa"><p1>Enter Màn hình</p1><p2><input type="text" name="manhinh"/></p2></div></br>
                <div class="newa"><p1>Enter Hệ điều hành</p1><p2><input type="text" name="hedieuhanh"/></p2></div></br>
                <div class="newa"><p1>Enter RAM</p1><p2><input type="text" name="ram"/></p2></div></br>
                <div class="newa"><p1>Enter Ổ cứng SSD</p1><p2><input type="text" name="ssd"/></p2></div></br>
                <div class="newa"><p1>Enter Ổ cứng HDD</p1><p2><input type="text" name="hdd"/></p2></div></br>
                <div class="newa"><p1>Enter Lan</p1><p2><input type="text" name="lan"/></p2></div></br>
                <div class="newa"><p1>Enter Wireless Lan</p1><p2><input type="text" name="wlan"/></p2></div></br>
                <div class="newa"><p1>Enter Các cổng kết nối</p1><p2><input type="text" name="congketnoi"/></p2></div></br>
                <div class="newa"><p1>Enter Bàn phím</p1><p2><input type="text" name="banphim"/></p2></div></br>
                <div class="newa"><p1>Enter Pin</p1><p2><input type="text" name="pin"/></p2></div></br>
                <div class="newa"><p1>Enter Kích thước</p1><p2><input type="text" name="kichthuoc"/></p2></div></br>
                <div class="newa"><p1>Enter Trọng lượng</p1><p2><input type="text" name="trongluong"/></p2></div></br>
            </div>
            <div class="news"><input class="newps" type="submit" value="SAVE"/></div><br/>
        </form>
    </body>
</html>
