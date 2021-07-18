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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name = "TypeSeance", catalog = "crcl", schema = "", uniqueConstraints = {
    @UniqueConstraint(name="UNIQUE_TypeSeance_libelleCourt", columnNames = {"libelleCourt"}),
	@UniqueConstraint(name="UNIQUE_TypeSeance_libelle", columnNames = {"libelle"})}
)
@XmlRootElement
public class TypeSeance implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "typeSeance", nullable = false)
    private Long typeSeance;
    
    @Basic(optional = false)
    @NotNull
    @Column(name = "actif", nullable = false)
    private boolean actif;
    
    @Size(max = 128)
    @Column(name = "description", length = 128)
    private String description;
    
    @Size(max = 32)
    @Column(name = "libelle", length = 32)
    private String libelle;
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 8)
    @Column(name = "libelleCourt", nullable = false, length = 8)
    private String libelleCourt;

    public TypeSeance() {
    }

    public TypeSeance(Long typeSeance) {
        this.typeSeance = typeSeance;
    }

    public TypeSeance(Long typeSeance, boolean actif, String libelleCourt) {
        this.typeSeance = typeSeance;
        this.actif = actif;
        this.libelleCourt = libelleCourt;
    }

    public Long getTypeSeance() {
        return this.typeSeance;
    }

    public void setTypeSeance(Long typeSeance) {
        this.typeSeance = typeSeance;
    }

    public boolean getActif() {
        return this.actif;
    }

    public void setActif(boolean actif) {
        this.actif = actif;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLibelle() {
        return this.libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getLibelleCourt() {
        return this.libelleCourt;
    }

    public void setLibelleCourt(String libelleCourt) {
        this.libelleCourt = libelleCourt;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (this.typeSeance != null ? this.typeSeance.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof TypeSeance)) {
            return false;
        }
        TypeSeance other = (TypeSeance) object;
        if ((this.typeSeance == null && other.typeSeance != null) || (this.typeSeance != null && !this.typeSeance.equals(other.typeSeance))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return this.getClass().getCanonicalName() + "[ typeSeance=" + this.typeSeance + " ]";
    }
    
}
