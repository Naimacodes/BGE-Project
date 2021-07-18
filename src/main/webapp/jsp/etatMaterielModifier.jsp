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
	Modification de l'état de matériel : ${e.etatMateriel}

	<form action="EtatMaterielModifier" method="post">
		<input type="text" id="label" name="label" value="${e.label}"/>
		<input type="submit" value="Mettre à jour"/>
		<input type="hidden" name="id" value="${e.etatMateriel}" />
	</form>
	<a href="EtatMaterielLister">Retour au listing</a>

</body>
</html>