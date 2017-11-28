package com.bootcamp.commons.ws.models;


import java.util.List;

public class AxeUWs {
    private int id;
    private String nom;
    private String titre;
    private String titreFocus;
    private String descriptionFocus;
    private String description;
    private Long dateCreation;
    private Long dateMiseAJour;
    private List<MediaUWs> medias;
    private PilierUWs pilier;
    private List<ProjetUWs> projets;
    private List<SecteurUWs> secteurs;
    private int pilierId;

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

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getTitreFocus() {
        return titreFocus;
    }

    public void setTitreFocus(String titreFocus) {
        this.titreFocus = titreFocus;
    }

    public String getDescriptionFocus() {
        return descriptionFocus;
    }

    public void setDescriptionFocus(String descriptionFocus) {
        this.descriptionFocus = descriptionFocus;
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

    public List<MediaUWs> getMedias() {
        return medias;
    }

    public void setMedias(List<MediaUWs> medias) {
        this.medias = medias;
    }

    public PilierUWs getPilier() {
        return pilier;
    }

    public void setPilier(PilierUWs pilier) {
        this.pilier = pilier;
    }

    public List<ProjetUWs> getProjets() {
        return projets;
    }

    public void setProjets(List<ProjetUWs> projets) {
        this.projets = projets;
    }

    public List<SecteurUWs> getSecteurs() {
        return secteurs;
    }

    public void setSecteurs(List<SecteurUWs> secteurs) {
        this.secteurs = secteurs;
    }

    public int getPilierId() {
        return pilierId;
    }

    public void setPilierId(int pilierId) {
        this.pilierId = pilierId;
    }
}
