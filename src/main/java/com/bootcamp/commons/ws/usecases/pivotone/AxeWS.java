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
public class AxeWS {
    private int id;
    private String nom;
    private String description;
    private String titre;
    private String titreFocus;
    private String descriptionFocus;
    private long dateCreation;
    private long dateMiseAJour;
    private List<SecteurWS> secteurs;
    private int pilierId;
}
