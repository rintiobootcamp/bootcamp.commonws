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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEntityType() {
        return entityType;
    }

    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }

    public String getSujet() {
        return sujet;
    }

    public void setSujet(String sujet) {
        this.sujet = sujet;
    }

    public long getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(long dateCreation) {
        this.dateCreation = dateCreation;
    }

    public long getDateModification() {
        return dateModification;
    }

    public void setDateModification(long dateModification) {
        this.dateModification = dateModification;
    }

    
}
