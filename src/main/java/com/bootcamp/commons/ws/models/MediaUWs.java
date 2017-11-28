package com.bootcamp.commons.ws.models;

import com.bootcamp.commons.enums.EntityType;

public class MediaUWs {
    private int id;
    private String lien;
    private EntityType type;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLien() {
        return lien;
    }

    public void setLien(String lien) {
        this.lien = lien;
    }

    public EntityType getType() {
        return type;
    }

    public void setType(EntityType type) {
        this.type = type;
    }
}
