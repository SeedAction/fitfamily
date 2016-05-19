<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>FitFamily: Profile</title>
<!-- Loading js & css dependencies -->
<c:import url="component/headContent.jsp" />
</head>
<body>
	<!-- Loading the navbar -->
	<c:import url="component/navigationBar.jsp" />
	<div class="container-fluid">
		<div class="row">
			<div class="col-md-12">
				<h2>${user.pseudo}</h2>
				<p>${user.mail}</p>
			</div>
		</div>
	</div>
</body>
</html>