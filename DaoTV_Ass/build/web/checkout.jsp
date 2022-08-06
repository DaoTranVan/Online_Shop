<%-- 
    Document   : checkout
    Created on : Mar 16, 2022, 11:10:02 AM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
    <c:set var="a" value="${requestScope.ac}" />
    <div class="newp">
        <p>Thông tin giao hàng</p><br>
        <form action="checkout" method="post">
        <div class="newa"><p1>Tên khách hàng</p1><p2><input type="text" name="name" value="${ac.name}"/></p2></div></br>
        <div class="newa"><p1>Địa chỉ</p1><p2><input type="text" name="address" value="${ac.address}"/></p2></div></br>
        <div class="newa"><p1>Tỉnh(Thành phố)</p1><p2><input type="text" name="city" value="${ac.city}"/></p2></div></br>
        <div class="newa"><p1>Số điện thoại</p1><p2><input type="text" name="phone" value="${ac.phone}"/></p2></div></br>
        <p3><input type="submit" value="Thanh toán"/></p3>
        </form>
    </div>
</body>
</html>
