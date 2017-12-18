/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bootcamp.commons.ws.usecases.pivotone;

/**
 *
 * @author Bello
 */
public class PhaseWS {

    private int id;
    private String nom;
    private long dateDebut;
    private long dateFin;
    private boolean actif;

    /**
     * Get the step id
     *
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * Set the step id
     *
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Get the step name
     *
     * @return the name
     */
    public String getNom() {
        return nom;
    }

    /**
     * Set the step name
     *
     * @param nom the name to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Set the step started date
     *
     * @return the started date
     */
    public long getDateDebut() {
        return dateDebut;
    }

    /**
     * Set the step started date
     *
     * @param dateDebut the date to set
     */
    public void setDateDebut(long dateDebut) {
        this.dateDebut = dateDebut;
    }

    /**
     * Get the step ended date
     *
     * @return the ended date
     */
    public long getDateFin() {
        return dateFin;
    }

    /**
     * Set the step ended date
     *
     * @param dateFin the date to set
     */
    public void setDateFin(long dateFin) {
        this.dateFin = dateFin;
    }

    /**
     * Check if the step is enable
     *
     * @return
     */
    public boolean isActif() {
        return actif;
    }

    /**
     * Enable or disable the step
     *
     * @param actif
     */
    public void setActif(boolean actif) {
        this.actif = actif;
    }
}
