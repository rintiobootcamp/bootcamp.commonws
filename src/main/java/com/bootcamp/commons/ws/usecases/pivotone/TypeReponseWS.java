/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bootcamp.commons.ws.usecases.pivotone;

import java.util.List;

/**
 *
 * @author leger
 */
class TypeReponseWS {
    
    private int id;
    private String titre;
    private long nombreDeReponse;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public long getNombreDeReponse() {
        return nombreDeReponse;
    }

    public void setNombreDeReponse(long nombreDeReponse) {
        this.nombreDeReponse = nombreDeReponse;
    }
    
    
    
}
