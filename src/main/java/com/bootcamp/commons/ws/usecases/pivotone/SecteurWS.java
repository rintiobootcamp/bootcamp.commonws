/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bootcamp.commons.ws.usecases.pivotone;

import java.util.List;

/**
 *
 * @author Bello
 */
public class SecteurWS {
    private int id;
    private String nom;
    private String description;
    private String icone;
    private long dateCreation;
    private long dateMiseAJour;
    private List<ProjetWS> projets;
    private int axeId;
}
