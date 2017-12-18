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

    /**
     * Get the axe id
     *
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * Set the axe id
     *
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Get the axe name
     *
     * @return nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * Set the axe name
     *
     * @param nom
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Get the axe description
     *
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Set the axe description
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Get the axe title
     *
     * @return titre
     */
    public String getTitre() {
        return titre;
    }

    /**
     * Set the axe title
     *
     * @param titre
     */
    public void setTitre(String titre) {
        this.titre = titre;
    }

    /**
     * Get the axe focus title
     *
     * @return titreFocus
     */
    public String getTitreFocus() {
        return titreFocus;
    }

    /**
     * Set the axe focus title
     *
     * @param titreFocus
     */
    public void setTitreFocus(String titreFocus) {
        this.titreFocus = titreFocus;
    }

    /**
     * Get the axe focus description
     *
     * @return descriptionFocus
     */
    public String getDescriptionFocus() {
        return descriptionFocus;
    }

    /**
     * Set the axe focus description
     *
     * @param descriptionFocus
     */
    public void setDescriptionFocus(String descriptionFocus) {
        this.descriptionFocus = descriptionFocus;
    }

    /**
     * Get the axe creation date
     *
     * @return dateCreation
     */
    public long getDateCreation() {
        return dateCreation;
    }

    /**
     * Set the axe creation date
     *
     * @param dateCreation
     */
    public void setDateCreation(long dateCreation) {
        this.dateCreation = dateCreation;
    }

    /**
     * Get the axe update date
     *
     * @return dateMiseAJour
     */
    public long getDateMiseAJour() {
        return dateMiseAJour;
    }

    /**
     * Set the axe update date
     *
     * @param dateMiseAJour
     */
    public void setDateMiseAJour(long dateMiseAJour) {
        this.dateMiseAJour = dateMiseAJour;
    }

    /**
     * Get the axe pillar
     *
     * @return the pillar
     */
    public PilierUWS getPilier() {
        return pilier;
    }

    /**
     * Set the axe pillar
     *
     * @param pilier
     */
    public void setPilier(PilierUWS pilier) {
        this.pilier = pilier;
    }

}
