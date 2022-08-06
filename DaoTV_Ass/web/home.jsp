<%-- 
    Document   : home
    Created on : Feb 28, 2022, 3:24:55 PM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <title>All PC - PC cho mọi người</title>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" 
        integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>JSP Page</title>
        <style type="text/css">
            <%@include file="css/index.css" %>
        </style>

    </head>
    <body>
        <div class="dautrang">
        
        <div class="logo">
            <a href="home"><img src="images/logo1.jpg"></a>
        </div>
        
        <div class="phai">
            <div class="logout">
                <c:if test="${sessionScope.account==null}">
                    <ul id="main-menu">
                        <li><a href="login.jsp"> Login</a></li>
                        <li><a href="register.jsp" > Register</a></li>
                    </ul>
                </c:if>
                <c:if test="${sessionScope.account!=null}">
                <ul id="main-menu">                   
                        <li><a href=""> Profile</a>
                            <ul class="sub-menu">
                                <li><a href="profile">Edit Profile</a></li>
                                <li><a href="changepass">Change password</a></li>
                                <c:if test="${sessionScope.use==1}">
                                <li><a href="thongke">Thống kê</a></li>
                                </c:if>
                            </ul>
                        </li>
                        <li><a href="logout" > Logout</a></li>
                    </ul>
                </c:if>
            </div>
        <div class="search">
            <div>
            <form action="search" method="get">
                <input type="text" placeholder="Search in system" name="key">
                <button onclick="this.form.submit()">Search</button>
            </form>
        </div>
            <c:set var="k" value="${requestScope.key}" />
        <div class="giohang">
            <a href="show" ><img src="images/giohang.png">${requestScope.size}</a>
        </div>
        
            
        </div>
        <div id="mySidebar" class="manu">
            <a href="home">Home</a>
            <a href="#">About</a>
            <a href="home?id=2">LapTop</a>
            <a href="home?id=1">PC</a>
            <a href="home?id=3">Linh kiện</a>
            <a href="home?id=4">Gaming Gear</a>
            <a href="home?id=5">Phụ kiện</a>
            <a href="#">Contact</a>
          </div>
        </div>
        </div>
        <div id="carouselExampleIndicators" class="carousel slide" data-ride="carousel">
            <ol class="carousel-indicators">
              <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
              <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
              <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
              <li data-target="#carouselExampleIndicators" data-slide-to="3"></li>
              <li data-target="#carouselExampleIndicators" data-slide-to="4"></li>
            </ol>
            <div class="carousel-inner">
              <div class="carousel-item active">
                <img class="d-block w-100" src="images/a7.jpg" alt="First slide">
              </div>
              <div class="carousel-item">
                <img class="d-block w-100" src="images/a3.jpg" alt="Second slide">
              </div>
              <div class="carousel-item">
                <img class="d-block w-100" src="images/a4.jpg" alt="Third slide">
              </div>
              <div class="carousel-item">
                <img class="d-block w-100" src="images/a5.jpg" alt="Third slide">
              </div>
              <div class="carousel-item">
                <img class="d-block w-100" src="images/a6.jpg" alt="Third slide">
              </div>
            </div>
            <a class="carousel-control-prev" href="#carouselExampleIndicators" role="button" data-slide="prev">
              <span class="carousel-control-prev-icon" aria-hidden="true"></span>
              <span class="sr-only">Previous</span>
            </a>
            <a class="carousel-control-next" href="#carouselExampleIndicators" role="button" data-slide="next">
              <span class="carousel-control-next-icon" aria-hidden="true"></span>
              <span class="sr-only">Next</span>
            </a>
          </div>
        

      
           
        <div  class="content">
            
            <c:set var="page" value="${requestScope.page}" />
            <div class="pagination">
                <c:forEach begin="${1}" end="${requestScope.num}" var="i">
                    <a class="${i==page?"active":""}" href="home?page=${i}">${i}</a>
                </c:forEach>
            </div></br>
            <c:if test="${sessionScope.use==1}">
            <a href="new.jsp">Add new</a></br>
            </c:if>
            <div class="col-sm-12">
                    <div class="row">
                        <c:forEach items="${requestScope.data}" var="p">  
                            
                            <div class="col-12 col-md-6 col-lg-3">
                            <div class="product">
                                <div class="thea">                                   
                                    <a href="infomation?id=${p.productID}&catID=${p.categoryID}"><img src="${p.img}"></a></br>
                                    <a href="infomation?id=${p.productID}&catID=${p.categoryID}">${p.productName}</a></br>
                                </div>
                                <p>${p.price} đ</p></br>
                                <c:if test="${sessionScope.use==1}">
                                <div class="upd">
                                    <a href="#" onclick="doDelete(${p.productID})">Delete</a>
                                    <a href="update?id=${p.productID}">Update</a>
                                </div>
                                </c:if>
                                <a href="infomation?id=${p.productID}&catID=${p.categoryID}" class="ab">Buy Now</a>  
                            </div>
                            </div>
                        </c:forEach>
                    </div>
                </div>
        
        </div>
            <script type="text/javascript">
            function doDelete(id) {
                if (confirm("Are you sure to delete product with id='" + id + "'?")) {
                    window.location = "delete?id=" + id;
                }
            }
            </script>

        
          
          <footer class="footer-distributed">

			<div class="footer-left">

				<h3>Company<span>logo</span></h3>

				<p class="footer-links">
					<a href="#" class="link-1">Home</a>
					
					<a href="#">Blog</a>
				
					<a href="#">Pricing</a>
				
					<a href="#">About</a>
					
					<a href="#">Faq</a>
					
					<a href="#">Contact</a>
				</p>

				<p class="footer-company-name">Company Name © 2015</p>
			</div>

			<div class="footer-center">

				<div>
					<i class="fa fa-map-marker"><img src="images/diachi.png"></i>
					<p><span>444 S. Cedros Ave</span> Solana Beach, California</p>
				</div>

				<div>
					<i class="fa fa-phone"><img src="images/dienthoai.png"></i>
					<p>+1.555.555.5555</p>
				</div>

				<div>
					<i class="fa fa-envelope"><img src="images/mail.png"></i>
					<p><a href="mailto:Daoall@gmail.com">Daoall@gmail.com</a></p>
				</div>

			</div>

			<div class="footer-right">

				<p class="footer-company-about">
					<span>PC cho mọi nhà</span>
					Lorem ipsum dolor sit amet, consectateur adispicing elit. Fusce euismod convallis velit, eu auctor lacus vehicula sit amet.
				</p>

				<div class="footer-icons">

					<a href="https://www.facebook.com/daoon.dz/"><i class="fa fa-facebook"><img src="images/face.png"></i></a>
					<a href="#"><i class="fa fa-twitter"><img src="images/twiter.png"></i></a>
					<a href="#"><i class="fa fa-linkedin"><img src="images/in.png"></i></a>
					<a href="#"><i class="fa fa-github"><img src="images/meo.png"></i></a>

				</div>

			</div>

		</footer>

          <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" 
          integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
          <script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" 
          integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
          <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" 
          integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>    
    </body>
</html>
