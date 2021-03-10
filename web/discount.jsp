<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 3/10/2021
  Time: 4:33 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/discount" method="post">
    <table>
        <tr>
       <th>Ten sp</th>
       <th>Gia sp</th>
       <th>discount sp</th>
        </tr>
        <tr>
            <td><input type="text" name="tensp" ></td>
            <td><input type="text" name="giasp"></td>
            <td><input type="text" name="discount"></td>
        </tr>
        <tr><input type="submit" value="discount" id="submit"></tr>
    </table>
</form>
</body>
</html>
