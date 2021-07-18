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
public class RoleDroitPK implements Serializable {

    /** */
	private static final long serialVersionUID = 1L;
	
	@Basic(optional = false)
    @NotNull
    @Column(name = "droit", nullable = false)
    private long droit;
	
    @Basic(optional = false)
    @NotNull
    @Column(name = "role", nullable = false)
    private long role;

    public RoleDroitPK() {
    }

    public RoleDroitPK(long droit, long role) {
        this.droit = droit;
        this.role = role;
    }

    public long getDroit() {
        return this.droit;
    }

    public void setDroit(long droit) {
        this.droit = droit;
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
        hash += (int) this.droit;
        hash += (int) this.role;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof RoleDroitPK)) {
            return false;
        }
        RoleDroitPK other = (RoleDroitPK) object;
        if (this.droit != other.droit) {
            return false;
        }
        if (this.role != other.role) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return this.getClass().getCanonicalName() + "[ droit=" + this.droit + ", role=" + this.role + " ]";
    }
    
}
