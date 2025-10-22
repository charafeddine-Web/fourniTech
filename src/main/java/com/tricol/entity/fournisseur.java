package com.tricol.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class fournisseur {

    public fournisseur() {}

    @Id
    private int id;

    @Column(unique=true)
    private String ICE;

    private String societe;

    private String adresse;

    private String telephone;

    @Column(unique = true)
    private String email;

    private String ville;

    private String Contact;


    public fournisseur(String ICE,String societe,String adresse,String telephone,String email,String ville,String Contact) {
        this.ICE = ICE;
        this.societe = societe;
        this.adresse = adresse;
        this.telephone = telephone;
        this.email = email;
        this.ville = ville;
        this.Contact = Contact;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getICE() {
        return ICE;
    }

    public void setICE(String ICE) {
        this.ICE = ICE;
    }

    public String getSociete() {
        return societe;
    }

    public void setSociete(String societe) {
        this.societe = societe;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getContact() {
        return Contact;
    }

    public void setContact(String contact) {
        Contact = contact;
    }
}
