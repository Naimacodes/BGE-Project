<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Nouvelle Adresse</title>
</head>
<body>
	Nouvelle Adresse

	<form action="TypeSeanceCreer" method="post">
	
		<label for="amount"> Libelle1 <span class="mandatory">*</span></label>
		<input type="text" id="libelle1" name="libelle1" value="${libelle1}" /> <br />	
		
		<label for="amount"> Libelle2 <span class="mandatory">*</span></label>
		<input type="text" id="libelle2" name="libelle2" value="${libelle2}" /> <br />				
						
		<label for="amount"> CodePostal <span class="mandatory">*</span></label>
		<input type="text" id="codePostal" name="codePostal" value="${codePostal}" /> <br />	
		
		<label for="amount"> Ville <span class="mandatory">*</span></label>
		<input type="text" id="ville" name="ville" value="${ville}"/><br />
		 
		
		<input type="submit" value="Créer" class="noLabel"/>  <br />		
				
	</form>

</body>
</html>