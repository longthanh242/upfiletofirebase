<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 8/24/2024
  Time: 11:44 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>New Employee</title>
</head>
<body>
    <form:form modelAttribute="employeeDTO" action="${pageContext.request.contextPath}/employeeController/create" method="post" enctype="multipart/form-data">
      <form:label path="empName" for="name">EmpName</form:label>
      <form:input path="empName" id="name"/><br>
      <form:label path="age" for="age">Age</form:label>
      <form:input type="number" path="age" id="age"/><br>
      <form:label path="avatar" for="avatar">Avatar</form:label>
      <form:input type="file" path="avatar" id="avatar"/><br>
      <button>Create</button>
    </form:form>
</body>
</html>
