<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv='Content-Type' content='text/html; charset=UTF-8' />
	<title>Modification module</title>
	
</head>
<body>
	Modification du module : ${e.module}

	<form action="ModuleModifier" method="post">
		<input type="text" id="label" name="label" value="${e.label}"/>
		<input type="submit" value="Mettre à jour"/>
		<input type="hidden" name="id" value="${e.module}" />
	</form>
	<a href="ModuleLister">Retour au listing</a>
</body>
</html>