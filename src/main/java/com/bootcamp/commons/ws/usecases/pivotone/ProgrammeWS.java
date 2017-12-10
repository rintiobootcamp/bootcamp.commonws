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

    public List<Projet> getProjetList() {
        return projetList;
    }

    public void setProjetList(List<Projet> projetList) {
        this.projetList = projetList;
    }

    public double getBudgetGlobal() {
        return budgetGlobal;
    }

    public void setBudgetGlobal(double budgetGlobal) {
        this.budgetGlobal = budgetGlobal;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public long getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(long dateCreation) {
        this.dateCreation = dateCreation;
    }

    public long getDateFin() {
        return dateFin;
    }

    public void setDateFin(long dateFin) {
        this.dateFin = dateFin;
    }
}
