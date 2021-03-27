<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="com.example.Lab3.BusinessLogic" %>
<!DOCTYPE html>
<html>
<head>
    <title>Lab 3</title>
</head>
<%boolean startRequest = request.getParameterMap().size() == 0;%>
<body>
<h1><%= startRequest ? "Complete the form..." : "Check the result!" %>
</h1>
<img src="${pageContext.request.contextPath}/img/img.png" alt="no image">
<br/><hr>
<form action="index.jsp">

    <% if (!startRequest) {
        double aFrom = Double.parseDouble(request.getParameter("aFrom"));
        double aTo = Double.parseDouble(request.getParameter("aTo"));
        double aStep = Double.parseDouble(request.getParameter("aStep"));

        double bFrom = Double.parseDouble(request.getParameter("bFrom"));
        double bTo = Double.parseDouble(request.getParameter("bTo"));
        double bStep = Double.parseDouble(request.getParameter("bStep"));

        double cFrom = Double.parseDouble(request.getParameter("cFrom"));
        double cTo = Double.parseDouble(request.getParameter("cTo"));
        double cStep = Double.parseDouble(request.getParameter("cStep"));

        double dFrom = Double.parseDouble(request.getParameter("dFrom"));
        double dTo = Double.parseDouble(request.getParameter("dTo"));
        double dStep = Double.parseDouble(request.getParameter("dStep"));

    %>



    a: from<input name="aFrom" value="<%=aFrom%>">  to<input name="aTo" value="<%=aTo%>">   step<input name="aStep" value="<%=aStep%>"><br>
    b: from<input name="bFrom" value="<%=bFrom%>">  to<input name="bTo" value="<%=bTo%>">   step<input name="bStep" value="<%=bStep%>"><br>
    c: from<input name="cFrom" value="<%=cFrom%>">  to<input name="cTo" value="<%=cTo%>">   step<input name="cStep" value="<%=cStep%>"><br>
    a: from<input name="dFrom" value="<%=dFrom%>">  to<input name="dTo" value="<%=dTo%>">   step<input name="dStep" value="<%=dStep%>"><br>
    <input type="submit" value="submit">
    <br><hr>

    <table border="3px">
        <tr>
            <td>a</td>
            <td>b</td>
            <td>c</td>
            <td>d</td>
            <td>result</td>
        </tr>

        <%
            for (double a = aFrom; a <= aTo; a+=aStep) {
                for (double b = bFrom; b <= bTo; b+=bStep) {
                    for (double c = cFrom; c <= cTo; c+=cStep) {
                        for (double d = dFrom; d <= dTo; d+=dStep) {

        %>

        <tr>
            <td><%=a%></td>
            <td><%=b%></td>
            <td><%=c%></td>
            <td><%=d%></td>
            <td><%=BusinessLogic.evaluate(a, b, c, d)%></td>
        </tr>

        <%
                        }}}}
        %>
    </table>
    <%} else {%>
    a: from<input name="aFrom" value="">  to<input name="aTo" value="">   step<input name="aStep" value=""><br>
    b: from<input name="bFrom" value="">  to<input name="bTo" value="">   step<input name="bStep" value=""><br>
    c: from<input name="cFrom" value="">  to<input name="cTo" value="">   step<input name="cStep" value=""><br>
    a: from<input name="dFrom" value="">  to<input name="dTo" value="">   step<input name="dStep" value=""><br>
    <input type="submit" value="submit">
    <%}%>
</form>
</body>
</html>