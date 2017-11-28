package com.bootcamp.commons.ws.models;

import com.bootcamp.entities.Secteur;

import java.util.List;

/**
 * Created by darextossa on 11/27/17.
 */
public class SecteurWss {

    private List<Secteur> data;
    private Error error;

    public List<Secteur> getData() {
        return data;
    }

    public void setData(List<Secteur> data) {
        this.data = data;
    }

    public Error getError() {
        return error;
    }

    public void setError(Error error) {
        this.error = error;
    }
}
