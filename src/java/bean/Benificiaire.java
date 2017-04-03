/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;

/**
 *
 * @author Lidrissi Hamid
 */
@Entity
public class Benificiaire implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String prenom;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateNaissance;
    private String relationOrphelin;
    private String sexe;

    @ManyToOne
    private Famille famille;

    private Boolean scolariser;
    
    @OneToOne
    private ScolarisationBenificiaire scolarisationBenificiaire;
    @OneToOne
    private MetierBenificiaire metierBenificiaire;

    public Benificiaire() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public Famille getFamille() {
        if (famille == null) {
            famille = new Famille();
        }
        return famille;
    }

    public void setFamille(Famille famille) {
        this.famille = famille;
    }

    public ScolarisationBenificiaire getScolarisationBenificiaire() {
        if (scolarisationBenificiaire == null) {
            scolarisationBenificiaire = new ScolarisationBenificiaire();
        }
        return scolarisationBenificiaire;
    }

    public void setScolarisationBenificiaire(ScolarisationBenificiaire scolarisationBenificiaire) {
        this.scolarisationBenificiaire = scolarisationBenificiaire;
    }

    public MetierBenificiaire getMetierBenificiaire() {
        if (metierBenificiaire == null) {
            metierBenificiaire = new MetierBenificiaire();
        }
        return metierBenificiaire;
    }

    public void setMetierBenificiaire(MetierBenificiaire metierBenificiaire) {
        this.metierBenificiaire = metierBenificiaire;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Benificiaire)) {
            return false;
        }
        Benificiaire other = (Benificiaire) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Benificiaire{" + "id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", dateNaissance=" + dateNaissance + '}';
    }

}
