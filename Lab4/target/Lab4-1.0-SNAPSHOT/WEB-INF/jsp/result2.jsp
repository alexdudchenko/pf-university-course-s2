<%--
  Created by IntelliJ IDEA.
  User: alexp
  Date: 30.03.2021
  Time: 9:53
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page errorPage="error.jsp" contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Result</title>
</head>
<body>
<img src="https://i.imgur.com/QId1DpZ_d.webp?maxwidth=760&fidelity=grand" alt = "no image\"/><br>

    <p>Коллеги ${requestScope.req}:</p>
    <c:if test="${empty requestScope.result}">
        Нет коллег
    </c:if>
    <c:if test="${!empty requestScope.result}">
        <ol>
        <c:forEach var="actor" items="${requestScope.result}">
            <li>${actor}</li>
        </c:forEach>
        </ol>
    </c:if>
</body>
</html>
