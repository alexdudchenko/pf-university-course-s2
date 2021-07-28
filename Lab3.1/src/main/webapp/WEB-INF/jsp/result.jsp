<%@ page import="com.example.Lab3.model.ResultDataRow" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: alexp
  Date: 04.04.2021
  Time: 14:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Result</title>
</head>
<body>
<h1><%= "Check the result!" %></h1>
<form action="main-servlet" method="post">
    a: from<input name="aFrom" value="${requestScope.input.aFrom}">  to<input name="aTo" value="${requestScope.input.aTo}">
    step<input name="aStep" value="${requestScope.input.aStep}"><br>
    b: from<input name="bFrom" value="${requestScope.input.bFrom}">  to<input name="bTo" value="${requestScope.input.bTo}">
    step<input name="bStep" value="${requestScope.input.bStep}"><br>
    c: from<input name="cFrom" value="${requestScope.input.cFrom}">  to<input name="cTo" value="${requestScope.input.cTo}">
    step<input name="cStep" value="${requestScope.input.cStep}"><br>
    d: from<input name="dFrom" value="${requestScope.input.dFrom}">  to<input name="dTo" value="${requestScope.input.dTo}">
    step<input name="dStep" value="${requestScope.input.dStep}"><br>
    <input type="submit" value="submit">
</form>

<table border="3px">
    <tr>
        <td>a</td>
        <td>b</td>
        <td>c</td>
        <td>d</td>
        <td>result</td>
    </tr>

    <%
        ArrayList<ResultDataRow> resultDataRows = (ArrayList<ResultDataRow>) request.getAttribute("result");
        for (ResultDataRow row : resultDataRows) {%>
        <tr>
            <td><%=row.getA()%></td>
            <td><%=row.getB()%></td>
            <td><%=row.getC()%></td>
            <td><%=row.getD()%></td>
            <td><%=row.getResult()%></td>
        </tr>
    <%} %>
</table>
</body>
</html>
