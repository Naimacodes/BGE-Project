<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Creer Mode Formation</title>
<link rel="stylesheet" href="css/style.css">
</head>
<body>
	<h2>Nouveau mode de Formation :</h2>
	<section>
		<form method="post" action="/crcl/ModeFormationCreer" class="standard-form">
			<fieldset>
				<legend>Creer un mode de formation : </legend>
				
				<label for="amount"> Actif <span class="mandatory">*</span></label>
				<input type="checkbox" id="actif" name="actif" value="true" /> <br />
				
				<label for="amount"> Description <span class="mandatory">*</span></label>
				<input type="text" id="description" name="description" value="${description}" /> <br />		
						
				<label for="amount"> LabelCourt <span class="mandatory">*</span></label>
				<input type="text" id="labelCourt" name="labelCourt" value="${labelCourt}" /> <br />
				
				<label for="amount"> Label <span class="mandatory">*</span></label>
				<input type="text" id="label" name="label" value="${label}" /> <br />		
						
				<input type="submit" value="Ok" class="noLabel" /> <br />
			</fieldset>
		</form>
	</section>	
	<a href="index.html">Back to home</a>
</body>
</html>