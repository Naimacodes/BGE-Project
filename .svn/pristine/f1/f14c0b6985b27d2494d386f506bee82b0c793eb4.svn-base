<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Lister les types de séance</title>
</head>

<body>
<a href="TypeSeanceCreer">Créer New</a>
Liste les types de séance
<table>
<c:forEach items="${list}" var="type">
    <tr>      
        <td>${type.typeSeance}</td>
        <td>${type.libelle}</td> 
        <td>${type.libelleCourt}</td> 
        <td>${type.description}</td> 
        <td>${type.actif}</td>       
         <td><a href="TypeSeanceModifier?id=${type.typeSeance}" onclick="">Modifier</a></td> 
         <td><a href="TypeSeanceSupprimer?id=${type.typeSeance}" onclick="return window.confirm('Êtes-vous sûr de vouloir supprimer ${type.libelle} ?');">X</a></td>
         <td><a href="TypeSeanceVoir?id=${type.typeSeance}" onclick="">Voir</a></td>
    </tr>
</c:forEach>
</table>
</body>
</html>
