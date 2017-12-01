/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bootcamp.commons.ws.usecases.pivottwo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Bello
 */
public class ProjetUWS {

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
    private List<PhaseUWS> phases;
    private double niveauFinacement;
    private SecteurUWS secteur;
    private List<RegionUWS> regions = new ArrayList<RegionUWS>();
}
