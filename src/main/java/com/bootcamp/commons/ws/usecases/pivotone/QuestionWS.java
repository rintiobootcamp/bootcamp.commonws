package com.bootcamp.commons.ws.usecases.pivotone;

import java.util.List;

/**
 * Created by darextossa on 12/2/17.
 */
public class QuestionWS {

    private int id;
    private int entityId;
    private String entityType;

    public String getEntityType() {
        return entityType;
    }

    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }
    private String sujet;
    private long dateCreationQuestion;
    private long dateMiseAJourQuestion;
    private List<TypeReponseWS> reponsesType;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEntityId() {
        return entityId;
    }

    public void setEntityId(int entityId) {
        this.entityId = entityId;
    }

    public String getSujet() {
        return sujet;
    }

    public void setSujet(String sujet) {
        this.sujet = sujet;
    }

    public long getDateCreationQuestion() {
        return dateCreationQuestion;
    }

    public void setDateCreationQuestion(long dateCreationQuestion) {
        this.dateCreationQuestion = dateCreationQuestion;
    }

    public long getDateMiseAJourQuestion() {
        return dateMiseAJourQuestion;
    }

    public void setDateMiseAJourQuestion(long dateMiseAJourQuestion) {
        this.dateMiseAJourQuestion = dateMiseAJourQuestion;
    }

    public List<TypeReponseWS> getReponsesType() {
        return reponsesType;
    }

    public void setReponsesType(List<TypeReponseWS> reponsesType) {
        this.reponsesType = reponsesType;
    }
    

    
}
