package com.bootcamp.commons.ws.models;

public class ProjetUWs {
    private int id;
    private String nom;
    private String reference;
    private String description;
    private PhaseUWs phaseActuelle;
    private Long dateDebutReel;
    private Long dateFinReel;
    private Long dateDebutPrevisionnel;
    private Long dateFinPrevisionnel;
    private double budgetPrevisionnel;
    private double budgetReel;
    private double coutReel;

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

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public PhaseUWs getPhaseActuelle() {
        return phaseActuelle;
    }

    public void setPhaseActuelle(PhaseUWs phaseActuelle) {
        this.phaseActuelle = phaseActuelle;
    }

    public Long getDateDebutReel() {
        return dateDebutReel;
    }

    public void setDateDebutReel(Long dateDebutReel) {
        this.dateDebutReel = dateDebutReel;
    }

    public Long getDateFinReel() {
        return dateFinReel;
    }

    public void setDateFinReel(Long dateFinReel) {
        this.dateFinReel = dateFinReel;
    }

    public Long getDateDebutPrevisionnel() {
        return dateDebutPrevisionnel;
    }

    public void setDateDebutPrevisionnel(Long dateDebutPrevisionnel) {
        this.dateDebutPrevisionnel = dateDebutPrevisionnel;
    }

    public Long getDateFinPrevisionnel() {
        return dateFinPrevisionnel;
    }

    public void setDateFinPrevisionnel(Long dateFinPrevisionnel) {
        this.dateFinPrevisionnel = dateFinPrevisionnel;
    }

    public double getBudgetPrevisionnel() {
        return budgetPrevisionnel;
    }

    public void setBudgetPrevisionnel(double budgetPrevisionnel) {
        this.budgetPrevisionnel = budgetPrevisionnel;
    }

    public double getBudgetReel() {
        return budgetReel;
    }

    public void setBudgetReel(double budgetReel) {
        this.budgetReel = budgetReel;
    }

    public double getCoutReel() {
        return coutReel;
    }

    public void setCoutReel(double coutReel) {
        this.coutReel = coutReel;
    }
}
