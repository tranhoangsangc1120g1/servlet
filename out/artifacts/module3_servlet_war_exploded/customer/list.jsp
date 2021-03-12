<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 3/11/2021
  Time: 3:37 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>list customer</title>
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" href="/css/bootstrap.min.css">
</head>
<body>
<div class="container">
    <h2>Customer list</h2>
    <c:if test="${empty customerlist}">
        <h3>List is empty</h3>
    </c:if>
    <c:if test="${not empty customerlist}">
    <table class="table table-hover">
        <thead>
        <tr>
            <th>Tên</th>
            <th>Tuổi</th>
            <th>Địa chỉ</th>
            <th>Ảnh</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${customerlist}" var="customer">
        <tr>
            <td scope="row">${customer.ten}</td>
            <td>${customer.tuoi}</td>
            <td>${customer.diachi}</td>
            <td><img src="${customer.anh}" width="50" height="50"></td>
        </tr>
        </c:forEach>
        </tbody>
    </table>
    </c:if>
</div>
</body>
</html>
