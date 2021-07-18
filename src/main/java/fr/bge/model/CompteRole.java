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
@Table(name = "CompteRole", catalog = "crcl", schema = "")
@XmlRootElement
public class CompteRole implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @EmbeddedId
    protected CompteRolePK compteRolePK;
    
    @Basic(optional = false)
    @NotNull
    @Column(name = "dateCreation", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreation;
    
    @JoinColumn(name = "compte", referencedColumnName = "compte", nullable = false, insertable = false, updatable = false,
    	foreignKey = @ForeignKey(name="FK_un_role_est_attache_a_un_compte")
    )
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Compte compte;
    
    @JoinColumn(name = "role", referencedColumnName = "role", nullable = false, insertable = false, updatable = false,
       	foreignKey = @ForeignKey(name="FK_un_compte_est_d_un_role")
    )
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Role role;

    public CompteRole() {
    }

    public CompteRole(CompteRolePK compteRolePK) {
        this.compteRolePK = compteRolePK;
    }

    public CompteRole(CompteRolePK compteRolePK, Date dateCreation) {
        this.compteRolePK = compteRolePK;
        this.dateCreation = dateCreation;
    }

    public CompteRole(long compte, long role) {
        this.compteRolePK = new CompteRolePK(compte, role);
    }

    public CompteRolePK getCompteRolePK() {
        return this.compteRolePK;
    }

    public void setCompteRolePK(CompteRolePK compteRolePK) {
        this.compteRolePK = compteRolePK;
    }

    public Date getDateCreation() {
        return this.dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public Compte getCompte() {
        return this.compte;
    }

    public void setCompte(Compte compte1) {
        this.compte = compte1;
    }

    public Role getRole() {
        return this.role;
    }

    public void setRole(Role role1) {
        this.role = role1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (this.compteRolePK != null ? this.compteRolePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof CompteRole)) {
            return false;
        }
        CompteRole other = (CompteRole) object;
        if ((this.compteRolePK == null && other.compteRolePK != null) || (this.compteRolePK != null && !this.compteRolePK.equals(other.compteRolePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return this.getClass().getCanonicalName() + "[ compteRolePK=" + this.compteRolePK + " ]";
    }
    
}
