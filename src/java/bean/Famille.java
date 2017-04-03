/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;

/**
 *
 * @author Lidrissi Hamid
 */
@Entity
public class Famille implements Serializable {

    //la famille est  considerer  come  voeuve 
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomFamille;//ca serai la cle  primarie , c'est un index de recherche 
    private String prenomPere;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateDecesPere;
    private String proffesionPere;
    private String prenomMere;
    private String nomMere;
    private Date dateNaissance;
    private String cinMere;
    private String proffesionMere;
    private String adresse;
    private String tel;

    private int nbrBenificiaires;

    //les infos de residence 
    private String type;
    private String propriete;
    private String proprieteEau;
    private Double prixMensuelEau;
    private String proprieteElectricite;
    private Double prixMensuelElecricite;
    private String typeAsainissement;

    private String typeParinnage;

    @OneToMany(mappedBy = "famille")
    private List<Benificiaire> benificiaires;

    public Famille() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomFamille() {
        return nomFamille;
    }

    public void setNomFamille(String nomFamille) {
        this.nomFamille = nomFamille;
    }

    public String getPrenomPere() {
        return prenomPere;
    }

    public void setPrenomPere(String prenomPere) {
        this.prenomPere = prenomPere;
    }

    public Date getDateDecesPere() {
        return dateDecesPere;
    }

    public void setDateDecesPere(Date dateDecesPere) {
        this.dateDecesPere = dateDecesPere;
    }

    public String getProffesionPere() {
        return proffesionPere;
    }

    public void setProffesionPere(String proffesionPere) {
        this.proffesionPere = proffesionPere;
    }

    public List<Benificiaire> getBenificiaires() {
        if (benificiaires == null) {
            benificiaires = new ArrayList<>();
        }
        return benificiaires;
    }

    public void setBenificiaires(List<Benificiaire> benificiaires) {
        this.benificiaires = benificiaires;
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
        if (!(object instanceof Famille)) {
            return false;
        }
        Famille other = (Famille) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "famille{" + "id=" + id + ", nomFamille=" + nomFamille + ", prenomPere=" + prenomPere + ", dateDecesPere=" + dateDecesPere + ", proffesionPere=" + proffesionPere + '}';
    }

}
