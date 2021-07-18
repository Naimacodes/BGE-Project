/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.bge.model;

import java.io.Serializable;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author elskwi
 */
@Entity
@Table(name = "Formation", catalog = "crcl", schema = "", uniqueConstraints = {
    @UniqueConstraint(name = "UNIQUE_Formation_reference", columnNames = {"reference"})})
@XmlRootElement
public class Formation implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "formation", nullable = false)
    private Long formation;
    
    @Basic(optional = false)
    @NotNull
    @Column(name = "dateDebut", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateDebut;
    
    @Basic(optional = false)
    @NotNull
    @Column(name = "dateFin", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateFin;
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "intitule", nullable = false, length = 128)
    private String intitule;
    
    @Basic(optional = false)
    @NotNull
    @Column(name = "nombreJours", nullable = false)
    private int nombreJours;
    
    @Basic(optional = false)
    @NotNull
    @Column(name = "nombrePlaces", nullable = false)
    private int nombrePlaces;
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "reference", nullable = false, length = 45)
    private String reference;
    
    @JoinColumn(name = "referentFormation", referencedColumnName = "compte", nullable = false,
        	foreignKey = @ForeignKey(name="FK_une_formation_a_un_responsable_referent")
    )
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Compte referentFormation;
    
    @JoinColumn(name = "adresse", referencedColumnName = "adresse", nullable = false,
        	foreignKey = @ForeignKey(name="FK_une_formation_se_deroule_a_une_adresse")
    )
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Adresse adresse;
    
    @JoinColumn(name = "modeFormation", referencedColumnName = "modeFormation", nullable = false,
        	foreignKey = @ForeignKey(name="FK_une_formation_se_deroule_dans_un_mode")
    )
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private ModeFormation modeFormation;

    public Formation() {
    }

    public Formation(Long formation) {
        this.formation = formation;
    }

    public Long getFormation() {
        return this.formation;
    }

    public void setFormation(Long formation) {
        this.formation = formation;
    }

    public Date getDateDebut() {
        return this.dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateFin() {
        return this.dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public String getIntitule() {
        return this.intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public int getNombreJours() {
        return this.nombreJours;
    }

    public void setNombreJours(int nombreJours) {
        this.nombreJours = nombreJours;
    }

    public int getNombrePlaces() {
        return this.nombrePlaces;
    }

    public void setNombrePlaces(int nombrePlaces) {
        this.nombrePlaces = nombrePlaces;
    }

    public String getReference() {
        return this.reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public Compte getReferentFormation() {
        return this.referentFormation;
    }

    public void setReferentFormation(Compte referentFormation) {
        this.referentFormation = referentFormation;
    }

    public Adresse getAdresse() {
        return this.adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public ModeFormation getModeFormation() {
        return this.modeFormation;
    }

    public void setModeFormation(ModeFormation modeFormation) {
        this.modeFormation = modeFormation;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (this.formation != null ? this.formation.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Formation)) {
            return false;
        }
        Formation other = (Formation) object;
        if ((this.formation == null && other.formation != null) || (this.formation != null && !this.formation.equals(other.formation))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return this.getClass().getCanonicalName() + "[ formation=" + this.formation + " ]";
    }
    
}
