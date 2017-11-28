package com.bootcamp.commons.ws.models;

import com.bootcamp.entities.Axe;
import com.bootcamp.entities.Media;

/**
 * Created by darextossa on 11/27/17.
 */
public class MediaWs {

    private Media data;
    private Error error;

    public Media getData() {
        return data;
    }

    public void setData(Media data) {
        this.data = data;
    }

    public Error getError() {
        return error;
    }

    public void setError(Error error) {
        this.error = error;
    }
}
