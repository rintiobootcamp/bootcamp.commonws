/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bootcamp.commons.ws.usecases.pivottwo;

/**
 *
 * @author Bello
 */
public class AxeUWS {
    private int id;
    private String nom;
    private String description;
    private String titre;
    private String titreFocus;
    private String descriptionFocus;
    private long dateCreation;
    private long dateMiseAJour;
    private PilierUWS pilier;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getTitreFocus() {
        return titreFocus;
    }

    public void setTitreFocus(String titreFocus) {
        this.titreFocus = titreFocus;
    }

    public String getDescriptionFocus() {
        return descriptionFocus;
    }

    public void setDescriptionFocus(String descriptionFocus) {
        this.descriptionFocus = descriptionFocus;
    }

    public long getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(long dateCreation) {
        this.dateCreation = dateCreation;
    }

    public long getDateMiseAJour() {
        return dateMiseAJour;
    }

    public void setDateMiseAJour(long dateMiseAJour) {
        this.dateMiseAJour = dateMiseAJour;
    }

    public PilierUWS getPilier() {
        return pilier;
    }

    public void setPilier(PilierUWS pilier) {
        this.pilier = pilier;
    }
}
