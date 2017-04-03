/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author Lidrissi Hamid
 */
@Entity
public class ScolarisationBenificiaire implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String typeScolarisation;
    private String niveauScolaire;
    private int numeroScolaire;
    private int annee;
    private String etablissment;
    private String cne;

    private Double resultatS1;
    private Double resultatS2;
    private Double moyenne;
    private String descision;

    private Boolean isbourcier;
    private Double primeBource;
    
    private Boolean benificiaireSoutienScolaire;

    
    @OneToOne(mappedBy = "scolarisationBenificiaire")
    private Benificiaire benificiaire;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTypeScolarisation() {
        return typeScolarisation;
    }

    public void setTypeScolarisation(String typeScolarisation) {
        this.typeScolarisation = typeScolarisation;
    }

    public Double getResultatS1() {
        return resultatS1;
    }

    public void setResultatS1(Double resultatS1) {
        this.resultatS1 = resultatS1;
    }

    public Double getResultatS2() {
        return resultatS2;
    }

    public void setResultatS2(Double resultatS2) {
        this.resultatS2 = resultatS2;
    }

    public Double getMoyenne() {
        return moyenne;
    }

    public void setMoyenne(Double moyenne) {
        this.moyenne = moyenne;
    }

    public Boolean getIsbourcier() {
        return isbourcier;
    }

    public void setIsbourcier(Boolean isbourcier) {
        this.isbourcier = isbourcier;
    }

    public Double getPrimeBource() {
        return primeBource;
    }

    public void setPrimeBource(Double primeBource) {
        this.primeBource = primeBource;
    }

    public Benificiaire getBenificiaire() {
        if (benificiaire == null) {
            benificiaire = new Benificiaire();
        }
        return benificiaire;
    }

    public void setBenificiaire(Benificiaire benificiaire) {
        this.benificiaire = benificiaire;
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
        if (!(object instanceof ScolarisationBenificiaire)) {
            return false;
        }
        ScolarisationBenificiaire other = (ScolarisationBenificiaire) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

}
