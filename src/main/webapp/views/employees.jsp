<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 8/24/2024
  Time: 11:36 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>EmployeeList</title>
</head>
<body>
    <h2>List Employee</h2>
    <table border="1">
        <thead>
        <tr>
            <th>No</th>
            <th>EmployeeId</th>
            <th>Name</th>
            <th>Age</th>
            <th>Avatar</th>
            <th>Status</th>
            <th>Actions</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${employeeList}" var="emp" varStatus="loop">
            <tr>
                <td>${loop.index+1}</td>
                <td>${emp.empId}</td>
                <td>${emp.empName}</td>
                <td>${emp.age}</td>
                <td><img src="${emp.avatar}" alt="${emp.empName}" width="50px" height="50px"></td>
                <td>${emp.status?"Active":"Inactive"}</td>
                <td></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
    <a href="<%=request.getContextPath()%>/employeeController/initCreate">Create New Employee</a>
</body>
</html>
