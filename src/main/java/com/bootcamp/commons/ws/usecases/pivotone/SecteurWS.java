/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bootcamp.commons.ws.usecases.pivotone;

import com.bootcamp.entities.Media;

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
    private List<Media> medias;
    private LikeWS likeWS;
    private NoteWS noteWS;

    /**
     * Get the number of likes and unlikes on the sector
     *
     * @return likeWS
     */
    public LikeWS getLikeWS() {
        return likeWS;
    }

    /**
     * Set the number of likes and unlikes on the sector
     *
     * @param likeWS
     */
    public void setLikeWS(LikeWS likeWS) {
        this.likeWS = likeWS;
    }

    /**
     * Get the average notes on the sector
     *
     * @return noteWS
     */
    public NoteWS getNoteWS() {
        return noteWS;
    }

    /**
     * Set the average notes on the sector
     *
     * @param noteWS
     */
    public void setNoteWS(NoteWS noteWS) {
        this.noteWS = noteWS;
    }

    /**
     * Get the sector id
     *
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * Set the sector id
     *
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Get the sector name
     *
     * @return the name
     */
    public String getNom() {
        return nom;
    }

    /**
     * Set the sector name
     *
     * @param nom the name to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Get the sector description
     *
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Get the sector description
     *
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Get the sector icon path
     *
     * @return the icon path
     */
    public String getIcone() {
        return icone;
    }

    /**
     * Set the sector icon
     *
     * @param icone the path if the icon to set
     */
    public void setIcone(String icone) {
        this.icone = icone;
    }

    /**
     * Get the sector creation date
     *
     * @return the creation date
     */
    public long getDateCreation() {
        return dateCreation;
    }

    /**
     * Set the sector creation date
     *
     * @param dateCreation the date to set
     */
    public void setDateCreation(long dateCreation) {
        this.dateCreation = dateCreation;
    }

    /**
     * Get the sector update date
     *
     * @return the update date
     */
    public long getDateMiseAJour() {
        return dateMiseAJour;
    }

    /**
     * Set the sector creation date
     *
     * @param dateMiseAJour the date to set
     */
    public void setDateMiseAJour(long dateMiseAJour) {
        this.dateMiseAJour = dateMiseAJour;
    }

    /**
     * Get all the projects related to this sector
     *
     * @return the projects list
     */
    public List<ProjetWS> getProjets() {
        return projets;
    }

    /**
     * Set all the projects related to this sector
     *
     * @param projets the projects list to set
     */
    public void setProjets(List<ProjetWS> projets) {
        this.projets = projets;
    }

    /**
     * Get the axe related to this sector
     *
     * @return axe
     */
    public HashMap<String, Object> getAxe() {
        return axe;
    }

    /**
     * Set the axe related to this sector
     *
     * @param axe
     */
    public void setAxe(HashMap<String, Object> axe) {
        this.axe = axe;
    }

    /**
     * Get the sector medias list
     *
     * @return the medias
     */
    public List<Media> getMedias() {
        return medias;
    }

    /**
     * Set the sector medias list
     *
     * @param medias the medias to set
     */
    public void setMedias(List<Media> medias) {
        this.medias = medias;
    }
}
