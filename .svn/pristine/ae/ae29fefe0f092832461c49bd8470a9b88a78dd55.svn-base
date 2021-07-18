<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Lister le type de matériel</title>
</head>
<body>
Liste des types de matériel
<table>
<c:forEach items="${list}" var="type">
    <tr>      
        <td>${type.typeMateriel}</td>
        <td>${type.label}</td>  
        <td>${type.montantCaution}</td> 
    </tr>
</c:forEach>
</table>
</body>
</html>