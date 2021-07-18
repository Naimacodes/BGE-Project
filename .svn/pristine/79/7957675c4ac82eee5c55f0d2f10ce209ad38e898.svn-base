<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Liste des comptes</title>
</head>
<body>
Liste des comptes
<table>
<c:forEach items="${list}" var="compte">
    <tr>      
        <td>${compte.compte}</td>
        <td>${compte.email}</td>
        <td>${compte.nom}</td>
        <td>${compte.prenom}</td>
        <td>${compte.telephone}</td>      
        <td><a href="CompteSupprimer?id=${compte.compte}">X</a></td>
        <td><a href="CompteModifier?id=${compte.compte}">U</a>
        <td><a href="CompteVoir?id=${compte.compte}">V</a>
        </td>
    </tr>
</c:forEach>
</table>
    <a href="CompteCreer">Nouveau compte</a>
</body>
</html>