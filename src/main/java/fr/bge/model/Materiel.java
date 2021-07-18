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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author elskwi
 */
@Entity
@Table(name = "Materiel", catalog = "crcl", schema = "", uniqueConstraints = {
    @UniqueConstraint(name = "UNIQUE_Materiel_reference", columnNames = {"reference"})})
@XmlRootElement
public class Materiel implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "materiel", nullable = false)
    private Long materiel;
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "designation", nullable = false, length = 128)
    private String designation;
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "reference", nullable = false, length = 128)
    private String reference;
    
    @JoinColumn(name = "typeMateriel", referencedColumnName = "typeMateriel", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private TypeMateriel typeMateriel;
    
    @JoinColumn(name = "etatMateriel", referencedColumnName = "etatMateriel", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private EtatMateriel etatMateriel;

    public Materiel() {
    }

    public Materiel(Long materiel) {
        this.materiel = materiel;
    }

    public Materiel(Long materiel, String designation, String reference) {
        this.materiel = materiel;
        this.designation = designation;
        this.reference = reference;
    }

    public Long getMateriel() {
        return this.materiel;
    }

    public void setMateriel(Long materiel) {
        this.materiel = materiel;
    }

    public String getDesignation() {
        return this.designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getReference() {
        return this.reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public TypeMateriel getTypeMateriel() {
        return this.typeMateriel;
    }

    public void setTypeMateriel(TypeMateriel typeMateriel) {
        this.typeMateriel = typeMateriel;
    }

    public EtatMateriel getEtatMateriel() {
        return this.etatMateriel;
    }

    public void setEtatMateriel(EtatMateriel etatMateriel) {
        this.etatMateriel = etatMateriel;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (this.materiel != null ? this.materiel.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Materiel)) {
            return false;
        }
        Materiel other = (Materiel) object;
        if ((this.materiel == null && other.materiel != null) || (this.materiel != null && !this.materiel.equals(other.materiel))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return this.getClass().getCanonicalName() + "[ materiel=" + this.materiel + " ]";
    }
    
}
