package com.bootcamp.commons.ws.usecases.pivotone;

/**
 * Created by darextossa on 12/2/17.
 */
public class MediaWs {

    private int id;
    private String lien;
    private String nom;
    private String type;

    /**
     * Get the media id
     *
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * Set the media id
     *
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Get the media link
     *
     * @return the link
     */
    public String getLien() {
        return lien;
    }

    /**
     * Set the media link
     *
     * @param lien the link to set
     */
    public void setLien(String lien) {
        this.lien = lien;
    }

    /**
     * Get the media name
     *
     * @return the name
     */
    public String getNom() {
        return nom;
    }

    /**
     * Set the media name
     *
     * @param nom the name to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Get the media type
     *
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * Set the media type
     *
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }
}
