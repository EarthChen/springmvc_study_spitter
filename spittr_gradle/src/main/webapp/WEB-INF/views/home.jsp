<%@ taglib prefix="c" uri="http://www.springframework.org/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: earthchen
  Date: 17-5-30
  Time: 上午12:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>spitter</title>
</head>
<body>
<h1>welcome to spitter</h1>

<a href="<c:url value="/spittles"/>">spittles</a>|
<a href="<c:url value="/spitter/register"/>">register</a>
</body>
</html>
