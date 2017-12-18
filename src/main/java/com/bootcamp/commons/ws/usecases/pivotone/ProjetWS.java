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

    /**
     *
     * @return
     */
    public LikeWS getLikes() {
        return likes;
    }

    /**
     *
     * @param likes
     */
    public void setLikes(LikeWS likes) {
        this.likes = likes;
    }

    /**
     *
     * @return
     */
    public NoteWS getNotes() {
        return notes;
    }

    /**
     *
     * @param notes
     */
    public void setNotes(NoteWS notes) {
        this.notes = notes;
    }

    /**
     *
     * @return
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     *
     * @return
     */
    public String getNom() {
        return nom;
    }

    /**
     *
     * @param nom
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     *
     * @return
     */
    public String getReference() {
        return reference;
    }

    /**
     *
     * @param reference
     */
    public void setReference(String reference) {
        this.reference = reference;
    }

    /**
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     *
     * @return
     */
    public long getDateDebutReel() {
        return dateDebutReel;
    }

    /**
     *
     * @param dateDebutReel
     */
    public void setDateDebutReel(long dateDebutReel) {
        this.dateDebutReel = dateDebutReel;
    }

    /**
     *
     * @return
     */
    public long getDateFinReel() {
        return dateFinReel;
    }

    /**
     *
     * @param dateFinReel
     */
    public void setDateFinReel(long dateFinReel) {
        this.dateFinReel = dateFinReel;
    }

    /**
     *
     * @return
     */
    public long getDateDebutPrevisionnel() {
        return dateDebutPrevisionnel;
    }

    /**
     *
     * @param dateDebutPrevisionnel
     */
    public void setDateDebutPrevisionnel(long dateDebutPrevisionnel) {
        this.dateDebutPrevisionnel = dateDebutPrevisionnel;
    }

    /**
     *
     * @return
     */
    public long getDateFinPrevisionnel() {
        return dateFinPrevisionnel;
    }

    /**
     *
     * @param dateFinPrevisionnel
     */
    public void setDateFinPrevisionnel(long dateFinPrevisionnel) {
        this.dateFinPrevisionnel = dateFinPrevisionnel;
    }

    /**
     *
     * @return
     */
    public double getBudgetPrevisionnel() {
        return budgetPrevisionnel;
    }

    /**
     *
     * @param budgetPrevisionnel
     */
    public void setBudgetPrevisionnel(double budgetPrevisionnel) {
        this.budgetPrevisionnel = budgetPrevisionnel;
    }

    /**
     *
     * @return
     */
    public double getFinancementPrive() {
        return financementPrive;
    }

    /**
     *
     * @param financementPrive
     */
    public void setFinancementPrive(double financementPrive) {
        this.financementPrive = financementPrive;
    }

    /**
     *
     * @return
     */
    public double getFinancementPublic() {
        return financementPublic;
    }

    /**
     *
     * @param financementPublic
     */
    public void setFinancementPublic(double financementPublic) {
        this.financementPublic = financementPublic;
    }

    /**
     *
     * @return
     */
    public double getCoutReel() {
        return coutReel;
    }

    /**
     *
     * @param coutReel
     */
    public void setCoutReel(double coutReel) {
        this.coutReel = coutReel;
    }

    /**
     *
     * @return
     */
    public List<Objectif> getListobjectifs() {
        return listobjectifs;
    }

    /**
     *
     * @param listobjectifs
     */
    public void setListobjectifs(List<Objectif> listobjectifs) {
        this.listobjectifs = listobjectifs;
    }

    /**
     *
     * @return
     */
    public List<PhaseWS> getPhases() {
        return phases;
    }

    /**
     *
     * @param phases
     */
    public void setPhases(List<PhaseWS> phases) {
        this.phases = phases;
    }

    /**
     *
     * @return
     */
    public int getSecteurId() {
        return secteurId;
    }

    /**
     *
     * @param secteurId
     */
    public void setSecteurId(int secteurId) {
        this.secteurId = secteurId;
    }

    /**
     *
     * @return
     */
    public double getNiveauFinacement() {
        return niveauFinacement;
    }

    /**
     *
     * @param niveauFinacement
     */
    public void setNiveauFinacement(double niveauFinacement) {
        this.niveauFinacement = niveauFinacement;
    }

    /**
     *
     * @return
     */
    public List<RegionWS> getRegions() {
        return regions;
    }

    /**
     *
     * @param regions
     */
    public void setRegions(List<RegionWS> regions) {
        this.regions = regions;
    }

    /**
     *
     * @return
     */
    public SecteurWS getSecteur() {
        return secteur;
    }

    /**
     *
     * @param secteur
     */
    public void setSecteur(SecteurWS secteur) {
        this.secteur = secteur;
    }

    /**
     *
     * @return
     */
    public List<PhaseWS> getPhasesActuelles() {
        return phasesActuelles;
    }

    /**
     *
     * @param phasesActuelles
     */
    public void setPhasesActuelles(List<PhaseWS> phasesActuelles) {
        this.phasesActuelles = phasesActuelles;
    }

    /**
     *
     * @return
     */
    public List<Media> getMedias() {
        return medias;
    }

    /**
     *
     * @param medias
     */
    public void setMedias(List<Media> medias) {
        this.medias = medias;
    }
}
