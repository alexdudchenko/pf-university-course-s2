<%--
  Created by IntelliJ IDEA.
  User: alexp
  Date: 30.03.2021
  Time: 10:43
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page errorPage="error.jsp" contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Result</title>
</head>
<body>
<img src="https://i.imgur.com/Gdic47L_d.webp?maxwidth=760&fidelity=grand" alt = "no image\"/><br>
Фильмы с наибольшим количеством актеров:
<ol>
    <c:forEach items="${requestScope.result}" var="el">
        <li>${el}</li>
    </c:forEach>
</ol>
</body>
</html>
