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
public class PilierUWS {

    private int id;
    private String nom;
    private String description;
    private long dateCreation;
    private long dateMiseAJour;

    /**
     * Get the pillar id
     *
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * Set the pillar id
     *
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Get the pillar name
     *
     * @return the name
     */
    public String getNom() {
        return nom;
    }

    /**
     * Set the pillar name
     *
     * @param nom the name to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Get the pillar description
     *
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Set the pillar description
     *
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Get the pillar creation date
     *
     * @return the creation date
     */
    public long getDateCreation() {
        return dateCreation;
    }

    /**
     * Set the pillar creation date
     *
     * @param dateCreation the date to set
     */
    public void setDateCreation(long dateCreation) {
        this.dateCreation = dateCreation;
    }

    /**
     * Get the pillar update date
     *
     * @return the update date
     */
    public long getDateMiseAJour() {
        return dateMiseAJour;
    }

    /**
     * Set the pillar update date
     *
     * @param dateMiseAJour the date to set
     */
    public void setDateMiseAJour(long dateMiseAJour) {
        this.dateMiseAJour = dateMiseAJour;
    }
}
