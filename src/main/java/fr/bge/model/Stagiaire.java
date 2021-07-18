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
@Table(name = "Stagiaire", catalog = "crcl", schema = "")
@XmlRootElement
public class Stagiaire implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "stagiaire", nullable = false)
    private Long stagiaire;
    
    @JoinColumn(name = "formation", referencedColumnName = "formation", nullable = false,
        	foreignKey = @ForeignKey(name="FK_un_stagiaire_participe_a_une_formation")
    )
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Formation formation;
    
    @JoinColumn(name = "compte", referencedColumnName = "compte", nullable = false,
        	foreignKey = @ForeignKey(name="FK_un_stagiaire_est_attache_a_un_compte")
    )
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Compte compte;
    
    public Stagiaire() {
    }

    public Stagiaire(Long stagiaire) {
        this.stagiaire = stagiaire;
    }

    public Long getStagiaire() {
        return this.stagiaire;
    }

    public void setStagiaire(Long stagiaire) {
        this.stagiaire = stagiaire;
    }

    public Formation getFormation() {
        return this.formation;
    }

    public void setFormation(Formation formation) {
        this.formation = formation;
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
        hash += (this.stagiaire != null ? this.stagiaire.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Stagiaire)) {
            return false;
        }
        Stagiaire other = (Stagiaire) object;
        if ((this.stagiaire == null && other.stagiaire != null) || (this.stagiaire != null && !this.stagiaire.equals(other.stagiaire))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return this.getClass().getCanonicalName() + "[ stagiaire=" + this.stagiaire + " ]";
    }
    
}
