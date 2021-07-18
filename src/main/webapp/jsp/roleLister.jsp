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
	Liste de roles !
	<div>
<form method="get" action="RoleCreer"><input type="submit" value="Creer un role" ></input></form>
	</div>
	<table>
			<tr>
				<th>Label</th>
				<th>Description</th>
				<th>Actif</th>
			</tr>
		<c:forEach items="${list}" var="role">
			<tr>
				<td>${role.label}</td>
				<td>${role.description}</td>
				<td>${role.actif}</td>
						<td>  <form method="get" action="RoleModifier"><input type="hidden" name="id" value="${role.role}"></input><input type="submit" value=Modifier ></input></form></td>
				<td>  <form method="get" action="RoleSupprimer"><input type="hidden" name="id" value="${role.role}"></input><input type="submit" value=Suppprimer ></input></form></td>
				<td>  <form method="get" action="RoleVoir"><input type="hidden" name="id" value="${role.role}"></input><input type="submit" value=Voir ></input></form></td> 
			</tr>
		</c:forEach>
	</table>
</body>
</html>