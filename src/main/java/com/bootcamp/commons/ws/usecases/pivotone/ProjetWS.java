/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bootcamp.commons.ws.usecases.pivotone;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Bello
 */
public class ProjetWS {

    private int id;
    private String nom;
    private String reference;
    private String description;
    private long dateDebutReel;
    private long dateFinReel;
    private long dateDebutPrevisionnel;
    private long dateFinPrevisionnel;
    private double budgetPrevisionnel;
    private double budgetReel;
    private double coutReel;
    private String objectif;
    private List<PhaseWS> phases;
    private int secteurId;
    private double niveauFinacement;
    private List<RegionWS> regions = new ArrayList<RegionWS>();
}
