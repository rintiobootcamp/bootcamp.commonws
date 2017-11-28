package com.bootcamp.commons.ws.models;

import com.bootcamp.entities.Pilier;

import java.util.List;

/**
 * Created by darextossa on 11/27/17.
 */
public class PilierWss {

    private List<Pilier> data;
    private Error error;

    public List<Pilier> getData() {
        return data;
    }

    public void setData(List<Pilier> data) {
        this.data = data;
    }

    public Error getError() {
        return error;
    }

    public void setError(Error error) {
        this.error = error;
    }
}
