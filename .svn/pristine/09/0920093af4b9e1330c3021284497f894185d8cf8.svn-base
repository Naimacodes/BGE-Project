<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link
	href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700"
	rel="stylesheet">

<!-- feuille de style CSS -->
<link href="css/connexion.css" type="text/css" rel="stylesheet">

<meta charset="UTF-8">
<title>CRCL Application</title>
</head>
<body>
	<div>
		<h1>CRCL Application</h1>
		<%@ include file="template/navbar.jsp"%>
		<div class="wrapper">
			<form method="POST" action="Connexion">
			
				<div class="formcontainer">
					<h2 style="color: red">
					<c:if test="${success == true}">Création du compte réussi !</c:if>
				</h2>
					<div class="container">
					<br>
						<label for="uname"><strong>Email</strong></label> <input
							type="text" placeholder="Email" name="email" required
							value="${email}"> <label for="psw"><strong>Password</strong></label>
						<input type="password" placeholder="Password" name="motDePasse"
							required value="${motDePasse}">
					</div>
					<button type="submit">Connexion</button>




					<div class="container" style="background-color: #eee">
						<label style="padding-left: 15px"> <input type="checkbox"
							checked="checked" name="remember"> Remember me
						</label> <span class="psw"><a href="#"> Forgot password?</a></span>
					</div>
				</div>
			</form>
		</div>
		<br>
		<form method="get" action="CompteCreer">
			<button type="submit">Creer un compte</button>
		</form>
		<br>
		<form method="get" action="Welcome">
			<button type="submit">Page de bienvenue</button>
		</form>
<!-- 	<div class="footerB"> -->
<%-- 	<%@ include file="footer.jsp"%> --%>
<!-- 	</div> -->
	</div>

	
</body>
</html>