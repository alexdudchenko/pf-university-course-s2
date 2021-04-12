<%--
  Created by IntelliJ IDEA.
  User: alexp
  Date: 08.04.2021
  Time: 17:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<header>
    <a href="." class="button">Welcome</a>


    <c:if test="${empty sessionScope.admin}">
        <a href="loginPage" class="button">Log in (as admin)</a>
    </c:if>


    <c:if test="${!empty sessionScope.admin}">
    <div class="header-left">
        <form method="post" action="logout">
            <c:out value="${sessionScope.admin.login}"/><br>
            <input type="submit" value="Log Out"/>
        </form>
    </div>
        <a href="adminPage" class="button">To admin page</a>
    </c:if>

</header>

