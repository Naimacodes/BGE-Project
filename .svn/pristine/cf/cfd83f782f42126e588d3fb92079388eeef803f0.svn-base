/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.bge.model;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author elskwi
 */
@Entity
@Table(name = "CompteRendu", catalog = "crcl", schema = "")
@XmlRootElement
public class CompteRendu implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "compteRendu", nullable = false)
    private Long compteRendu;
    
    @Column(name = "assiduiteStagiaire")
    private Boolean assiduiteStagiaire;
    
    @Size(max = 400)
    @Column(name = "assiduiteStagiaireCommentaire", length = 400)
    private String assiduiteStagiaireCommentaire;
    
    @Size(max = 4096)
    @Column(name = "commentaireLibre", length = 4096)
    private String commentaireLibre;
    
    @Column(name = "comprehensionStagiare")
    private Boolean comprehensionStagiare;
    
    @Size(max = 400)
    @Column(name = "comprehensionStagiareCommentaire", length = 400)
    private String comprehensionStagiareCommentaire;
    
    @Column(name = "conditionsMaterielles")
    private Boolean conditionsMaterielles;
    
    @Size(max = 400)
    @Column(name = "conditionsMateriellesCommentaire", length = 400)
    private String conditionsMateriellesCommentaire;
    
    @Column(name = "contenuModuleRespecte")
    private Boolean contenuModuleRespecte;
    
    @Size(max = 400)
    @Column(name = "contenuModuleRespecteCommentaire", length = 400)
    private String contenuModuleRespecteCommentaire;
    
    @Size(max = 1024)
    @Column(name = "contenuSeance", length = 1024)
    private String contenuSeance;
    
    @Basic(optional = false)
    @NotNull
    @Column(name = "date", nullable = false)
    private Date date;
    
    @Column(name = "evaluationAcquis")
    private Boolean evaluationAcquis;
    
    @Size(max = 400)
    @Column(name = "evaluationAcquisCommentaire", length = 400)
    private String evaluationAcquisCommentaire;
    
    @Column(name = "horairesRespecte")
    private Boolean horairesRespecte;
    
    @Size(max = 400)
    @Column(name = "horairesRespecteCommentaire", length = 400)
    private String horairesRespecteCommentaire;
    
    @Column(name = "participationStagiare")
    private Boolean participationStagiare;
    
    @Size(max = 400)
    @Column(name = "participationStagiareCommentaire", length = 400)
    private String participationStagiareCommentaire;
    
    @Column(name = "timingRythmeRespecte")
    private Boolean timingRythmeRespecte;
    
    @Size(max = 400)
    @Column(name = "timingRythmeRespecteCommentaire", length = 400)
    private String timingRythmeRespecteCommentaire;
    
    @Column(name = "vieDeGroupe")
    private Boolean vieDeGroupe;
    
    @Size(max = 400)
    @Column(name = "vieDeGroupeCommentaire", length = 400)
    private String vieDeGroupeCommentaire;
    
    @JoinColumn(name = "formateur", referencedColumnName = "formateur", nullable = true,
    		foreignKey = @ForeignKey(name="FK_un_compte_rendu_est_rempli_par_un_formateur")
    )
    @ManyToOne(optional = true, fetch = FetchType.LAZY)
    private Formateur formateur;
    
    @JoinColumn(name = "typeSeance", referencedColumnName = "typeSeance", nullable = false,
    		foreignKey = @ForeignKey(name="FK_un_compte_rendu_est_aussi_une_sceance_d_un_type")
    )
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private TypeSeance typeSeance;
    
    @JoinColumn(name = "adresse", referencedColumnName = "adresse", nullable = true,
    		foreignKey = @ForeignKey(name="FK_un_compte_rendu_se_deroule_a_une_adresse")
    )
    @ManyToOne(optional = true, fetch = FetchType.LAZY)
    private Adresse adresse;
    
    @JoinColumn(name = "formationModule", referencedColumnName = "formationModule", nullable = false,
    		foreignKey = @ForeignKey(name="FK_un_compte_rendu_concerne_un_module_de_formation")
    )
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private FormationModule formationModule;

    public CompteRendu() {
    }

    public CompteRendu(Long compteRendu) {
        this.compteRendu = compteRendu;
    }

    public Long getCompteRendu() {
        return this.compteRendu;
    }

    public void setCompteRendu(Long compteRendu2) {
        this.compteRendu = compteRendu2;
    }

    public Boolean getAssiduiteStagiaire() {
        return this.assiduiteStagiaire;
    }

    public void setAssiduiteStagiaire(Boolean assiduiteStagiaire) {
        this.assiduiteStagiaire = assiduiteStagiaire;
    }

    public String getAssiduiteStagiaireCommentaire() {
        return this.assiduiteStagiaireCommentaire;
    }

    public void setAssiduiteStagiaireCommentaire(String assiduiteStagiaireCommentaire) {
        this.assiduiteStagiaireCommentaire = assiduiteStagiaireCommentaire;
    }

    public String getCommentaireLibre() {
        return this.commentaireLibre;
    }

    public void setCommentaireLibre(String commentaireLibre) {
        this.commentaireLibre = commentaireLibre;
    }

    public Boolean getComprehensionStagiare() {
        return this.comprehensionStagiare;
    }

    public void setComprehensionStagiare(Boolean comprehensionStagiare) {
        this.comprehensionStagiare = comprehensionStagiare;
    }

    public String getComprehensionStagiareCommentaire() {
        return this.comprehensionStagiareCommentaire;
    }

    public void setComprehensionStagiareCommentaire(String comprehensionStagiareCommentaire) {
        this.comprehensionStagiareCommentaire = comprehensionStagiareCommentaire;
    }

    public Boolean getConditionsMaterielles() {
        return this.conditionsMaterielles;
    }

    public void setConditionsMaterielles(Boolean conditionsMaterielles) {
        this.conditionsMaterielles = conditionsMaterielles;
    }

    public String getConditionsMateriellesCommentaire() {
        return this.conditionsMateriellesCommentaire;
    }

    public void setConditionsMateriellesCommentaire(String conditionsMateriellesCommentaire) {
        this.conditionsMateriellesCommentaire = conditionsMateriellesCommentaire;
    }

    public Boolean getContenuModuleRespecte() {
        return this.contenuModuleRespecte;
    }

    public void setContenuModuleRespecte(Boolean contenuModuleRespecte) {
        this.contenuModuleRespecte = contenuModuleRespecte;
    }

    public String getContenuModuleRespecteCommentaire() {
        return this.contenuModuleRespecteCommentaire;
    }

    public void setContenuModuleRespecteCommentaire(String contenuModuleRespecteCommentaire) {
        this.contenuModuleRespecteCommentaire = contenuModuleRespecteCommentaire;
    }

    public String getContenuSeance() {
        return this.contenuSeance;
    }

    public void setContenuSeance(String contenuSeance) {
        this.contenuSeance = contenuSeance;
    }

    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Boolean getEvaluationAcquis() {
        return this.evaluationAcquis;
    }

    public void setEvaluationAcquis(Boolean evaluationAcquis) {
        this.evaluationAcquis = evaluationAcquis;
    }

    public String getEvaluationAcquisCommentaire() {
        return this.evaluationAcquisCommentaire;
    }

    public void setEvaluationAcquisCommentaire(String evaluationAcquisCommentaire) {
        this.evaluationAcquisCommentaire = evaluationAcquisCommentaire;
    }

    public Boolean getHorairesRespecte() {
        return this.horairesRespecte;
    }

    public void setHorairesRespecte(Boolean horairesRespecte) {
        this.horairesRespecte = horairesRespecte;
    }

    public String getHorairesRespecteCommentaire() {
        return this.horairesRespecteCommentaire;
    }

    public void setHorairesRespecteCommentaire(String horairesRespecteCommentaire) {
        this.horairesRespecteCommentaire = horairesRespecteCommentaire;
    }

    public Boolean getParticipationStagiare() {
        return this.participationStagiare;
    }

    public void setParticipationStagiare(Boolean participationStagiare) {
        this.participationStagiare = participationStagiare;
    }

    public String getParticipationStagiareCommentaire() {
        return this.participationStagiareCommentaire;
    }

    public void setParticipationStagiareCommentaire(String participationStagiareCommentaire) {
        this.participationStagiareCommentaire = participationStagiareCommentaire;
    }

    public Boolean getTimingRythmeRespecte() {
        return this.timingRythmeRespecte;
    }

    public void setTimingRythmeRespecte(Boolean timingRythmeRespecte) {
        this.timingRythmeRespecte = timingRythmeRespecte;
    }

    public String getTimingRythmeRespecteCommentaire() {
        return this.timingRythmeRespecteCommentaire;
    }

    public void setTimingRythmeRespecteCommentaire(String timingRythmeRespecteCommentaire) {
        this.timingRythmeRespecteCommentaire = timingRythmeRespecteCommentaire;
    }

    public Boolean getVieDeGroupe() {
        return this.vieDeGroupe;
    }

    public void setVieDeGroupe(Boolean vieDeGroupe) {
        this.vieDeGroupe = vieDeGroupe;
    }

    public String getVieDeGroupeCommentaire() {
        return this.vieDeGroupeCommentaire;
    }

    public void setVieDeGroupeCommentaire(String vieDeGroupeCommentaire) {
        this.vieDeGroupeCommentaire = vieDeGroupeCommentaire;
    }

    public Formateur getFormateur() {
        return this.formateur;
    }

    public void setFormateur(Formateur formateur) {
        this.formateur = formateur;
    }

    public TypeSeance getTypeSeance() {
        return this.typeSeance;
    }

    public void setTypeSeance(TypeSeance typeSeance) {
        this.typeSeance = typeSeance;
    }

    public Adresse getAdresse() {
        return this.adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public FormationModule getFormationModule() {
        return this.formationModule;
    }

    public void setFormationModule(FormationModule formationModule) {
        this.formationModule = formationModule;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (this.compteRendu != null ? this.compteRendu.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof CompteRendu)) {
            return false;
        }
        CompteRendu other = (CompteRendu) object;
        if ((this.compteRendu == null && other.compteRendu != null) || (this.compteRendu != null && !this.compteRendu.equals(other.compteRendu))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return this.getClass().getCanonicalName() + "[ compteRendu=" + this.compteRendu + " ]";
    }
    
}
