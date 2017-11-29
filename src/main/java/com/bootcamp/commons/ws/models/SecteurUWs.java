package com.bootcamp.commons.ws.models;

import java.util.List;

public class SecteurUWs {
    private int id;
    private String nom;
    private Long dateCreation;
    private Long dateMiseAJour;
    private String icon;
    private List<ProjetUWs> projets;
    private AxeUWs axe;

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
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

    public AxeUWs getAxe() {
        return axe;
    }

    public void setAxe(AxeUWs axe) {
        this.axe = axe;
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

    public List<ProjetUWs> getProjets() {
        return projets;
    }

    public void setProjets(List<ProjetUWs> projets) {
        this.projets = projets;
    }
}
