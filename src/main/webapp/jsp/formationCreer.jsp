<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Nouvelle formation</title>
</head>
<body>
	Nouvelle formation

	<form action="FormationCreer" method="post">
		Intitulé : <input type="text" id="label" name="intitule"/><br>
		Reference : <input type="text" id="label" name="reference"/><br>
		dateDebut : <input type="date" id="label" name="dateDebut"/><br>
		dateFin : <input type="date" id="label" name="dateFin"/><br>
		Nombre de places : <input type="text" id="label" name="nombrePlaces"/><br>
		Nombre de jours : <input type="text" id="label" name="nombreJours"/><br>
		Referent<br>
		adresse<br>
		modeFormation<br>
		<input type="submit" value="Créer"/>
	</form>
    <a href="FormationLister">Retour au listing</a>
</body>
</html>