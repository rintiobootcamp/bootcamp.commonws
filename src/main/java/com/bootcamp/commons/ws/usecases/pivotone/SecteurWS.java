/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bootcamp.commons.ws.usecases.pivotone;

import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Bello
 */
public class SecteurWS {
    private int id;
    private String nom;
    private String description;
    private String icone;
    private long dateCreation;
    private long dateMiseAJour;
    private List<ProjetWS> projets;
    private HashMap<String, Object> axe;
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

    public String getIcone() {
        return icone;
    }

    public void setIcone(String icone) {
        this.icone = icone;
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

    public List<ProjetWS> getProjets() {
        return projets;
    }

    public void setProjets(List<ProjetWS> projets) {
        this.projets = projets;
    }

    public HashMap<String, Object> getAxe() {
        return axe;
    }

    public void setAxe(HashMap<String, Object> axe) {
        this.axe = axe;
    }

    public List<MediaWs> getMediaWss() {
        return mediaWss;
    }

    public void setMediaWss(List<MediaWs> mediaWss) {
        this.mediaWss = mediaWss;
    }
}
