<%-- 
    Document   : login
    Created on : Feb 15, 2022, 11:48:07 AM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            .login{
                padding-top: 30px;
                padding-bottom: 30px;
                margin: auto;
                width: 400px;
                text-align: center;
                border: 1px solid grey;
                border-radius: 10px;
                
            }
            .lo{
                float: left;
                width: 199px;
                padding-bottom: 20px;
            }
            .reg{
                float: right;
                width: 200px;
                margin-bottom: 20px;
                border-left: 1px solid grey;
            }
             a{
                text-decoration: none;
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
                padding-left: 20px
            }
            .remm{
                text-align: left;
                margin-left: 30px;
                padding-left: 5px;
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
        <div class="login">
            <div class="lo"><a href="login">Login</a></div>
            <div class="reg"><a href="register">Register</a></div>
        <h3 style="color:red">${requestScope.error}</h3>
        <form action="register" method="post">
            <input class="use" type="text" name="user" value="${cookie.user.value}" placeholder="username"/><br/>
            <input class="use" type="text" name="pass" value="${cookie.pass.value}" placeholder="password"/><br/>
            <input class="use" type="text" name="name"  placeholder="name"/><br/>
            <input class="use" type="text" name="address"  placeholder="address"/><br/>
            <input class="use" type="text" name="city"  placeholder="city"/><br/>
            <input class="use" type="text" name="phone"  placeholder="phone"/><br/>
            <div class="remm"><input type="checkbox" ${(cookie.rem.value eq 'ON')?"checked":""} name="rem" value="ON"/> Remember me</div></br>
            <button>Register</button>
        </form>
        </div>
    </body>
</html>
