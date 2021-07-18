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
import javax.persistence.UniqueConstraint;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author elskwi
 */
@Entity
@Table(name = "FormationModule", catalog = "crcl", schema = "", uniqueConstraints = {
    @UniqueConstraint(name="UNIQUE_FormationModule_formation_module_formateur", columnNames = {"formation", "module", "formateur"})})
@XmlRootElement
public class FormationModule implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "formationModule", nullable = false)
    private Long formationModule;
    
    @JoinColumn(name = "module", referencedColumnName = "module", nullable = false,
        	foreignKey = @ForeignKey(name="FK_un_module_de_formation_est_d_un_module")
    )
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Module module;
    
    @JoinColumn(name = "formation", referencedColumnName = "formation", nullable = false,
        	foreignKey = @ForeignKey(name="FK_un_module_de_formation_est_attache_a_une_formation")
    )
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Formation formation;
    
    @JoinColumn(name = "formateur", referencedColumnName = "formateur", nullable = false,
        	foreignKey = @ForeignKey(name="FK_un_formateur_est_responsable_d_un_module")
    )
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Formateur formateur;

    public FormationModule() {
    }

    public FormationModule(Long formationModule) {
        this.formationModule = formationModule;
    }

    public Long getFormationModule() {
        return this.formationModule;
    }

    public void setFormationModule(Long formationModule) {
        this.formationModule = formationModule;
    }

    public Module getModule() {
        return this.module;
    }

    public void setModule(Module module) {
        this.module = module;
    }

    public Formation getFormation() {
        return this.formation;
    }

    public void setFormation(Formation formation) {
        this.formation = formation;
    }

    public Formateur getFormateur() {
        return this.formateur;
    }

    public void setFormateur(Formateur formateur) {
        this.formateur = formateur;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (this.formationModule != null ? this.formationModule.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof FormationModule)) {
            return false;
        }
        FormationModule other = (FormationModule) object;
        if ((this.formationModule == null && other.formationModule != null) || (this.formationModule != null && !this.formationModule.equals(other.formationModule))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return this.getClass().getCanonicalName() + "[ formationModule=" + this.formationModule + " ]";
    }
    
}
