<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv='Content-Type' content='text/html; charset=UTF-8' />
	<title>Modification état de matériel</title>
	
</head>
<body>
	Modification du type de séance : ${entity.typeSeance}

	<form action="TypeSeanceModifier" method="post">
	
		<label for="amount"> Actif <span class="mandatory">*</span></label>
				<input type="checkbox" id="actif" name="actif" value="true" <c:if test="${entity.actif == 'true'}">checked</c:if> /> <br />
				
				<label for="amount"> Description <span class="mandatory">*</span></label>
				<input type="text" id="description" name="description" value="${entity.description}" /> <br />
						
				<label for="amount"> LibelleCourt <span class="mandatory">*</span></label>
				<input type="text" id="libelleCourt" name="libelleCourt" value="${entity.libelleCourt}" /> <br />

				<label for="amount"> Libelle <span class="mandatory">*</span></label>
				<input type="text" id="libelle" name="libelle" value="${entity.libelle}" /> <br />
		<input type="submit" value="Mettre à jour"/>
		<input type="hidden" name="id" value="${entity.typeSeance}" />
	</form>
	<a href="TypeSeanceLister">Retour au listing</a>

</body>
</html>