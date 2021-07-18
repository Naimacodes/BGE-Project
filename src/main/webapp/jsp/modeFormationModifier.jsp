<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Modification d'un Mode de Formation</title>
</head>
<body>
	<h2>Modification d'un Mode de Formation :</h2>
	
	<section>
		<form action="ModeFormationModifier" method="post">
			<fieldset>
				<legend>Modification de ${entity.label} à l'ID ${entity.modeFormation}</legend>
				
				<label for="amount"> Actif <span class="mandatory">*</span></label>
				<input type="checkbox" id="actif" name="actif" value="true" <c:if test="${entity.actif == 'true'}">checked</c:if> /> <br />
				
				<label for="amount"> Description <span class="mandatory">*</span></label>
				<input type="text" id="description" name="description" value="${entity.description}" /> <br />
						
				<label for="amount"> LabelCourt <span class="mandatory">*</span></label>
				<input type="text" id="labelCourt" name="labelCourt" value="${entity.labelCourt}" /> <br />

				<label for="amount"> Label <span class="mandatory">*</span></label>
				<input type="text" id="label" name="label" value="${entity.label}" /> <br />
				
				<input type="submit" value="Mettre à jour"/>
				<input type="hidden" name="id" value="${entity.modeFormation}" />
			</fieldset>
		</form>
	</section>
	<a href="index.html">Back to home</a>
</body>
</html>