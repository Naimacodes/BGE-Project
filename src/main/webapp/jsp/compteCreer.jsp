<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<link
	href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700"
	rel="stylesheet">

<!-- feuille de style CSS -->
<link href="/crcl/css/connexion.css" type="text/css" rel="stylesheet">
<meta charset="UTF-8">
<title>Creer Compte</title>
<link rel="stylesheet" href="css/style.css">
</head>
<body>
	<div>
<h1>CRCL Application</h1>
		<%@ include file="template/navbar.jsp"%>
    <div class="wrapper">
    <section>
    <div class="formcontainer">
    <div class="container">
        <form method="post" action="/crcl/CompteCreer" class="standard-form">
            <fieldset>
                <legend>Creer un compte : </legend>
                <label for="email"> Email <span class="mandatory"></span></label>
                <input type="text" id="email" name="email" value="${email}" /> <br />
                <label for="motDePasse"> Mot De Passe <span class="mandatory"></span></label>
                <input type="password" id="motDePasse" name="motDePasse" value="${motDePasse}" /> <br />
                <label for="nom"> Nom <span class="mandatory"></span></label>
                <input type="text" id="nom" name="nom" value="${nom}" /> <br />
                <label for="prenom"> Prenom <span class="mandatory"></span></label> 
                <input type="text" id="prenom" name="prenom" value="${prenom}" /> <br />
                <label for="telephone"> Telephone <span class="mandatory"></span></label> 
                <input type="text" id="telephone" name="telephone" value="${telephone}" /> <br />               
                <button type="submit" value="Ok" class="noLabel" > <br /> Creer un compte</button>
            </fieldset>
        </form>
    </section>
    <a style="color:blue" href="/crcl/Connexion">Back to home</a>
    </div>
    </div>
    </div>
    </div>
</body>
</html>