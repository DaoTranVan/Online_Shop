<%-- 
    Document   : changepass
    Created on : Mar 16, 2022, 7:15:41 PM
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
            .changepass{
                padding-top: 30px;
                padding-bottom: 30px;
                margin: auto;
                width: 400px;
                text-align: center;
                border: 1px solid grey;
                border-radius: 10px;

            }
            .cha{
                padding-bottom: 20px;
                text-align: center;
                color: red;
                font-family: sans-serif;
                font-size: 30px;
            }
            .use{
                width: 300px;
                height: 40px;
                margin-bottom: 20px;
                border-radius: 5px;
                border: 1px  solid grey;
                padding-left: 20px;
            }
            button{
                width: 320px;
                height: 40px;
                margin-bottom: 10px;
                border-radius: 5px;
                border: none;
                background-color: #45a049;
                color: white;
            }
            button:hover{
                font-size: 15px;
            }

        </style>
    </head>
    <body>
        <div class="changepass">
            <div class="cha">Change Password</div>
            <h3 style="color: red">${requestScope.error}</h3>
            <form action="changepass" method="post">

                <!--                    <td>Nhập mật khẩu cũ</td>-->
                <input class="use" type="text" name="oldpass" placeholder="Nhập mật khẩu cũ">

                <!--                    <td>Nhập mật khẩu mới</td>-->
                <input class="use" type="text" name="newpass" placeholder="Nhập mật khẩu mới">

                <!--                    <td>Xác nhận mật khẩu mới</td>-->
                <input class="use" type="text" name="apass" placeholder="Xác nhận mật khẩu mới">


                <button>SAVE</button>
            </form>
        </div>
    </body>
</html>
