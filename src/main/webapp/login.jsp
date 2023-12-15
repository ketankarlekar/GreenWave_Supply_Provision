<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration page</title>
<%--Css link  --%>
<%@include file="allCompo/allCss.jsp"%>

<link href="allCompo/style.css" rel="stylesheet" type="text/css">


</head>
<body style="background-color: #FFFBF5">

	<%@include file="allCompo/navbar.jsp"%>

	<div class="container p-4">
		<div class="row">
			<div class="col-md-4 offset-md-4">
				<div class="card">
					<div class="card-body">

						<h4 class="text-center">Login Form</h4>
						
						<c:if test="${not empty failedMsg }">
						<h5 class="text-center text-danger">${failedMsg}</h5>
						
						<c:remove var = "failedMsg" scope="session"/>
						
						
						</c:if>
						
						
						<form action="Login" method="post">
							<div class="mb-3">
								<label for="exampleInputEmail1" class="form-label">Email
									address</label> <input type="email" class="form-control"
									id="exampleInputEmail1" aria-describedby="emailHelp" required
									name="email">
								<div id="emailHelp" class="form-text">We'll never share
									your email with anyone else.</div>
							</div>
							<div class="mb-3">
								<label for="exampleInputPassword1" class="form-label">Password</label>
								<input type="password" class="form-control"
									id="exampleInputPassword1" required name="password">
							</div>

							<div class="d-flex justify-content-center">
								<button type="submit" class="btn btn-success">Sign In</button>
							</div>
							<a href="register.jsp" class="d-flex justify-content-center">create
								account</a>
						</form>


					</div>
				</div>
			</div>
		</div>
	</div>

	<br>
	<br>


	<%@include file="allCompo/footer.jsp"%>
</body>

</html>