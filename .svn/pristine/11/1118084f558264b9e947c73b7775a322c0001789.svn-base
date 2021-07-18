/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.bge.model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author elskwi
 */
@Entity
@Table(name = "TypeMateriel", catalog = "crcl", schema = "", uniqueConstraints = {
    @UniqueConstraint(name = "UNIQUE_TypeMateriel_label", columnNames = {"label"})})
@XmlRootElement
public class TypeMateriel implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "typeMateriel", nullable = false)
    private Long typeMateriel;
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "label", nullable = false, length = 128)
    private String label;
    
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "montantCaution", nullable = false, precision = 8, scale = 2)
    @Min(value=0)
    private BigDecimal montantCaution;

    public TypeMateriel() {
    }

    public TypeMateriel(Long typeMateriel) {
        this.typeMateriel = typeMateriel;
    }

    public TypeMateriel(Long typeMateriel, String label, BigDecimal montantCaution) {
        this.typeMateriel = typeMateriel;
        this.label = label;
        this.montantCaution = montantCaution;
    }

    public Long getTypeMateriel() {
        return this.typeMateriel;
    }

    public void setTypeMateriel(Long typeMateriel) {
        this.typeMateriel = typeMateriel;
    }

    public String getLabel() {
        return this.label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public BigDecimal getMontantCaution() {
        return this.montantCaution;
    }

    public void setMontantCaution(BigDecimal montantCaution) {
        this.montantCaution = montantCaution;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (this.typeMateriel != null ? this.typeMateriel.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof TypeMateriel)) {
            return false;
        }
        TypeMateriel other = (TypeMateriel) object;
        if ((this.typeMateriel == null && other.typeMateriel != null) || (this.typeMateriel != null && !this.typeMateriel.equals(other.typeMateriel))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return this.getClass().getCanonicalName() + "[ typeMateriel=" + this.typeMateriel + " ]";
    }

	public void setDescription(String description) {
		// TODO Auto-generated method stub
		
	}

	public void setLabelCourt(String labelCourt) {
		// TODO Auto-generated method stub
		
	}

	public void setActif(Boolean actif) {
		// TODO Auto-generated method stub
		
	}
    
}
