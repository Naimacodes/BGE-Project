/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.bge.model;

import java.io.Serializable;
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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author elskwi
 */
@Entity
@Table(name = "Formateur", catalog = "crcl", schema = "")
@XmlRootElement
public class Formateur implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "formateur", nullable = false)
    private Long formateur;
    
    @JoinColumn(name = "compte", referencedColumnName = "compte", nullable = false,
        	foreignKey = @ForeignKey(name="FK_un_formateur_est_attache_a_un_compte")
    )
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Compte compte;

    public Formateur() {
    }

    public Formateur(Long formateur) {
        this.formateur = formateur;
    }

    public Long getFormateur() {
        return this.formateur;
    }

    public void setFormateur(Long formateur) {
        this.formateur = formateur;
    }

    public Compte getCompte() {
        return this.compte;
    }

    public void setCompte(Compte compte) {
        this.compte = compte;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (this.formateur != null ? this.formateur.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Formateur)) {
            return false;
        }
        Formateur other = (Formateur) object;
        if ((this.formateur == null && other.formateur != null) || (this.formateur != null && !this.formateur.equals(other.formateur))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return this.getClass().getCanonicalName() + "[ formateur=" + this.formateur + " ]";
    }
    
}
