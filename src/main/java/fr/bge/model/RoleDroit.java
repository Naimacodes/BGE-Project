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
@Table(name = "RoleDroit", catalog = "crcl", schema = "")
@XmlRootElement
public class RoleDroit implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected RoleDroitPK roleDroitPK;
    
    @Basic(optional = false)
    @NotNull
    @Column(name = "dateCreation", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreation;
    
    @JoinColumn(name = "role", referencedColumnName = "role", nullable = false, insertable = false, updatable = false,
        	foreignKey = @ForeignKey(name="FK_un_droit_est_assigne_a_des_roles")
    )
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Role role;
    
    @JoinColumn(name = "droit", referencedColumnName = "droit", nullable = false, insertable = false, updatable = false,
        	foreignKey = @ForeignKey(name="FK_un_role_contient_des_droits")
    )
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Droit droit;

    public RoleDroit() {
    }

    public RoleDroit(RoleDroitPK roleDroitPK) {
        this.roleDroitPK = roleDroitPK;
    }

    public RoleDroit(RoleDroitPK roleDroitPK, Date dateCreation) {
        this.roleDroitPK = roleDroitPK;
        this.dateCreation = dateCreation;
    }

    public RoleDroit(long droit, long role) {
        this.roleDroitPK = new RoleDroitPK(droit, role);
    }

    public RoleDroitPK getRoleDroitPK() {
        return this.roleDroitPK;
    }

    public void setRoleDroitPK(RoleDroitPK roleDroitPK) {
        this.roleDroitPK = roleDroitPK;
    }

    public Date getDateCreation() {
        return this.dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public Role getRole() {
        return this.role;
    }

    public void setRole(Role role1) {
        this.role = role1;
    }

    public Droit getDroit() {
        return this.droit;
    }

    public void setDroit(Droit droit1) {
        this.droit = droit1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (this.roleDroitPK != null ? this.roleDroitPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof RoleDroit)) {
            return false;
        }
        RoleDroit other = (RoleDroit) object;
        if ((this.roleDroitPK == null && other.roleDroitPK != null) || (this.roleDroitPK != null && !this.roleDroitPK.equals(other.roleDroitPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return this.getClass().getCanonicalName() + "[ roleDroitPK=" + this.roleDroitPK + " ]";
    }
    
}
