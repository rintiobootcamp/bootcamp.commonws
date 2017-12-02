/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bootcamp.commons.ws.usecases.pivotone;

import com.bootcamp.entities.Pilier;

import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Bello
 */
public class AxeWS {
    private int id;
    private String nom;
    private String description;
    private String titre;
    private String titreFocus;
    private String descriptionFocus;
    private long dateCreation;
    private long dateMiseAJour;
    private List<SecteurWS> secteurs;
    private HashMap<String, Object> pilier;
    private List<MediaWs> mediaWss;

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

    public long getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(long dateCreation) {
        this.dateCreation = dateCreation;
    }

    public long getDateMiseAJour() {
        return dateMiseAJour;
    }

    public void setDateMiseAJour(long dateMiseAJour) {
        this.dateMiseAJour = dateMiseAJour;
    }

    public List<SecteurWS> getSecteurs() {
        return secteurs;
    }

    public void setSecteurs(List<SecteurWS> secteurs) {
        this.secteurs = secteurs;
    }

    public HashMap<String, Object> getPilier() {
        return pilier;
    }

    public void setPilier(HashMap<String, Object> pilier) {
        this.pilier = pilier;
    }

    public List<MediaWs> getMediaWss() {
        return mediaWss;
    }

    public void setMediaWss(List<MediaWs> mediaWss) {
        this.mediaWss = mediaWss;
    }
}
