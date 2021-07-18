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
@Table(name = "Droit", catalog = "crcl", schema = "",
	uniqueConstraints = { @UniqueConstraint(name="UNIQUE_Droit_label", columnNames = {"label"}) }
)
@XmlRootElement
public class Droit implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "droit", nullable = false)
    private Long droit;
    
    @Basic(optional = false)
    @NotNull
    @Column(name = "actif", nullable = false)
    private boolean actif;
    
    @Size(max = 512)
    @Column(name = "description", length = 512)
    private String description;
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "label", nullable = false, length = 128)
    private String label;

    public Droit() {
    }

    public Droit(Long droit) {
        this.droit = droit;
    }

    public Droit(Long droit, boolean actif, String label) {
        this.droit = droit;
        this.actif = actif;
        this.label = label;
    }

    public Long getDroit() {
        return this.droit;
    }

    public void setDroit(Long droit) {
        this.droit = droit;
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

    public String getLabel() {
        return this.label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (this.droit != null ? this.droit.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Droit)) {
            return false;
        }
        Droit other = (Droit) object;
        if ((this.droit == null && other.droit != null) || (this.droit != null && !this.droit.equals(other.droit))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return this.getClass().getCanonicalName() + "[ droit=" + this.droit + " ]";
    }
    
}
