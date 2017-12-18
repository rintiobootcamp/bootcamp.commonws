/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bootcamp.commons.ws.usecases.pivotone;

/**
 *
 * @author leger
 */
public class TypeReponseWS {

    private int id;
    private String titre;
    private long nombreDeReponse;

    /**
     * Get the response type id
     *
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * Set the response type id
     *
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Get the response type title
     *
     * @return the title
     */
    public String getTitre() {
        return titre;
    }

    /**
     * Set the response type title
     *
     * @param titre the title to set
     */
    public void setTitre(String titre) {
        this.titre = titre;
    }

    /**
     * Get the number of response relate to this type
     *
     * @return the number of response
     */
    public long getNombreDeReponse() {
        return nombreDeReponse;
    }

    /**
     * Set the number of response relate to this type
     *
     * @param nombreDeReponse the number to set
     */
    public void setNombreDeReponse(long nombreDeReponse) {
        this.nombreDeReponse = nombreDeReponse;
    }

}
