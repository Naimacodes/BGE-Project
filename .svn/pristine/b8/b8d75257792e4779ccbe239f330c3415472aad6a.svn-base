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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author elskwi
 */
@Entity
@Table(name = "Adresse", catalog = "crcl", schema = "")
@XmlRootElement
public class Adresse implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "adresse", nullable = false)
    private Long adresse;
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "codePostal", nullable = false, length = 10)
    private String codePostal;
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "libelle1", nullable = false, length = 128)
    private String libelle1;
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "libelle2", nullable = false, length = 128)
    private String libelle2;
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "ville", nullable = false, length = 128)
    private String ville;
    
    @JoinColumn(name = "typeAdresse", referencedColumnName = "typeAdresse", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private TypeAdresse typeAdresse;
    
    public Adresse() {
    }

    public Adresse(Long adresse) {
        this.adresse = adresse;
    }

    public Long getAdresse() {
        return this.adresse;
    }

    public void setAdresse(Long adresse) {
        this.adresse = adresse;
    }

    public String getCodePostal() {
        return this.codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public String getLibelle1() {
        return this.libelle1;
    }

    public void setLibelle1(String libelle1) {
        this.libelle1 = libelle1;
    }

    public String getLibelle2() {
        return this.libelle2;
    }

    public void setLibelle2(String libelle2) {
        this.libelle2 = libelle2;
    }

    public String getVille() {
        return this.ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (this.adresse != null ? this.adresse.hashCode() : 0);
        return hash;
    }

    public TypeAdresse getTypeAdresse() {
		return this.typeAdresse;
	}
    
    public void setTypeAdresse(TypeAdresse typeAdresse) {
		this.typeAdresse = typeAdresse;
	}
    
    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Adresse)) {
            return false;
        }
        Adresse other = (Adresse) object;
        if ((this.adresse == null && other.adresse != null) || (this.adresse != null && !this.adresse.equals(other.adresse))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return this.getClass().getCanonicalName() + "[ adresse=" + this.adresse + " ]";
    }
    
}
