<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Creer compte rendu</title>
<link rel="stylesheet" href="css/style.css">
</head>
<body>
	<h2>Compte Rendu de la séance de formation</h2>	<section>
	
		<form method="post" action="/crcl/CompteRenduCreer" class="standard-form">
				
		
			    <label for="module"> Formation Module <span class="mandatory">*</span></label>
				<select name="module">
					<c:forEach items="${formationModule}" var="elt">
						<option value="${elt.formationModule}" title="${elt.formationModule}" >${elt.formationModule}  </option>
					</c:forEach>
				</select>			
		
			
				<label for="amount"> Date <span class="mandatory">*</span></label>
				<input type="date" id="date" name="date">
				<br>
				<br>
				
				<label for="adresse"> Adresse <span class="mandatory">*</span></label>
				<select name="typeSeance">
					<c:forEach items="${adresse}" var="elt">
						<option value="${elt.adresse}" title="${elt.adresse}" >${elt.adresse} : ${elt.libelle1}, ${elt.libelle2}, ${elt.codePostal}, ${elt.ville}, </option>
					</c:forEach>
				</select>
				
				<label for="typeSeance"> Types de séances <span class="mandatory">*</span></label>
				<select name="typeSeance">
					<c:forEach items="${typesSeance}" var="elt">
						<option value="${elt.typeSeance}" title="${elt.libelle}" >${elt.libelleCourt}</option>
					</c:forEach>
				</select>
				
				
				
				<label for="formateur"> Formateur <span class="mandatory">*</span></label>
				<select name="formateur">
					<c:forEach items="${formateur}" var="elt">
						<option value="${elt.formateur}" title="${elt.formateur}" >${elt.formateur} : ${elt.compte.nom}, ${elt.compte.prenom}</option>
					</c:forEach>
				</select>
				
				<br>
				<br>
				<fieldset>
				<legend> Contenu de la séance </legend>	
				<textarea id="contenuSeance" name="contenuSeance" rows="4" cols="107">
                
                </textarea>
				</fieldset>
			<fieldset>
				<legend>Creer un compte rendu : </legend>				
				
				
				<legend>Déroulement de la journée </legend>	
				<br>
				<br>
				
				
				<label for="assiduiteStagiaireCommentaire"> assiduiteStagiaireCommentaire</label>
				<input id="assiduiteStagiaireCommentaire" type="text"  name="assiduiteStagiaireCommentaire" value="${assiduiteStagiaireCommentaire}"/> <br />				
				<input type="checkbox" id="assiduiteStagiaire" name="assiduiteStagiaire" value="${assiduiteStagiaire}" /> <br />
				<br>
				<br>
				
				<label for="comprehensionStagiareCommentaire"> comprehensionStagiareCommentaire<span class="mandatory">*</span></label>
				<input id="comprehensionStagiareCommentaire" type="text"  name="comprehensionStagiareCommentaire" value="${comprehensionStagiareCommentaire}"/> <br />				
				<input type="checkbox" id="comprehensionStagiare" name="comprehensionStagiare" value="${comprehensionStagiare}"/> <br />
				
				<br>
				<br>
				
				<label for="conditionsMateriellesCommentaire"> conditionsMateriellesCommentaire<span class="mandatory">*</span></label>
				<input id="conditionsMateriellesCommentaire" type="text"  name="conditionsMateriellesCommentaire" value="${conditionsMateriellesCommentaire}"/> <br />				
				<input type="checkbox" id="conditionsMaterielles" name="conditionsMaterielles" value="${conditionsMaterielles}" /> <br />
				
				<br>
				<br>
				
				<label for="contenuModuleRespecteCommentaire"> contenuModuleRespecteCommentaire<span class="mandatory">*</span></label>
				<input id="contenuModuleRespecteCommentaire" type="text"  name="contenuModuleRespecteCommentaire" value="${contenuModuleRespecteCommentaire}"/> <br />				
				<input type="checkbox" id="contenuModuleRespecte" name="contenuModuleRespecte" value="${contenuModuleRespecte}"/> <br />
				
				<br>
				<br>
				
				<label for="horairesRespecteCommentaire"> horairesRespecteCommentaire<span class="mandatory">*</span></label>
				<input id="horairesRespecteCommentaire" type="text"  name="horairesRespecteCommentaire" value="${horairesRespecteCommentaire}"/> <br />				
				<input type="checkbox" id="horairesRespecte" name="horairesRespecte" value="${horairesRespecte}"/> <br />
				
				<br>
				<br>
				
				<label for="participationStagiareCommentaire"> participationStagiareCommentaire<span class="mandatory">*</span></label>
				<input id="participationStagiareCommentaire" type="text"  name="participationStagiareCommentaire" value="${participationStagiareCommentaire}"/> <br />				
				<input type="checkbox" id="participationStagiare" name="participationStagiare" value="${participationStagiare}"/> <br />
				
				<br>
				<br>
				
				<label for="timingRythmeRespecteCommentaire"> timingRythmeRespecteCommentaire<span class="mandatory">*</span></label>
				<input id="timingRythmeRespecteCommentaire" type="text"  name="timingRythmeRespecteCommentaire" value="${timingRythmeRespecteCommentaire}"/> <br />				
				<input type="checkbox" id="timingRythmeRespecte" name="timingRythmeRespecte" value="${timingRythmeRespecte}" /> <br />
				
				<br>
				<br>
				
				<label for="vieDeGroupeCommentaire"> vieDeGroupeCommentaire<span class="mandatory">*</span></label>
				<input id="vieDeGroupeCommentaire" type="text"  name="vieDeGroupeCommentaire" value="${vieDeGroupeCommentaire}"/> <br />				
				<input type="checkbox" id="vieDeGroupe" name="vieDeGroupe" value="${vieDeGroupe}" /> <br />
				
				<br>
				<br>
				
				<label for="evaluationAcquisCommentaire"> evaluationAcquisCommentaire<span class="mandatory">*</span></label>
				<input id="evaluationAcquisCommentaire" type="text"  name="evaluationAcquisCommentaire" value="${evaluationAcquisCommentaire}"/> <br />				
				<input type="checkbox" id="evaluationAcquis" name="evaluationAcquis" value="${evaluationAcquis}"/> <br />
				<br>
				<br>
				
				<label for="commentaireLibre"> commentaireLibre<span class="mandatory">*</span></label>
				<input id="commentaireLibre" type="text"  name="commentaireLibre" value="${commentaireLibre}"/> <br />				
				
				
				<input type="submit" value="SUBMIT" class="noLabel"  />
				
				
				
				
				<!-- bouchon sur L'adresse, si l'adresse de la scéance n'est pas la meme que celle du module/formation -->
				
				<!--
				<label for="amount"> Adresse <span class="mandatory">*</span></label>
				<input type="text" id="label" name="label" /> <br />				
				
				<label for="amount"> Contenu Seance <span class="mandatory">*</span></label>
				<input type="text" id="label" name="label" /> <br />				
				
				<label for="amount"> Contenu Module Respecte <span class="mandatory">*</span></label>
				<input type="text" id="label" name="label" /> <br />				
				
				<label for="amount"> Contenu Module Respecte Commentaire <span class="mandatory">*</span></label>
				<input type="text" id="label" name="label" /> <br />				
				
				<input type="submit" value="Ok" class="noLabel" /> <br />
				-->
				
			</fieldset>
		</form>
	</section>	
	<a href="index.html">Back to home</a>
</body>
</html>