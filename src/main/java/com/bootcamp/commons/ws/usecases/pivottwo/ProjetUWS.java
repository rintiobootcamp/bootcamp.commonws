/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bootcamp.commons.ws.usecases.pivottwo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Bello
 */
public class ProjetUWS {

    private int id;
    private String nom;
    private String reference;
    private String description;
    private long dateDebutReel;
    private long dateFinReel;
    private long dateDebutPrevisionnel;
    private long dateFinPrevisionnel;
    private double budgetPrevisionnel;
    private double budgetReel;
    private double coutReel;
    private String objectif;
    private List<PhaseUWS> phases;
    private double niveauFinacement;
    private SecteurUWS secteur;
    private List<RegionUWS> regions = new ArrayList<RegionUWS>();

    /**
     * Get the project id
     *
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * Set the project id
     *
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Get the project name
     *
     * @return the name
     */
    public String getNom() {
        return nom;
    }

    /**
     * Set the project name
     *
     * @param nom the name to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     *
     * @return
     */
    public String getReference() {
        return reference;
    }

    /**
     *
     * @param reference
     */
    public void setReference(String reference) {
        this.reference = reference;
    }

    /**
     * Get the project description
     *
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Set the project description
     *
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     *
     * @return
     */
    public long getDateDebutReel() {
        return dateDebutReel;
    }

    /**
     *
     * @param dateDebutReel
     */
    public void setDateDebutReel(long dateDebutReel) {
        this.dateDebutReel = dateDebutReel;
    }

    /**
     *
     * @return
     */
    public long getDateFinReel() {
        return dateFinReel;
    }

    /**
     *
     * @param dateFinReel
     */
    public void setDateFinReel(long dateFinReel) {
        this.dateFinReel = dateFinReel;
    }

    /**
     *
     * @return
     */
    public long getDateDebutPrevisionnel() {
        return dateDebutPrevisionnel;
    }

    /**
     *
     * @param dateDebutPrevisionnel
     */
    public void setDateDebutPrevisionnel(long dateDebutPrevisionnel) {
        this.dateDebutPrevisionnel = dateDebutPrevisionnel;
    }

    /**
     *
     * @return
     */
    public long getDateFinPrevisionnel() {
        return dateFinPrevisionnel;
    }

    /**
     *
     * @param dateFinPrevisionnel
     */
    public void setDateFinPrevisionnel(long dateFinPrevisionnel) {
        this.dateFinPrevisionnel = dateFinPrevisionnel;
    }

    /**
     *
     * @return
     */
    public double getBudgetPrevisionnel() {
        return budgetPrevisionnel;
    }

    /**
     *
     * @param budgetPrevisionnel
     */
    public void setBudgetPrevisionnel(double budgetPrevisionnel) {
        this.budgetPrevisionnel = budgetPrevisionnel;
    }

    /**
     *
     * @return
     */
    public double getBudgetReel() {
        return budgetReel;
    }

    /**
     *
     * @param budgetReel
     */
    public void setBudgetReel(double budgetReel) {
        this.budgetReel = budgetReel;
    }

    /**
     *
     * @return
     */
    public double getCoutReel() {
        return coutReel;
    }

    /**
     *
     * @param coutReel
     */
    public void setCoutReel(double coutReel) {
        this.coutReel = coutReel;
    }

    /**
     *
     * @return
     */
    public String getObjectif() {
        return objectif;
    }

    /**
     *
     * @param objectif
     */
    public void setObjectif(String objectif) {
        this.objectif = objectif;
    }

    /**
     *
     * @return
     */
    public List<PhaseUWS> getPhases() {
        return phases;
    }

    /**
     *
     * @param phases
     */
    public void setPhases(List<PhaseUWS> phases) {
        this.phases = phases;
    }

    /**
     *
     * @return
     */
    public double getNiveauFinacement() {
        return niveauFinacement;
    }

    /**
     *
     * @param niveauFinacement
     */
    public void setNiveauFinacement(double niveauFinacement) {
        this.niveauFinacement = niveauFinacement;
    }

    /**
     *
     * @return
     */
    public SecteurUWS getSecteur() {
        return secteur;
    }

    /**
     *
     * @param secteur
     */
    public void setSecteur(SecteurUWS secteur) {
        this.secteur = secteur;
    }

    /**
     *
     * @return
     */
    public List<RegionUWS> getRegions() {
        return regions;
    }

    /**
     *
     * @param regions
     */
    public void setRegions(List<RegionUWS> regions) {
        this.regions = regions;
    }
}
