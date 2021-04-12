<%--
  Created by IntelliJ IDEA.
  User: alexp
  Date: 08.04.2021
  Time: 18:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
</head>
<body>
<%@ include file="header.jsp"%>

<a href="createPage" class="body-button">Create page</a>

<table>
    <thead>
    <tr>
        <th>Film</th>
        <th>Date and Time</th>
        <th>Duration (min.)</th>
        <th>Price</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="cinemaSession" items="${requestScope.cinemaSessions}">
        <tr>
            <td><a href="editPage?id=${cinemaSession.sessionId}">${cinemaSession.filmTitle}</a></td>
            <td>${cinemaSession.startTime.format(cinemaSession.formatter)}</td>
            <td>${cinemaSession.durationInMinutes}</td>
            <td>${cinemaSession.price} UAH</td>
            <td>
                <a href="remove?id=${cinemaSession.sessionId}">Remove</a></td>
        </tr>
    </c:forEach>
    </tbody>
</table>

<%@ include file="footer.jsp"%>
</body>
</html>
