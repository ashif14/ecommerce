<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
<head>
<title>Home Page</title>
<link rel="stylesheet" type="text/css" href="webjars/bootstrap/3.3.7/css/bootstrap.min.css" />
<spring:url value="/css/home.css" var="springCss" />
	<link href="${springCss}" rel="stylesheet" />
</head>
<body>
<h3>Home page</h3>
<a href="/welcome">Welcome Page</a>
</body>
</html>