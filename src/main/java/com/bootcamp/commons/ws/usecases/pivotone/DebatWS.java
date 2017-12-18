package com.bootcamp.commons.ws.usecases.pivotone;

/**
 * Created by darextossa on 12/2/17.
 */
public class DebatWS {

    private int id;
    private String entityType;
    private String sujet;
    private long dateCreation;
    private long dateModification;

    /**
     * Get the debate id
     *
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * Set the debate id
     *
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Get the debate entity type
     *
     * @return the entity type
     */
    public String getEntityType() {
        return entityType;
    }

    /**
     * Set the debate entity type
     *
     * @param entityType the entity type to set
     */
    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }

    /**
     * Get the debate subject
     *
     * @return the subject
     */
    public String getSujet() {
        return sujet;
    }

    /**
     * Set the debate subject
     *
     * @param sujet the subject to set
     */
    public void setSujet(String sujet) {
        this.sujet = sujet;
    }

    /**
     * Get the debate creation date
     *
     * @return the creation date
     */
    public long getDateCreation() {
        return dateCreation;
    }

    /**
     * Set the debate creation date
     *
     * @param dateCreation the date to set
     */
    public void setDateCreation(long dateCreation) {
        this.dateCreation = dateCreation;
    }

    /**
     * Get the debate update date
     *
     * @return the update date
     */
    public long getDateModification() {
        return dateModification;
    }

    /**
     * Set the debate update date
     *
     * @param dateModification the date to set
     */
    public void setDateModification(long dateModification) {
        this.dateModification = dateModification;
    }

}
