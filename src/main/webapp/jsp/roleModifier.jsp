<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Creer Role</title>
<link rel="stylesheet" href="css/style.css">
</head>
<body>
	<h2>Creer Role</h2>
	<section>
		<form method="post" action="/crcl/RoleModifier" class="standard-form">
			<fieldset>
				<legend>Creer un role : </legend>
				<label for="label"> Label <span class="mandatory">*</span></label>
				<input type="text" id="label" name="label" value="${label}" placeholder="${role.label}" /> <br />
				<label for="description"> Description <span class="mandatory">*</span></label>
				<input type="text" id="description" name="description" value="${description}" placeholder="${role.description}" /> <br />
				<label for="actif"> Actif <span class="mandatory">*</span></label>
				<input type="checkbox" id="actif" name="actif" value="true" <c:if test="${role.actif == 'true'}">checked</c:if> /> <br />
<input type="hidden" id="role" name="role" value="${role.role}"/>
				<input type="submit" value="Ok" class="noLabel" /> <br />
			</fieldset>
		</form>
	</section>	
	<a href="index.html">Back to home</a>
</body>
</html>