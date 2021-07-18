<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Nouveau état de matériel</title>
</head>
<body>
	Nouveau état de matériel

	<form action="EtatMaterielCreer" method="post">
		<input type="text" id="label" name="label"/>
		<input type="submit" value="Créer"/>
	</form>
    <a href="EtatMaterielLister">Retour au listing</a>
</body>
</html>