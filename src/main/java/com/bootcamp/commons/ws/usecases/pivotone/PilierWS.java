/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bootcamp.commons.ws.usecases.pivotone;

import com.bootcamp.entities.Media;

import java.util.List;

/**
 *
 * @author Bello
 */
public class PilierWS {

    private int id;
    private String nom;
    private String description;
    private long dateCreation;
    private long dateMiseAJour;
    private List<AxeWS> axes;
    private List<Media> medias;
    private LikeWS likeWS;
    private NoteWS noteWS;

    /**
     * Get the number of likes and unlikes on the pillar
     *
     * @return likeWS
     */
    public LikeWS getLikeWS() {
        return likeWS;
    }

    /**
     * Set the number of likes and unlikes on the pillar
     *
     * @param likeWS
     */
    public void setLikeWS(LikeWS likeWS) {
        this.likeWS = likeWS;
    }

    /**
     * Get the average notes on the pillar
     *
     * @return noteWS
     */
    public NoteWS getNoteWS() {
        return noteWS;
    }

    /**
     * Set the average notes on the pillar
     *
     * @param noteWS
     */
    public void setNoteWS(NoteWS noteWS) {
        this.noteWS = noteWS;
    }

    /**
     * Get the pillar id
     *
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * Set the pillar id
     *
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Get the pillar name
     *
     * @return the name
     */
    public String getNom() {
        return nom;
    }

    /**
     * Set the pillar name
     *
     * @param nom the name to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Get the pillar description
     *
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Set the pillar description
     *
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Get the pillar creation date
     *
     * @return the creation date
     */
    public long getDateCreation() {
        return dateCreation;
    }

    /**
     * Set the pillar creation date
     *
     * @param dateCreation the date to set
     */
    public void setDateCreation(long dateCreation) {
        this.dateCreation = dateCreation;
    }

    /**
     * Get the pillar update date
     *
     * @return the update date
     */
    public long getDateMiseAJour() {
        return dateMiseAJour;
    }

    /**
     * Set the pillar update date
     *
     * @param dateMiseAJour the date to set
     */
    public void setDateMiseAJour(long dateMiseAJour) {
        this.dateMiseAJour = dateMiseAJour;
    }

    /**
     * Get the pillar axes list
     *
     * @return the axes
     */
    public List<AxeWS> getAxes() {
        return axes;
    }

    /**
     * Set the pillar axes list
     *
     * @param axes the axes to set
     */
    public void setAxes(List<AxeWS> axes) {
        this.axes = axes;
    }

    /**
     * Get the pillar medias list
     *
     * @return the medias
     */
    public List<Media> getMedias() {
        return medias;
    }

    /**
     * Set the pillar medias list
     *
     * @param medias the medias to set
     */
    public void setMedias(List<Media> medias) {
        this.medias = medias;
    }
}
