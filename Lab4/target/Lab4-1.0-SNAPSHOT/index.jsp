<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page errorPage="WEB-INF/jsp/error.jsp" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html>
<head>
    <title>Lab 4</title>
</head>
<body>
<h1><%= "Hello!" %>
</h1>
<br/>

Выбрать задачу:<br>
<ol>
    <li>Есть ли актер, который не играл ни в одном фильме</li>
    <li>Вывести коллег заданого актера</li>
    <li>Найти фильм с наибольшим количеством актеров</li>
</ol>

<form action="FrontController">
    1: <input type="radio" value="1" name="a"><br>
    2: <input type="radio" value="2" name="a"><br>
    3: <input type="radio" value="3" name="a">
    <br>
    <input type="submit" value="submit">
</form>
</body>
</html>