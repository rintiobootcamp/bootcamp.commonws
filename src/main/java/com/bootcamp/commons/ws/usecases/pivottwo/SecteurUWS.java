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
public class SecteurUWS {

    private int id;
    private String nom;
    private String description;
    private String icone;
    private long dateCreation;
    private long dateMiseAJour;
    private AxeUWS axe;

    /**
     * Get the sector id
     *
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * Set the sector id
     *
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Get the sector name
     *
     * @return the name
     */
    public String getNom() {
        return nom;
    }

    /**
     * Set the sector name
     *
     * @param nom the name to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Get the sector description
     *
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Get the sector description
     *
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Get the sector icon path
     *
     * @return the icon path
     */
    public String getIcone() {
        return icone;
    }

    /**
     * Set the sector icon
     *
     * @param icone the path if the icon to set
     */
    public void setIcone(String icone) {
        this.icone = icone;
    }

    /**
     * Get the sector creation date
     *
     * @return the creation date
     */
    public long getDateCreation() {
        return dateCreation;
    }

    /**
     * Set the sector creation date
     *
     * @param dateCreation the date to set
     */
    public void setDateCreation(long dateCreation) {
        this.dateCreation = dateCreation;
    }

    /**
     * Get the sector update date
     *
     * @return the update date
     */
    public long getDateMiseAJour() {
        return dateMiseAJour;
    }

    /**
     * Set the sector creation date
     *
     * @param dateMiseAJour the date to set
     */
    public void setDateMiseAJour(long dateMiseAJour) {
        this.dateMiseAJour = dateMiseAJour;
    }

    /**
     * Get the axe related to this sector
     *
     * @return the axe
     */
    public AxeUWS getAxe() {
        return axe;
    }

    /**
     * Set the axe related to this sector
     *
     * @param axe the axe to set
     */
    public void setAxe(AxeUWS axe) {
        this.axe = axe;
    }
}
