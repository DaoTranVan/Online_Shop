<%-- 
    Document   : bill
    Created on : Mar 17, 2022, 9:42:57 AM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            .newp{
                text-align: center;
                
            }
            .newp p{
                margin-top: 30px;
                margin-bottom: 20px;
                font-size: 25px;
                color: red;
                font-weight: bold;
            }
            .newa{
                display: flex;
                justify-content: space-between;
            }
            .newp p1{
                font-size: 20px;
                color: red;
                font-weight: bold;
                margin-left: 34%;
            }
            .newp p2{
                padding-bottom: 5px;
                padding-left: 20px;
                margin-bottom: 20px;
                float: right;
                width: 20%;
                border-radius: 30px;
                margin-right: 34%;
            }    
            .newa input{
                width: 400px;
                height: 20px;
            }
        </style>
    </head>
    <body>
        <h1>Mua hàng thành công!</h1>
        <c:set var="a" value="${requestScope.account}"/>
        <c:set var="o" value="${requestScope.cart}"/>
        <div class="newa"><p1>Tên khách hàng</p1><p2>${a.name}</p2></div></br>
        <div class="newa"><p1>Địa chỉ</p1><p2>${a.address}</p2></div></br>
        <div class="newa"><p1>Tỉnh(Thành phố)</p1><p2>${a.city}</p2></div></br>
        <div class="newa"><p1>Số điện thoại</p1><p2>${a.home}</p2></div></br>
        <div class="newa"><p1>Thành tiền</p1><p2>${o.totalMoney}</p2></div></br>
        <a href="home">CONTINUE SHOPPING</a>
    </body>
</html>
