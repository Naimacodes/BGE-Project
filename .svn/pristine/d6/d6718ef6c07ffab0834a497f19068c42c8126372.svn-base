<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<link
	href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700"
	rel="stylesheet">

<!-- feuille de style CSS -->
<link href="css/connexion.css" type="text/css" rel="stylesheet">
<meta charset="utf-8">
<title>Welcome</title>
</head>
<body>
	<div>
	
		<h1>CRCL Application</h1>
		<%@ include file="template/navbar.jsp"%>
		
		<div class="wrapper">
			<div class="formcontainer">
			<br>
			<br>
			<br>
				<div class="container">Bonjour !</div>
				<div >
					<c:if test="${connecte == null || connecte =='false'}">
					<div class="container">
						<p>Pour avoir accés à plus de contenu vous devez vous
							connecter.</p>
						<a style="color:blue" href="Connexion">Connexion !</a>
						<br>
							<a style="color:blue" href="CompteCreer">Ou créez un compte !</a>
						</div>
					</c:if>
					</div>
					<c:if test="${connecte == 'true'}">Vous êtes connecté ! 
							<div class="container">Vous êtes ${compte.prenom} ${compte.nom} et votre
							email est ${compte.email}.
						<br>
						<div>Vous pouvez :</div>
						<div>
							<a style="color:blue" href="CompteLister">Consultez les comptes. (TODO)</a>
						</div>
						<div>
							<a style="color:blue" href="DroitLister">Consultez les droits.</a>
						</div>
						<div>
							<a style="color:blue" href="RoleLister">Consultez les roles.</a>
						</div>
						<div>
							<a style="color:blue" href="TypeMaterielLister">Consultez les materiels.</a>
						</div>
						</div>
						<form method="post" action="Welcome"><input type="hidden" name="connecte" value="false"></input><input type="submit" value=Déconnexion ></input></form>
					</c:if>
				</div>

			</div>
	</div>
</body>
</html>