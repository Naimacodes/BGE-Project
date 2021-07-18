<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Liste des modules</title>
</head>
<body>
<table>
<c:forEach items="${list}" var="module">
    <tr>      
        <td>${module.module}</td>
        <td>${module.label}</td>
        <td><a href="ModuleSupprimer?id=${module.module}" onclick="">X</a></td>
        <td><a href="ModuleModifier?id=${module.module}" onclick="">U</a></td>
        <td><a href="ModuleVoir?id=${module.module}" onclick="">V</a></td>
</c:forEach>
</table>
<a href="ModuleCreer">Nouveau module</a>
</body>
</html>