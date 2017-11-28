package com.bootcamp.commons.ws.models;

import com.bootcamp.entities.Axe;

/**
 * Created by darextossa on 11/27/17.
 */
public class ProjetWs {

    private Axe data;
    private Error error;

    public Axe getData() {
        return data;
    }

    public void setData(Axe data) {
        this.data = data;
    }

    public Error getError() {
        return error;
    }

    public void setError(Error error) {
        this.error = error;
    }
}
