<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 3/11/2021
  Time: 2:22 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<head>
    <title>Simple Dictionary</title>
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" href="css/bootstrap.css">
</head>
<body>
<h2 >Vietnamese Dictionary</h2>
<form action="${pageContext.request.contextPath}/dictionary10.jsp"  >
    <input  type="text" placeholder="enter your word " name="txtSearch">
    <input type="submit"  value="Search" id="submit">
</form>
</body>
</html>
