package com.bootcamp.commons.ws.models;

import com.bootcamp.entities.Axe;

import java.util.List;

/**
 * Created by darextossa on 11/27/17.
 */
public class AxeWss {

    private List<Axe> data;
    private Error error;

    public List<Axe> getData() {
        return data;
    }

    public void setData(List<Axe> data) {
        this.data = data;
    }

    public Error getError() {
        return error;
    }

    public void setError(Error error) {
        this.error = error;
    }
}
