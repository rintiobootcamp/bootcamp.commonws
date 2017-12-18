/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bootcamp.commons.ws.usecases.pivotone;

/**
 *
 * @author Moh
 */
public class PreferenceWS {

    private int entityId;
    private String entityType;
    private String email;
    private String contact;
    private long dateCreation;

    /**
     * Get the preference entity id
     *
     * @return the entity id
     */
    public int getEntityId() {
        return entityId;
    }

    /**
     * Set the preference entity id
     *
     * @param entityId the entity id to set
     */
    public void setEntityId(int entityId) {
        this.entityId = entityId;
    }

    /**
     * Get the preference entity type
     *
     * @return the entity type
     */
    public String getEntityType() {
        return entityType;
    }

    /**
     * Set the preference entity type
     *
     * @param entityType the entity type to set
     */
    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }

    /**
     * Get the user mail
     *
     * @return the mail
     */
    public String getEmail() {
        return email;
    }

    /**
     * Set the user mail
     *
     * @param email the mail to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Get the user phone number
     *
     * @return the phone number
     */
    public String getContact() {
        return contact;
    }

    /**
     * Set the user phone number
     *
     * @param contact the phone number to set
     */
    public void setContact(String contact) {
        this.contact = contact;
    }

    /**
     * Get the preference creation date
     *
     * @return the creation date
     */
    public long getDateCreation() {
        return dateCreation;
    }

    /**
     * Get the preference creation date
     *
     * @param dateCreation the date to set
     */
    public void setDateCreation(long dateCreation) {
        this.dateCreation = dateCreation;
    }
}
