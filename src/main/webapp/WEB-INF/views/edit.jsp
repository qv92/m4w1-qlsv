<%--
  Created by IntelliJ IDEA.
  User: dungn
  Date: 8/12/2021
  Time: 4:48 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit</title>
</head>
<body>
<form method="post">
    <table>
        <tr>
            <th>ID</th>
            <th>Tên</th>
            <th>Ngày sinh</th>
            <th>Địa chỉ</th>
            <th>Email</th>
            <th>Lớp</th>
        </tr>
        <tr>
            <td><input type="text" name="id" value="${student.id}" readonly></td>
            <td><input type="text" name="name" value="${student.name}"></td>
            <td><input type="text" name="dateOfBirth" value="${student.dateOfBirth}"></td>
            <td><input type="text" name="address" value="${student.address}"></td>
            <td><input type="text" name="email" value="${student.email}"></td>
            <td><input type="text" name="classroom" value="${student.classroom}"></td>
        </tr>
        <tr>
            <button type="submit">Edit</button>
        </tr>
    </table>
</form>
</body>
</html>
