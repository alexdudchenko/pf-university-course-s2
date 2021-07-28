<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Welcome</title>
</head>
<body>
<h1><%= "Welcome!" %></h1>
<br/>
<form action="main-servlet" method="post">
    a: from<input name="aFrom" value="">  to<input name="aTo" value="">   step<input name="aStep" value=""><br>
    b: from<input name="bFrom" value="">  to<input name="bTo" value="">   step<input name="bStep" value=""><br>
    c: from<input name="cFrom" value="">  to<input name="cTo" value="">   step<input name="cStep" value=""><br>
    d: from<input name="dFrom" value="">  to<input name="dTo" value="">   step<input name="dStep" value=""><br>
    <input type="submit" value="submit">
</form>
</body>
</html>