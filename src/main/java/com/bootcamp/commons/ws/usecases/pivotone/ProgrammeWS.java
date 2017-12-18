/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bootcamp.commons.ws.usecases.pivotone;

import com.bootcamp.entities.Projet;

import java.util.List;

/**
 *
 * @author Moh
 */
public class ProgrammeWS {

    private List<Projet> projetList;
    private double budgetGlobal;
    private String nom;
    private long dateCreation;
    private long dateFin;

    /**
     * Get the projects related to this program
     *
     * @return the projects list
     */
    public List<Projet> getProjetList() {
        return projetList;
    }

    /**
     * Set the projects related to this program
     *
     * @param projetList the projects list to set
     */
    public void setProjetList(List<Projet> projetList) {
        this.projetList = projetList;
    }

    /**
     * Get the program global funds
     *
     * @return the global funds
     */
    public double getBudgetGlobal() {
        return budgetGlobal;
    }

    /**
     * Set the program global funds
     *
     * @param budgetGlobal the funds to set
     */
    public void setBudgetGlobal(double budgetGlobal) {
        this.budgetGlobal = budgetGlobal;
    }

    /**
     * Get the program name
     *
     * @return the name
     */
    public String getNom() {
        return nom;
    }

    /**
     * Set the program name
     *
     * @param nom the name to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Get the program started date
     *
     * @return the started date
     */
    public long getDateCreation() {
        return dateCreation;
    }

    /**
     * Set the program started date
     *
     * @param dateCreation he date to set
     */
    public void setDateCreation(long dateCreation) {
        this.dateCreation = dateCreation;
    }

    /**
     * Get the program ended date
     *
     * @return the ended date
     */
    public long getDateFin() {
        return dateFin;
    }

    /**
     * Set the program ended date
     *
     * @param dateFin the date to set
     */
    public void setDateFin(long dateFin) {
        this.dateFin = dateFin;
    }
}
