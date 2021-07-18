<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Compte Rendu Liste</title>
</head>
<body>
	Liste de comptes rendus
	
<table>
<c:forEach items="${list}" var="compteRendu">
    <tr>      
        <td>${compteRendu}</td>      
        <td>${compteRendu.commentaireLibre}</td>
        <td>${compteRendu.adresse}</td>
        <td>${compteRendu.assiduiteStagiaire }</td>
        <td>${compteRendu.assiduiteStagiaireCommentaire }</td>
        <td>${compteRendu.comprehensionStagiare}</td>
        <td>${compteRendu.comprehensionStagiareCommentaire }</td>
        <td>${compteRendu.conditionsMaterielles }</td>
        <td>${compteRendu.conditionsMateriellesCommentaire }</td>
        <td>${compteRendu.contenuModuleRespecte}</td>
        <td>${compteRendu.contenuModuleRespecteCommentaire}</td>
        <td>${compteRendu.contenuSeance}</td> 
        <td>${compteRendu.date}</td>
        <td>${compteRendu.evaluationAcquis }</td>
        <td>${compteRendu.evaluationAcquisCommentaire}</td> 
        <td>${compteRendu.formateur }</td>
		<td>${compteRendu.formationModule }</td>
        <td>${compteRendu.horairesRespecte }</td>
        <td>${compteRendu.horairesRespecteCommentaire}</td>
        <td>${compteRendu.participationStagiare }</td>
        <td>${compteRendu.participationStagiareCommentaire }</td>
        <td>${compteRendu.timingRythmeRespecte }</td>
        <td>${compteRendu.timingRythmeRespecteCommentaire}</td>
        <td>${compteRendu.typeSeance }</td>
        <td>${compteRendu.vieDeGroupe }</td>
        <td>${compteRendu.vieDeGroupeCommentaire }</td>     
    </tr>
</c:forEach>
</table>
</body>
</html>