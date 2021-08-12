<%--
  Created by IntelliJ IDEA.
  User: dungn
  Date: 8/12/2021
  Time: 4:48 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Show Student</title>
</head>
<body>
    <table>
        <tr><a href="/create">Create</a></tr>
        <tr>
            <form action="/find" method="get">
            <input type="text" name="fName" placeholder="Nhập tên">
            <button type="submit">Find</button>
            </form>
        </tr>
        <tr>
            <th>ID</th>
            <th>Tên</th>
            <th>Ngày sinh</th>
            <th>Địa chỉ</th>
            <th>Email</th>
            <th>Lớp</th>
            <th colspan="2">Tùy chọn</th>
        </tr>
        <c:forEach items="${listStudent}" var="s" varStatus="loop">
        <tr>
            <td>${s.id}</td>
            <td>${s.name}</td>
            <td>${s.dateOfBirth}</td>
            <td>${s.address}</td>
            <td>${s.email}</td>
            <td>${s.classroom}</td>
            <td><a href="/delete?index=${loop.index}">Delete</a></td>
            <td><a href="/edit?index=${loop.index}">Edit</a></td>
        </tr>
        </c:forEach>
    </table>
</body>
</html>
