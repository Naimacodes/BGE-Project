/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.bge.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author elskwi
 */
@Embeddable
public class CompteAdressePK implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Basic(optional = false)
    @NotNull
    @Column(name = "adresse", nullable = false)
    private long adresse;
    
    @Basic(optional = false)
    @NotNull
    @Column(name = "compte", nullable = false)
    private long compte;

    public CompteAdressePK() {
    }

    public CompteAdressePK(long adresse, long compte) {
        this.adresse = adresse;
        this.compte = compte;
    }

    public long getAdresse() {
        return this.adresse;
    }

    public void setAdresse(long adresse) {
        this.adresse = adresse;
    }

    public long getCompte() {
        return this.compte;
    }

    public void setCompte(long compte) {
        this.compte = compte;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) this.adresse;
        hash += (int) this.compte;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof CompteAdressePK)) {
            return false;
        }
        CompteAdressePK other = (CompteAdressePK) object;
        if (this.adresse != other.adresse) {
            return false;
        }
        if (this.compte != other.compte) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return this.getClass().getCanonicalName() + "[ adresse=" + this.adresse + ", compte=" + this.compte + " ]";
    }
    
}
