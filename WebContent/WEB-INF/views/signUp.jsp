<!DOCTYPE html>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>FitFamily: Registration</title>
<c:import url="../../component/headContent.jsp" />
</head>
<body>
	<c:import url="../../component/navigationBar.jsp" />
	<div class="container-fluid">
		<div class="row">
			<div class="col-md-12">
				<h2>Registration</h2>
			</div>
		</div>
		<form method="post" action="signup">
			<div class="form-group">
				<label for="pseudo">Pseudo</label>
				<input type="text" class="form-control" id="pseudo" name="pseudo" placeholder="Pseudo" value="${param.pseudo}">
				<span class="error">${errors['pseudo'] }</span>
			</div>
			<div class="form-group">
				<label for="email">Email address</label>
				<input type="email" class="form-control" id="email" name="email" placeholder="Email" value="${param.mail}">
				<span class="error">${errors['email'] }</span>
			</div>
			<div class="form-group">
				<label for="password">Password</label>
				<input type="password" class="form-control" id="password" name="password" placeholder="Password" value="${param.password}">
				<span class="error">${errors['password'] }</span>
			</div>
			<div class="form-group">
				<label for="password-confirmation">Confirm password</label>
				<input type="password" class="form-control" id="password-confirmation" name="password-confirmation" placeholder="Password confirmation" value="${param.password}">
				<span class="error">${errors['confirmation'] }</span>
			</div>
			<div class="checkbox">
				<label for="gtu">
					<input type="checkbox" id="gtu" name="gtu" ${param.gtu == "on" ? "checked":""}> I've read the General Terms of Use
				</label>
			</div>
			<button type="submit" class="btn btn-default">Sign Up!</button>
			<span class="result"><c:out value="${result}"/></span>
		</form>
	</div>
</body>
</html>