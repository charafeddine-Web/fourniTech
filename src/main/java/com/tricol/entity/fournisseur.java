package com.tricol.entity;
import jakarta.persistence.Entity;

import javax.persistence.*;

@Entity
@Table(name = "fournisseurs")
public class fournisseur {

    public fournisseur() {}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "ice", unique = true, nullable = false, length = 20)
    private String ice;

    @Column(nullable = false, length = 100)
    private String societe;

    private String adresse;

    @Column(length = 20)
    private String telephone;

    @Column(unique = true, nullable = false)
    private String email;

    private String ville;



    public fournisseur(String ice, String societe, String adresse, String telephone,
                       String email, String ville) {
        this.ice = ice;
        this.societe = societe;
        this.adresse = adresse;
        this.telephone = telephone;
        this.email = email;
        this.ville = ville;
    }

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getIce() { return ice; }
    public void setIce(String ice) { this.ice = ice; }

    public String getSociete() { return societe; }
    public void setSociete(String societe) { this.societe = societe; }

    public String getAdresse() { return adresse; }
    public void setAdresse(String adresse) { this.adresse = adresse; }

    public String getTelephone() { return telephone; }
    public void setTelephone(String telephone) { this.telephone = telephone; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getVille() { return ville; }
    public void setVille(String ville) { this.ville = ville; }


}
