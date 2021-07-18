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
public class MaterielStagiairePK implements Serializable {

    /** */
	private static final long serialVersionUID = 1L;

	@Basic(optional = false)
    @NotNull
    @Column(name = "materiel", nullable = false)
    private long materiel;
    
    @Basic(optional = false)
    @NotNull
    @Column(name = "stagiaire", nullable = false)
    private long stagiaire;

    public MaterielStagiairePK() {
    }

    public MaterielStagiairePK(long materiel, long stagiaire) {
        this.materiel = materiel;
        this.stagiaire = stagiaire;
    }

    public long getMateriel() {
        return this.materiel;
    }

    public void setMateriel(long materiel) {
        this.materiel = materiel;
    }

    public long getStagiaire() {
        return this.stagiaire;
    }

    public void setStagiaire(long stagiaire) {
        this.stagiaire = stagiaire;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) this.materiel;
        hash += (int) this.stagiaire;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof MaterielStagiairePK)) {
            return false;
        }
        MaterielStagiairePK other = (MaterielStagiairePK) object;
        if (this.materiel != other.materiel) {
            return false;
        }
        if (this.stagiaire != other.stagiaire) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return this.getClass().getCanonicalName() + "[ materiel=" + this.materiel + ", stagiaire=" + this.stagiaire + " ]";
    }
    
}
