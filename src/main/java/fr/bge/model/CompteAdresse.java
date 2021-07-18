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
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author elskwi
 */
@Entity
@Table(name = "CompteAdresse", catalog = "crcl", schema = "")
@XmlRootElement
public class CompteAdresse implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @EmbeddedId
    protected CompteAdressePK compteAdressePK;
    
    @Basic(optional = false)
    @NotNull
    @Column(name = "dateCreation", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreation;
    
    @JoinColumn(name = "adresse", referencedColumnName = "adresse", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Adresse adresse;
    
    @JoinColumn(name = "compte", referencedColumnName = "compte", nullable = false, insertable = false, updatable = false,
    		foreignKey = @ForeignKey(name="FK_un_compte_est_attache_a_une_adresse")
    )
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Compte compte;

    public CompteAdresse() {
    }

    public CompteAdresse(CompteAdressePK compteAdressePK) {
        this.compteAdressePK = compteAdressePK;
    }

    public CompteAdresse(CompteAdressePK compteAdressePK, Date dateCreation) {
        this.compteAdressePK = compteAdressePK;
        this.dateCreation = dateCreation;
    }

    public CompteAdresse(long adresse, long compte) {
        this.compteAdressePK = new CompteAdressePK(adresse, compte);
    }

    public CompteAdressePK getCompteAdressePK() {
        return this.compteAdressePK;
    }

    public void setCompteAdressePK(CompteAdressePK compteAdressePK) {
        this.compteAdressePK = compteAdressePK;
    }

    public Date getDateCreation() {
        return this.dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public Adresse getAdresse() {
        return this.adresse;
    }

    public void setAdresse(Adresse adresse1) {
        this.adresse = adresse1;
    }

    public Compte getCompte() {
        return this.compte;
    }

    public void setCompte1(Compte compte1) {
        this.compte = compte1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (this.compteAdressePK != null ? this.compteAdressePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof CompteAdresse)) {
            return false;
        }
        CompteAdresse other = (CompteAdresse) object;
        if ((this.compteAdressePK == null && other.compteAdressePK != null) || (this.compteAdressePK != null && !this.compteAdressePK.equals(other.compteAdressePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return this.getClass().getCanonicalName() + "[ compteAdressePK=" + this.compteAdressePK + " ]";
    }
    
}
