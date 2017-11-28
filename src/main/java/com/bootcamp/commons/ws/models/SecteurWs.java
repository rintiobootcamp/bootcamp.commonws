package com.bootcamp.commons.ws.models;

import com.bootcamp.entities.Secteur;

/**
 * Created by darextossa on 11/27/17.
 */
public class SecteurWs {

    private Secteur data;
    private Error error;

    public Secteur getData() {
        return data;
    }

    public void setData(Secteur data) {
        this.data = data;
    }

    public Error getError() {
        return error;
    }

    public void setError(Error error) {
        this.error = error;
    }
}
