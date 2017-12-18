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
public class AxeWS {

    private int id;
    private String nom;
    private String description;
    private String titre;
    private String titreFocus;
    private String descriptionFocus;
    private long dateCreation;
    private long dateMiseAJour;
    private LikeWS likeWS;
    private NoteWS noteWS;
    private List<SecteurWS> secteurs;
    private HashMap<String, Object> pilier;
    private List<Media> medias;

    /**
     * Get the likeWS object
     *
     * @return likeWS
     */
    public LikeWS getLikeWS() {
        return likeWS;
    }

    /**
     * Set the likeWS object
     *
     * @param likeWS
     */
    public void setLikeWS(LikeWS likeWS) {
        this.likeWS = likeWS;
    }

    /**
     * Get the noteWs object
     *
     * @return noteWs
     */
    public NoteWS getNoteWS() {
        return noteWS;
    }

    /**
     * Set the noteWs object
     *
     * @param noteWS
     */
    public void setNoteWS(NoteWS noteWS) {
        this.noteWS = noteWS;
    }

    /**
     * Get the axe id
     *
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * Set the axe id
     *
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Get the axe name
     *
     * @return nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * Set the axe name
     *
     * @param nom
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Get the axe description
     *
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Set the axe description
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Get the axe title
     *
     * @return titre
     */
    public String getTitre() {
        return titre;
    }

    /**
     * Set the axe title
     *
     * @param titre
     */
    public void setTitre(String titre) {
        this.titre = titre;
    }

    /**
     * Get the axe focus title
     *
     * @return titreFocus
     */
    public String getTitreFocus() {
        return titreFocus;
    }

    /**
     * Set the axe focus title
     *
     * @param titreFocus
     */
    public void setTitreFocus(String titreFocus) {
        this.titreFocus = titreFocus;
    }

    /**
     * Get the axe focus description
     *
     * @return descriptionFocus
     */
    public String getDescriptionFocus() {
        return descriptionFocus;
    }

    /**
     * Set the axe focus description
     *
     * @param descriptionFocus
     */
    public void setDescriptionFocus(String descriptionFocus) {
        this.descriptionFocus = descriptionFocus;
    }

    /**
     * Get the axe creation date
     *
     * @return dateCreation
     */
    public long getDateCreation() {
        return dateCreation;
    }

    /**
     * Set the axe creation date
     *
     * @param dateCreation
     */
    public void setDateCreation(long dateCreation) {
        this.dateCreation = dateCreation;
    }

    /**
     * Get the axe update date
     *
     * @return dateMiseAJour
     */
    public long getDateMiseAJour() {
        return dateMiseAJour;
    }

    /**
     * Set the axe update date
     *
     * @param dateMiseAJour
     */
    public void setDateMiseAJour(long dateMiseAJour) {
        this.dateMiseAJour = dateMiseAJour;
    }

    /**
     * Get all the axe sectors
     *
     * @return secteurs
     */
    public List<SecteurWS> getSecteurs() {
        return secteurs;
    }

    /**
     * Set all the axe sectors
     *
     * @param secteurs
     */
    public void setSecteurs(List<SecteurWS> secteurs) {
        this.secteurs = secteurs;
    }

    /**
     * Get the axe pillar
     *
     * @return pilier
     */
    public HashMap<String, Object> getPilier() {
        return pilier;
    }

    /**
     * Set the axe pillar
     *
     * @param pilier
     */
    public void setPilier(HashMap<String, Object> pilier) {
        this.pilier = pilier;
    }

    /**
     * Get all the axe medias
     *
     * @return medias
     */
    public List<Media> getMedias() {
        return medias;
    }

    /**
     * Set all the axe medias
     *
     * @param medias
     */
    public void setMedias(List<Media> medias) {
        this.medias = medias;
    }
}
