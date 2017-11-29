package com.bootcamp.commons.ws.models;

import com.bootcamp.entities.Projet;

/**
 * Created by darextossa on 11/27/17.
 */
public class ProjetWs {

    private Projet data;
    private Error error;

    public Projet getData() {
        return data;
    }

    public void setData(Projet data) {
        this.data = data;
    }

    public Error getError() {
        return error;
    }

    public void setError(Error error) {
        this.error = error;
    }
}
