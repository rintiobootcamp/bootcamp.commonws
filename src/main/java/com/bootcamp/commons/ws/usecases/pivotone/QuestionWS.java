package com.bootcamp.commons.ws.usecases.pivotone;

import java.util.List;

/**
 * Created by darextossa on 12/2/17.
 */
public class QuestionWS {

    private int id;
    private int entityId;
    private String entityType;

    /**
     * Get the entity type on which the question is asked
     *
     * @return the entity type
     */
    public String getEntityType() {
        return entityType;
    }

    /**
     * Set the entity type on which the question is asked
     *
     * @param entityType the entity type to set
     */
    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }
    private String sujet;
    private long dateCreationQuestion;
    private long dateMiseAJourQuestion;
    private List<TypeReponseWS> reponsesType;

    /**
     * Get the question id
     *
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * Set the question id
     *
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Get the entity id on which the question is asked
     *
     * @return the entity id
     */
    public int getEntityId() {
        return entityId;
    }

    /**
     * Set the entity id on which the question is asked
     *
     * @param entityId the entity to set
     */
    public void setEntityId(int entityId) {
        this.entityId = entityId;
    }

    /**
     * Get the subject of the question
     *
     * @return the subject
     */
    public String getSujet() {
        return sujet;
    }

    /**
     * Set the subject of the question
     *
     * @param sujet the subject to set
     */
    public void setSujet(String sujet) {
        this.sujet = sujet;
    }

    /**
     * Get the question creation date
     *
     * @return the creation date
     */
    public long getDateCreationQuestion() {
        return dateCreationQuestion;
    }

    /**
     * Set the question creation date
     *
     * @param dateCreationQuestion the date to set
     */
    public void setDateCreationQuestion(long dateCreationQuestion) {
        this.dateCreationQuestion = dateCreationQuestion;
    }

    /**
     * Get the question update date
     *
     * @return the update date
     */
    public long getDateMiseAJourQuestion() {
        return dateMiseAJourQuestion;
    }

    /**
     * Set the question update date
     *
     * @param dateMiseAJourQuestion the date to set
     */
    public void setDateMiseAJourQuestion(long dateMiseAJourQuestion) {
        this.dateMiseAJourQuestion = dateMiseAJourQuestion;
    }

    /**
     * Get the question responses choices
     *
     * @return the responses choices
     */
    public List<TypeReponseWS> getReponsesType() {
        return reponsesType;
    }

    /**
     * Set the question responses choices
     *
     * @param reponsesType the responses choices to set
     */
    public void setReponsesType(List<TypeReponseWS> reponsesType) {
        this.reponsesType = reponsesType;
    }

}
