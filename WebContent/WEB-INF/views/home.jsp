<!DOCTYPE html>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
	<head>
		<meta charset="utf-8" />
		<title>FitFamily: Home</title>
		<c:import url="../../component/headContent.jsp" />
	</head>
	<body>
		<c:import url="../../component/navigationBar.jsp" />
		<h1 style="text-align:center">Welcome to FitFamily</h1>
		<h3 style="text-align:center">Share the super-you within!</h3>
		<div style="text-align:center">
			<a href="#">Log in</a></br>
			<a href="<c:url value="/signup"/>">Sign up</a></br>
		</div>
	</body>
</html>