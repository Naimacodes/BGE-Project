<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Nouveau type de matériel</title>
</head>
<body>
	Nouveau type de matériel

	<form action="TypeMaterielCreer" method="post">
		<input type="text" id="label" name="label"/>
		<input type="number" id="montantCaution" name="montantCaution" step="any"/>
		<input type="submit" value="Créer"/>
	</form>

</body>
</html>