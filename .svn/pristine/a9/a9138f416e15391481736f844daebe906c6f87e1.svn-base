<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Creer Droit</title>
<link rel="stylesheet" href="css/style.css">
</head>
<body>
	<h2>Creer Droit</h2>
	<section>
		<form method="post" action="DroitModifier" class="standard-form">
			<fieldset>
				<legend>Creer un droit : </legend>
				<label for="label"> Label <span class="mandatory">*</span></label>
				<input type="text" id="label" name="label" value="${label}" placeholder="${droit.label}" /> <br />
				<label for="description"> Description <span class="mandatory">*</span></label>
				<input type="text" id="description" name="description" value="${description}" placeholder="${droit.description}" /> <br />
				<label for="actif"> Actif <span class="mandatory">*</span></label>
				<input type="checkbox" id="actif" name="actif" value="true" <c:if test="${droit.actif == 'true'}">checked</c:if> /> <br />
<input type="hidden" id="droit" name="droit" value="${droit.droit}"/>
				<input type="submit" value="Ok" class="noLabel" /> <br />
			</fieldset>
		</form>
	</section>	
	<a href="Welcome">Back to home</a>
</body>
</html>