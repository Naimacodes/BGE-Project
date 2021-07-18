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
@Table(name = "EtatMateriel", catalog = "crcl", schema = "", 
	uniqueConstraints = { @UniqueConstraint(name="UNIQUE_EtatMateriel_label", columnNames = {"label"}) }
)
@XmlRootElement
public class EtatMateriel implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "etatMateriel", nullable = false)
    private Long etatMateriel;
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "label", nullable = false, length = 128)
    private String label;

    public EtatMateriel() {
    }

    public EtatMateriel(Long etatMateriel) {
        this.etatMateriel = etatMateriel;
    }

    public EtatMateriel(Long etatMateriel, String label) {
        this.etatMateriel = etatMateriel;
        this.label = label;
    }

    public Long getEtatMateriel() {
        return this.etatMateriel;
    }

    public void setEtatMateriel(Long etatMateriel) {
        this.etatMateriel = etatMateriel;
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
        hash += (this.etatMateriel != null ? this.etatMateriel.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof EtatMateriel)) {
            return false;
        }
        EtatMateriel other = (EtatMateriel) object;
        if ((this.etatMateriel == null && other.etatMateriel != null) || (this.etatMateriel != null && !this.etatMateriel.equals(other.etatMateriel))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return this.getClass().getCanonicalName() + "[ etatMateriel=" + this.etatMateriel + " ]";
    }
    
}
