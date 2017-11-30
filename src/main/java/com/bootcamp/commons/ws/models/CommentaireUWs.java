package com.bootcamp.commons.ws.models;

import com.bootcamp.commons.enums.EntityType;

public class CommentaireUWs {
    private int id;
    private EntityType entityType;
    private int entityId;
    private String contenu;
    private long dateCreation;
    private long dateMiseAJour;
    private String pseudo;
    private int userId;
    private String userMail;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the entityType
     */
    public EntityType getEntityType() {
        return entityType;
    }

    /**
     * @param entityType the entityType to set
     */
    public void setEntityType(EntityType entityType) {
        this.entityType = entityType;
    }

    /**
     * @return the entityId
     */
    public int getEntityId() {
        return entityId;
    }

    /**
     * @param entityId the entityId to set
     */
    public void setEntityId(int entityId) {
        this.entityId = entityId;
    }

    /**
     * @return the contenu
     */
    public String getContenu() {
        return contenu;
    }

    /**
     * @param contenu the contenu to set
     */
    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    /**
     * @return the dateCreation
     */
    public long getDateCreation() {
        return dateCreation;
    }

    /**
     * @param dateCreation the dateCreation to set
     */
    public void setDateCreation(long dateCreation) {
        this.dateCreation = dateCreation;
    }

    /**
     * @return the dateMiseAJour
     */
    public long getDateMiseAJour() {
        return dateMiseAJour;
    }

    /**
     * @param dateMiseAJour the dateMiseAJour to set
     */
    public void setDateMiseAJour(long dateMiseAJour) {
        this.dateMiseAJour = dateMiseAJour;
    }

    /**
     * @return the pseudo
     */
    public String getPseudo() {
        return pseudo;
    }

    /**
     * @param pseudo the pseudo to set
     */
    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    /**
     * @return the userId
     */
    public int getUserId() {
        return userId;
    }

    /**
     * @param userId the userId to set
     */
    public void setUserId(int userId) {
        this.userId = userId;
    }

    /**
     * @return the userMail
     */
    public String getUserMail() {
        return userMail;
    }

    /**
     * @param userMail the userMail to set
     */
    public void setUserMail(String userMail) {
        this.userMail = userMail;
    }

    
}
