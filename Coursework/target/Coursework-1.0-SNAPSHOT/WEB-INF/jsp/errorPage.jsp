<%--
  Created by IntelliJ IDEA.
  User: alexp
  Date: 08.04.2021
  Time: 15:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Error Page</title>
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
</head>
<body>
<%@include file="header.jsp"%>
    ${requestScope.message}
<c:if test="${requestScope.userSessionPageException}">
<a href="sessionPage?id=${sessionScope.errorSessionActionId}" class="button">Go back</a>
</c:if>
<c:if test="${requestScope.adminFormException}">
    <a href="editPage?id=${sessionScope.errorSessionActionId}" class="button">Go back</a>
</c:if>
<c:if test="${requestScope.createSessionException}">
    <a href="createPage" class="button">Go back</a>
</c:if>
<%@include file="footer.jsp"%>
</body>
</html>
