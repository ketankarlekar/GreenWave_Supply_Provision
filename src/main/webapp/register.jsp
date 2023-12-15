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

	<div class="container p-2">
		<div class="row">
			<div class="col-md-4 offset-md-4">
				<div class="card">
					<div class="card-body">

						<h4 class="text-center">Registration Form</h4>

						<c:if test="${not empty SuccessMSg}">
							<p class="text-center text-success">${SuccessMSg}</p>
							<c:remove var="SuccessMSg" scope="session" />
						</c:if>

						<c:if test="${not empty FailedMSg}">
							<p class="text-center text-danger">${FailedMSg}</p>
							<c:remove var="FailedMSg" scope="session" />
						</c:if>


						<form action="register" method="post">

							<div class="mb-3">
								<label for="exampleInputEmail1" class="form-label">
									Enter your First name </label> <input type="text" class="form-control"
									id="exampleInputEmail1" aria-describedby="emailHelp" required
									name="fname">

							</div>

							<div class="mb-3">
								<label for="exampleInputEmail1" class="form-label">
									Enter your Last name </label> <input type="text" class="form-control"
									id="exampleInputEmail1" aria-describedby="emailHelp" required
									name="lname">

							</div>


							<div class="mb-3">
								<label for="exampleInputEmail1" class="form-label">
									Enter your Email address</label> <input type="email"
									class="form-control" id="exampleInputEmail1"
									aria-describedby="emailHelp" required name="email">
								<div id="emailHelp" class="form-text">We'll never share
									your email with anyone else.</div>
							</div>
							<div class="mb-3">
								<label for="exampleInputPassword1" class="form-label">Password</label>
								<input type="password" class="form-control"
									id="exampleInputPassword1" required name="password">
							</div>
							<div class="mb-3 form-check">
								<input type="checkbox" class="form-check-input"
									id="exampleCheck1" name="check"> <label
									class="form-check-label" for="exampleCheck1">Agree
									terms and Conditions</label>
							</div>
							<div class="d-flex justify-content-center">
								<button type="submit" class="btn btn-success">Create
									Account</button>
							</div>
						</form>



					</div>
				</div>
			</div>
		</div>
	</div>



	<%@include file="allCompo/footer.jsp"%>

</body>

</html>