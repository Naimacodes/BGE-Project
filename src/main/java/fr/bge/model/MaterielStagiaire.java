/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.bge.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author elskwi
 */
@Entity
@Table(name = "MaterielStagiaire", catalog = "crcl", schema = "")
@XmlRootElement
public class MaterielStagiaire implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @EmbeddedId
    protected MaterielStagiairePK materielStagiairePK;
    
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "caution", precision = 8, scale = 2)
    @Min(value=0)
    private BigDecimal caution;
    
    @Basic(optional = false)
    @NotNull
    @Column(name = "cautionRendue", nullable = false)
    private boolean cautionRendue;
    
    @Size(max = 256)
    @Column(name = "commentairePret", length = 256)
    private String commentairePret;
    
    @Size(max = 256)
    @Column(name = "commentaireRestitution", length = 256)
    private String commentaireRestitution;
    
    @Basic(optional = false)
    @NotNull
    @Column(name = "datePret", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date datePret;
    
    @Column(name = "dateRestitution")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateRestitution;
    
    @JoinColumn(name = "materiel", referencedColumnName = "materiel", nullable = false, insertable = false, updatable = false,
        	foreignKey = @ForeignKey(name="FK_un_materiel_est_prete_a_un_stagiaire")
    )
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Materiel materiel;
    
    @JoinColumn(name = "stagiaire", referencedColumnName = "stagiaire", nullable = false, insertable = false, updatable = false,
        	foreignKey = @ForeignKey(name="FK_un_stagiaire_realise_un_emprunt_de_materiel")
    )
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Stagiaire stagiaire;

    public MaterielStagiaire() {
    }

    public MaterielStagiaire(MaterielStagiairePK materielStagiairePK) {
        this.materielStagiairePK = materielStagiairePK;
    }

    public MaterielStagiaire(MaterielStagiairePK materielStagiairePK, boolean cautionRendue, Date datePret) {
        this.materielStagiairePK = materielStagiairePK;
        this.cautionRendue = cautionRendue;
        this.datePret = datePret;
    }

    public MaterielStagiaire(long materiel, long stagiaire) {
        this.materielStagiairePK = new MaterielStagiairePK(materiel, stagiaire);
    }

    public MaterielStagiairePK getMaterielStagiairePK() {
        return this.materielStagiairePK;
    }

    public void setMaterielStagiairePK(MaterielStagiairePK materielStagiairePK) {
        this.materielStagiairePK = materielStagiairePK;
    }

    public BigDecimal getCaution() {
        return this.caution;
    }

    public void setCaution(BigDecimal caution) {
        this.caution = caution;
    }

    public boolean getCautionRendue() {
        return this.cautionRendue;
    }

    public void setCautionRendue(boolean cautionRendue) {
        this.cautionRendue = cautionRendue;
    }

    public String getCommentairePret() {
        return this.commentairePret;
    }

    public void setCommentairePret(String commentairePret) {
        this.commentairePret = commentairePret;
    }

    public String getCommentaireRestitution() {
        return this.commentaireRestitution;
    }

    public void setCommentaireRestitution(String commentaireRestitution) {
        this.commentaireRestitution = commentaireRestitution;
    }

    public Date getDatePret() {
        return this.datePret;
    }

    public void setDatePret(Date datePret) {
        this.datePret = datePret;
    }

    public Date getDateRestitution() {
        return this.dateRestitution;
    }

    public void setDateRestitution(Date dateRestitution) {
        this.dateRestitution = dateRestitution;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (this.materielStagiairePK != null ? this.materielStagiairePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof MaterielStagiaire)) {
            return false;
        }
        MaterielStagiaire other = (MaterielStagiaire) object;
        if ((this.materielStagiairePK == null && other.materielStagiairePK != null) || (this.materielStagiairePK != null && !this.materielStagiairePK.equals(other.materielStagiairePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return this.getClass().getCanonicalName() + "[ materielStagiairePK=" + this.materielStagiairePK + " ]";
    }
    
}
