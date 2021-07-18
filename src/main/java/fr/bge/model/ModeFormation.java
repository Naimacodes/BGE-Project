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
@Table(name = "ModeFormation", catalog = "crcl", schema = "", uniqueConstraints = {
    @UniqueConstraint(name = "UNIQUE_ModeFormation_labelCourt", columnNames = {"labelCourt"})
    , @UniqueConstraint(name = "UNIQUE_ModeFormation_label", columnNames = {"label"})})
@XmlRootElement
public class ModeFormation implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "modeFormation", nullable = false)
    private Long modeFormation;
    
    @Basic(optional = false)
    @NotNull
    @Column(name = "actif", nullable = false)
    private boolean actif;
    
    @Size(max = 256)
    @Column(name = "description", length = 256)
    private String description;
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 64)
    @Column(name = "label", nullable = false, length = 64)
    private String label;
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "labelCourt", nullable = false, length = 10)
    private String labelCourt;

    public ModeFormation() {
    }

    public ModeFormation(Long modeFormation) {
        this.modeFormation = modeFormation;
    }

    public ModeFormation(Long modeFormation, boolean actif, String label, String labelCourt) {
        this.modeFormation = modeFormation;
        this.actif = actif;
        this.label = label;
        this.labelCourt = labelCourt;
    }

    public Long getModeFormation() {
        return this.modeFormation;
    }

    public void setModeFormation(Long modeFormation) {
        this.modeFormation = modeFormation;
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

    public String getLabelCourt() {
        return this.labelCourt;
    }

    public void setLabelCourt(String labelCourt) {
        this.labelCourt = labelCourt;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (this.modeFormation != null ? this.modeFormation.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof ModeFormation)) {
            return false;
        }
        ModeFormation other = (ModeFormation) object;
        if ((this.modeFormation == null && other.modeFormation != null) || (this.modeFormation != null && !this.modeFormation.equals(other.modeFormation))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return this.getClass().getCanonicalName() + "[ modeFormation=" + this.modeFormation + " ]";
    }
    
}
