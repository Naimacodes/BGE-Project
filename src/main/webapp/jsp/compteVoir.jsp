<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Voir les comptes</title>
</head>
<body>
	Compte n° ${e.compte}<br>
	Email : ${ e.email }<br>
	Nom : ${ e.nom }<br>
	Prenom : ${ e.prenom }<br>
	Telephone : ${ e.telephone }<br>
	
	<a href="CompteLister">Retour au listing</a>
</body>
</html>