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

    public LikeWS getLikeWS() {
        return likeWS;
    }

    public void setLikeWS(LikeWS likeWS) {
        this.likeWS = likeWS;
    }

    public NoteWS getNoteWS() {
        return noteWS;
    }

    public void setNoteWS(NoteWS noteWS) {
        this.noteWS = noteWS;
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

    public List<AxeWS> getAxes() {
        return axes;
    }

    public void setAxes(List<AxeWS> axes) {
        this.axes = axes;
    }

    public List<Media> getMedias() {
        return medias;
    }

    public void setMedias(List<Media> medias) {
        this.medias = medias;
    }
}