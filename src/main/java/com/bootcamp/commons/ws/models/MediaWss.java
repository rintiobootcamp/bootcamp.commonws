package com.bootcamp.commons.ws.models;

import com.bootcamp.entities.Axe;
import com.bootcamp.entities.Media;

import java.util.List;

/**
 * Created by darextossa on 11/27/17.
 */
public class MediaWss {

    private List<Media> data;
    private Error error;

    public List<Media> getData() {
        return data;
    }

    public void setData(List<Media> data) {
        this.data = data;
    }

    public Error getError() {
        return error;
    }

    public void setError(Error error) {
        this.error = error;
    }
}
