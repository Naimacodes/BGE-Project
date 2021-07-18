<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv='Content-Type' content='text/html; charset=UTF-8' />
	<title>Modification telephone</title>
	
</head>
<body>
	Modification du compte : ${e.compte}

	<form action="CompteModifier" method="post">
		<input type="text" id="telephone" name="telephone" value="${e.telephone}"/>
		<input type="submit" value="Mettre à jour"/>
		<input type="hidden" name="id" value="${e.compte}" />
	</form>
	<a href="CompteLister">Retour au listing</a>

</body>
</html>