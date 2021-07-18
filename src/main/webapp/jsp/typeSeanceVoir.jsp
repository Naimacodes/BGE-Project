<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Voir un Type de seance</title>
</head>
<body>
<a href="TypeSeanceLister">Listes</a><br>
Type de seance :<br>
	ID = ${id} <br>
	LabelCourt = ${entity.libelleCourt}<br>
	Label = ${entity.libelle}<br>
	Description = ${entity.description}<br>
</body>
</html>