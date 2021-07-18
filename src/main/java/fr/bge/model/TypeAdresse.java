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
@Table(name = "TypeAdresse", catalog = "crcl", schema = "", 
	uniqueConstraints = { @UniqueConstraint(name="UNIQUE_TypeAdresse_label", columnNames = {"label"}) }
)
@XmlRootElement
public class TypeAdresse implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "typeAdresse", nullable = false)
    private Long typeAdresse;
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "label", nullable = false, length = 128)
    private String label;

    public TypeAdresse() {
    }

    public TypeAdresse(Long typeAdresse) {
        this.typeAdresse = typeAdresse;
    }

    public Long getTypeAdresse() {
        return this.typeAdresse;
    }

    public void setTypeAdresse(Long typeAdresse) {
        this.typeAdresse = typeAdresse;
    }

    public String getLabel() {
        return this.label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (this.typeAdresse != null ? this.typeAdresse.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof TypeAdresse)) {
            return false;
        }
        TypeAdresse other = (TypeAdresse) object;
        if ((this.typeAdresse == null && other.typeAdresse != null) || (this.typeAdresse != null && !this.typeAdresse.equals(other.typeAdresse))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return this.getClass().getCanonicalName() + "[ typeAdresse=" + this.typeAdresse + " ]";
    }
    
}
