package com.bootcamp.commons.ws.models;

import com.bootcamp.entities.Pilier;

/**
 * Created by darextossa on 11/27/17.
 */
public class PilierWs {
    private Pilier data;
    private Error error;

    public Pilier getData() {
        return data;
    }

    public void setData(Pilier data) {
        this.data = data;
    }

    public Error getError() {
        return error;
    }

    public void setError(Error error) {
        this.error = error;
    }
}
