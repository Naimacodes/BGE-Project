<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	Liste de droits !
	<div>
<form method="get" action="DroitCreer"> <input type="submit" value="Creer un droit" ></input></form>
	</div>
	<table>
			<tr>
				<th>Label</th>
				<th>Description</th>
				<th>Actif</th>
				<th>TODO Tout supprimer</th>
			</tr>
		<c:forEach items="${list}" var="droit">
			<tr>
				<td>${droit.label}</td>
				<td>${droit.description}</td>
				<td>${droit.actif}</td>
				<td>  <form method="get" action="DroitModifier"><input type="hidden" name="id" value="${droit.droit}"></input><input type="submit" value=Modifier ></input></form></td>
				<td>  <form method="get" action="DroitSupprimer"><input type="hidden" name="id" value="${droit.droit}"></input><input type="submit" value=Suppprimer ></input></form></td>
				<td>  <form method="get" action="DroitVoir"><input type="hidden" name="id" value="${droit.droit}"></input><input type="submit" value=Voir ></input></form></td> 
			</tr>
			
		</c:forEach>
	</table>
</body>
</html>