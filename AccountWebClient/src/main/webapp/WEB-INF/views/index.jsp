<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Account Home Page</title>
<link rel="stylesheet"
	href="<c:url value="resources/styles/bootstrap/3.3.5/css/bootstrap.min.css" />" />
<link rel="stylesheet"
	href="<c:url value="resources/styles/bootstrap/3.3.5/css/bootstrap-theme.min.css" />" />
<link rel="stylesheet"
	href="<c:url value="resources/styles/pivotal.css" />" />
<style type="text/css">
.has-error {color: red;}
</style>
</head>
<body>
	<div class="container">
		<div class="row">
			<nav class="navbar navbar-inverse">
				<div class="container-fluid">
					<div class="navbar-header"></div>
					<div>
						<ul class="nav navbar-nav navbar-right">
							<li><a href="http://www.pivotal.io"> <img alt="bank"
									title="Bank" height="120"
									src="<c:url value="images/bank.webp" />" />
							</a>
								<h2>ABC Banking Application</h2></li>
						</ul>
					</div>
				</div>
			</nav>
		</div>

		<div class="row">

			<h1>Accounts Web - Home Page</h1>



			<ul>
				<li><a href="/accountList">View Account List</a></li>
			</ul>

		</div>

	</div>

	<div>
		<h2>Account Information</h2>

		<form:form action="save" method="post" modelAttribute="account"
			novalidate="novalidate">

			<div class="row">
				<div class="form-group col-md-12">
					<label class="col-md-3 control-table" for="name">Name</label>
					<div class="col-md-7">
						<form:input type="text" path="name" id="name"
							class="form-control input-sm" />
						<div class="has-error">
							<form:errors path="name" class="help-inline"></form:errors>
						</div>


					</div>
				</div>
			</div>
			<div class="row">
				<div class="form-group col-md-12">
					<label class="col-md-3 control-table" for="salary">Salary</label>
					<div class="col-md-7">
						<form:input type="text" path="salary" id="salary"
							class="form-control input-sm" />
						<div class="has-error">
							<form:errors path="salary" class="help-inline"></form:errors>
						</div>

					</div>
				</div>
			</div>


			<div class="row">
				<div class="form-group col-md-12">
					<label class="col-md-3 control-lable" for="type">Type</label>
					<div class="col-md-7" class="form-control input-sm">
						<form:radiobutton path="type" value="current" checked="checked" />
						Current
						<form:radiobutton path="type" value="saving" />
						Savings

					</div>
				</div>
			</div>

			<div class="row">
				<div class="form-group col-md-12">
					<label class="col-md-3 control-table" for="createDate">CreateDate</label>
					<div class="col-md-7">
						<form:input type="date" path="createDate" id="createDate"
							class="form-control input-sm" />
						<div class="has-error">
							<form:errors path="createDate" class="help-inline"></form:errors>
						</div>

					</div>
				</div>
			</div>

			<div class="row">
				<div class="form-actions float-right">
					<input type="submit" value="Register" class="btn btn-primary">
				</div>

			</div>


		</form:form>
	</div>

</body>
</html>