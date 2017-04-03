/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Lidrissi Hamid
 */
@Entity
public class Ile implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    private int numero;
    private String zone;
    private Utilisateur responsable;
    private List<Famille> familles;

}
