<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Liste des états de matériel</title>
</head>
<body>
Liste des états de matériel
<table>
<c:forEach items="${list}" var="etat">
    <tr>      
        <td>${etat.etatMateriel}</td>
        <td>${etat.label}</td>  
        <td><a href="EtatMaterielSupprimer?id=${etat.etatMateriel}">X</a></td>
        <td><a href="EtatMaterielModifier?id=${etat.etatMateriel}">U</a>
        <td><a href="EtatMaterielVoir?id=${etat.etatMateriel}">V</a>
        </td>
    </tr>
</c:forEach>
</table>
    <a href="EtatMaterielCreer">Nouveau etat materiel</a>
</body>
</html>