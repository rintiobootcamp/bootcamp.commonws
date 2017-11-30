package com.bootcamp.commons.ws.models;

import java.util.List;

public class PilierUWs {
    private int id;
    private String nom;
    private String description;
    private Long dateCreation;
    private Long dateMiseAJour;
    private List<ProjetUWs> projets;

    public List<ProjetUWs> getProjets() {
        return projets;
    }

    public void setProjets(List<ProjetUWs> projets) {
        this.projets = projets;
    }

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

    public Long getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Long dateCreation) {
        this.dateCreation = dateCreation;
    }

    public Long getDateMiseAJour() {
        return dateMiseAJour;
    }

    public void setDateMiseAJour(Long dateMiseAJour) {
        this.dateMiseAJour = dateMiseAJour;
    }
}
