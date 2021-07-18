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
public class CompteRolePK implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Basic(optional = false)
    @NotNull
    @Column(name = "compte", nullable = false)
    private long compte;
    
    @Basic(optional = false)
    @NotNull
    @Column(name = "role", nullable = false)
    private long role;

    public CompteRolePK() {
    }

    public CompteRolePK(long compte, long role) {
        this.compte = compte;
        this.role = role;
    }

    public long getCompte() {
        return this.compte;
    }

    public void setCompte(long compte) {
        this.compte = compte;
    }

    public long getRole() {
        return this.role;
    }

    public void setRole(long role) {
        this.role = role;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) this.compte;
        hash += (int) this.role;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof CompteRolePK)) {
            return false;
        }
        CompteRolePK other = (CompteRolePK) object;
        if (this.compte != other.compte) {
            return false;
        }
        if (this.role != other.role) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return this.getClass().getCanonicalName() + "[ compte=" + this.compte + ", role=" + this.role + " ]";
    }
    
}
