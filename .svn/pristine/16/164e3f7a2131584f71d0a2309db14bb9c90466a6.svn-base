<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Liste des formations</title>
</head>
<body>
Liste des formation
<table>
<c:forEach items="${list}" var="form">
    <tr>      
        <td>${form.formation}</td>
        <td>${form.reference}</td>  
        <td><a href="FormationSupprimer?id=${form.formation}">X</a></td>
        <td><a href="FormationModifier?id=${form.formation}">U</a>
        <td><a href="FormationVoir?id=${form.formation}">V</a>
        </td>
    </tr>
</c:forEach>
</table>
    <a href="FormationCreer">Nouvelle formation</a>
</body>
</html>