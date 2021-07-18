<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Lister les adresses</title>
</head>

<body>
<a href="AdresseCreer">Créer New</a>
Liste les adresses
<table>
<c:forEach items="${list}" var="adr">
    <tr>      
        <td>${adr.adresse}</td>
        <td>${adr.libelle1}</td> 
        <td>${adr.libelle2}</td> 
        <td>${adr.codePostal}</td> 
        <td>${adr.ville}</td>       
         <td><a href="AdresseModifier?id=${adr.adresse}" onclick="">Modifier</a></td> 
         <td><a href="AdresseSupprimer?id=${adr.adresse}" onclick="return window.confirm('Êtes-vous sûr de vouloir supprimer ${adr.libelle1} ?');">X</a></td>
         <td><a href="AdresseVoir?id=${adr.adresse}" onclick="">Voir</a></td>
    </tr>
</c:forEach>
</table>
</body>
</html>
