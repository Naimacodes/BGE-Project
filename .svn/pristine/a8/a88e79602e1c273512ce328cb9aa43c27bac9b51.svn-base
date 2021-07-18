<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv='Content-Type' content='text/html; charset=UTF-8' />
	<title>Modification adresse</title>
	
</head>
<body>
	Modification adresse : ${entity.adresse}

	<form action="TypeSeanceModifier" method="post">
	
				<label for="amount"> Libelle1 <span class="mandatory">*</span></label>
				<input type="text" id="libelle1" name="libelle1" value="${entity.libelle1}" /> <br />
				
				<label for="amount"> libelle2 <span class="mandatory">*</span></label>
				<input type="text" id="description" name="description" value="${entity.libelle2}" /> <br />
						
				<label for="amount"> CodePostal <span class="mandatory">*</span></label>
				<input type="text" id="codePostal" name="codePostal" value="${entity.codePostal}" /> <br />

				<label for="amount"> Ville <span class="mandatory">*</span></label>
				<input type="text" id="libelle" name="libelle" value="${entity.ville}" /> <br />
				
		<input type="submit" value="Mettre à jour"/>
		<input type="hidden" name="id" value="${entity.adresse}" />
	</form>
	<a href="TypeSeanceLister">Retour au listing</a>

</body>
</html>