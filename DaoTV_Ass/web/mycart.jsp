<%-- 
    Document   : mycart
    Created on : Mar 10, 2022, 8:36:53 PM
    Author     : ADMIN
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style type="text/css">
            a{
                text-decoration: none;
                text-align: center;
                color: red;
                
            }
            button{
                font-size: 20px;
                padding: auto;
            }
        </style>
    </head>
    <body>
        <table border="1px">
            <tr>
                <th>No</th>
                <th>Name</th>
                <th>Quantity</th>
                <th>Price</th>
                <th>Total money</th>
                <th>Action</th>
            </tr>
            <c:set var="o" value="${requestScope.cart}"/>
            <c:set var="tt" value="0"/>
            <c:forEach items="${o.items}" var="i">
                <c:set var="tt" value="${tt+1}"/>
                <tr>
                    <td>${tt}</td>
                    <td>${i.product.productName}</td>
                    <td style="text-align: center">
                        <button><a href="process?num=-1&id=${i.product.productID}">-</a></button>
                        ${i.quantity}
                        <button><a href="process?num=1&id=${i.product.productID}">+</a></button>
                    </td>
                    <td>
                        <fmt:formatNumber pattern="##.#" value="${i.price}"/> đ
                    </td>
                    <td>
                        <fmt:formatNumber pattern="##.#" value="${(i.price*i.quantity)}"/> đ
                    </td>
                    <td style="text-align: center">
                        <form action="process" method="post">
                            <input type="hidden" name="id" value="${i.product.productID}"/>
                            <input type="submit" value="return item"/>
                        </form>
                    </td>
                </tr>
            </c:forEach>
        </table>
            <h3>Total money:<fmt:formatNumber pattern="##.#" value="${o.totalMoney}"/> đ</h3>
            </br>
            <form action="checkout" method="get">
                <input type="submit" value="Thanh toán"/>
            </form>
            </br>
            <a href="home">CONTINUE SHOPPING</a>
    </body>
</html>
