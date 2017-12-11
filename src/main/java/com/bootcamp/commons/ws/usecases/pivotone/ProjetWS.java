/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bootcamp.commons.ws.usecases.pivotone;

import com.bootcamp.entities.Media;
import com.bootcamp.entities.Objectif;

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
    private double financementPrive;
     private double financementPublic;
    private double coutReel;
    private List<Objectif> listobjectifs;
    private List<PhaseWS> phasesActuelles;
    private List<PhaseWS> phases;
    private int secteurId;
    private SecteurWS secteur;
    private double niveauFinacement;
    private List<RegionWS> regions = new ArrayList<>();
    private List<Media> medias;
    private LikeWS likes;
    private NoteWS notes;

    public LikeWS getLikes() {
        return likes;
    }

    public void setLikes(LikeWS likes) {
        this.likes = likes;
    }

    public NoteWS getNotes() {
        return notes;
    }

    public void setNotes(NoteWS notes) {
        this.notes = notes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getDateDebutReel() {
        return dateDebutReel;
    }

    public void setDateDebutReel(long dateDebutReel) {
        this.dateDebutReel = dateDebutReel;
    }

    public long getDateFinReel() {
        return dateFinReel;
    }

    public void setDateFinReel(long dateFinReel) {
        this.dateFinReel = dateFinReel;
    }

    public long getDateDebutPrevisionnel() {
        return dateDebutPrevisionnel;
    }

    public void setDateDebutPrevisionnel(long dateDebutPrevisionnel) {
        this.dateDebutPrevisionnel = dateDebutPrevisionnel;
    }

    public long getDateFinPrevisionnel() {
        return dateFinPrevisionnel;
    }

    public void setDateFinPrevisionnel(long dateFinPrevisionnel) {
        this.dateFinPrevisionnel = dateFinPrevisionnel;
    }

    public double getBudgetPrevisionnel() {
        return budgetPrevisionnel;
    }

    public void setBudgetPrevisionnel(double budgetPrevisionnel) {
        this.budgetPrevisionnel = budgetPrevisionnel;
    }

    public double getFinancementPrive() {
        return financementPrive;
    }

    public void setFinancementPrive(double financementPrive) {
        this.financementPrive = financementPrive;
    }

    public double getFinancementPublic() {
        return financementPublic;
    }

    public void setFinancementPublic(double financementPublic) {
        this.financementPublic = financementPublic;
    }


    public double getCoutReel() {
        return coutReel;
    }

    public void setCoutReel(double coutReel) {
        this.coutReel = coutReel;
    }

    public List<Objectif> getListobjectifs() {
        return listobjectifs;
    }

    public void setListobjectifs(List<Objectif> listobjectifs) {
        this.listobjectifs = listobjectifs;
    }


    public List<PhaseWS> getPhases() {
        return phases;
    }

    public void setPhases(List<PhaseWS> phases) {
        this.phases = phases;
    }

    public int getSecteurId() {
        return secteurId;
    }

    public void setSecteurId(int secteurId) {
        this.secteurId = secteurId;
    }

    public double getNiveauFinacement() {
        return niveauFinacement;
    }

    public void setNiveauFinacement(double niveauFinacement) {
        this.niveauFinacement = niveauFinacement;
    }

    public List<RegionWS> getRegions() {
        return regions;
    }

    public void setRegions(List<RegionWS> regions) {
        this.regions = regions;
    }

    public SecteurWS getSecteur() {
        return secteur;
    }

    public void setSecteur(SecteurWS secteur) {
        this.secteur = secteur;
    }

    public List<PhaseWS> getPhasesActuelles() {
        return phasesActuelles;
    }

    public void setPhasesActuelles(List<PhaseWS> phasesActuelles) {
        this.phasesActuelles = phasesActuelles;
    }


    public List<Media> getMedias() {
        return medias;
    }

    public void setMedias(List<Media> medias) {
        this.medias = medias;
    }
}
