<%-- 
    Document   : profile
    Created on : Mar 16, 2022, 3:59:50 PM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
    <c:set var="a" value="${requestScope.a}" />
    <div class="newp">
        <p>Thông tin cá nhân</p><br>
        <form action="profile" method="post">
        <div class="newa"><p1>Tên đăng nhập</p1><p2><input type="text" readonly name="userID" value="${a.userID}"/></p2></div></br>
        <div class="newa"><p1>Tên khách hàng</p1><p2><input type="text" name="name" value="${a.name}"/></p2></div></br>
        <div class="newa"><p1>Địa chỉ</p1><p2><input type="text" name="address" value="${a.address}"/></p2></div></br>
        <div class="newa"><p1>Tỉnh(Thành phố)</p1><p2><input type="text" name="city" value="${a.city}"/></p2></div></br>
        <div class="newa"><p1>Số điện thoại</p1><p2><input type="text" name="phone" value="${a.phone}"/></p2></div></br>
        <p3><input type="submit" value="UPDATE"/></p3>
        </form>
    </div>
</body>
</html>
