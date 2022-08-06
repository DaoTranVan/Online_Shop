<%-- 
    Document   : thongke
    Created on : Mar 16, 2022, 9:13:59 PM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
  <head>
    <script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
    <script type="text/javascript">

    
      google.charts.load('current', {'packages':['corechart']});
      google.charts.setOnLoadCallback(drawChart);
      google.charts.load('current', {'packages':['corechart']});
      google.charts.setOnLoadCallback(drawCharta);
      
      function drawChart() {
          
        var data = google.visualization.arrayToDataTable([
          ['Task', 'Hours per Day'],
          <c:forEach items="${requestScope.dat}" var="p">  
          ['${p.categoryName}',     ${p.sumQuantity}],
        </c:forEach>
        ]);

        var options = {
          title: 'Thống kê số lượng sản phẩm theo ngày'
        };

        var chart = new google.visualization.PieChart(document.getElementById('piechart'));

        chart.draw(data, options);
            
      }
      function drawCharta() {
          
        var data = google.visualization.arrayToDataTable([
          ['Task', 'Hours per Day'],
          <c:forEach items="${requestScope.dat}" var="p">  
          ['${p.categoryName}',     ${p.sumPrice}],
        </c:forEach>
        ]);

        var options = {
          title: 'Thống kê doanh thu theo ngày'
        };

        var chart = new google.visualization.PieChart(document.getElementById('piecharta'));

        chart.draw(data, options);
            
      }

    </script>
  </head>
  <body>
    <div id="piechart" style="width: 900px; height: 500px;"></div>
    <div id="piecharta" style="width: 900px; height: 500px;"></div>
    </br><a href="home" style="margin-left: 48%; text-decoration: none; font-size: 20px">Home</a>
  </body>
</html>