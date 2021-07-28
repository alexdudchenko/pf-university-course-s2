<%--
  Created by IntelliJ IDEA.
  User: alexp
  Date: 29.03.2021
  Time: 16:30
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page errorPage="error.jsp" contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Result</title>
</head>
<body>
<img src="https://i.imgur.com/TbjpuK2_d.webp?maxwidth=1520&fidelity=grand" width=35% alt = "no image\"/><br>
    <c:out value="${requestScope.result}"/>
</body>
</html>
