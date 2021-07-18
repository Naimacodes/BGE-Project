<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Modification du type de matériel</title>
</head>
<body>
	Modification du type de matériel

	<form action="TypeMaterielModifier" method="post">
		<input type="text" id="label" name="label" value="${entity.label}"/>
		<input type="number" id="montantCaution" name="montantCaution" value="${entity.montantCaution}" step="any"/>
		<input type="submit" value="Modifier"/>
		<input type="hidden" name="id" value="${entity.typeMateriel}"/>
		
	</form>

</body>
</html>