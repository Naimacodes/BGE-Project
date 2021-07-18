<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Liste des Modes de Formation</title>
</head>
<body>

<a href="ModeFormationCreer">Créer New</a>

<table>
<c:forEach items="${list}" var="mode">
    <tr>      
        <td>${mode.modeFormation}</td>
        <td>${mode.label}</td>
        <td>${mode.labelCourt}</td>
        <td>${mode.description}</td>
        <td>${mode.actif}</td>
        <td><a href="ModeFormationModifier?id=${mode.modeFormation}" onclick="">Mettre à jour</a></td>
        <td><a href="ModeFormationSupprimer?id=${mode.modeFormation}" onclick="return window.confirm('Êtes-vous sûr de vouloir supprimer ${mode.label} ?');">X</a></td>
        <td><a href="ModeFormationVoir?id=${mode.modeFormation}" onclick="">Voir</a></td>
    </tr>
</c:forEach>
</table>
</body>
</html>