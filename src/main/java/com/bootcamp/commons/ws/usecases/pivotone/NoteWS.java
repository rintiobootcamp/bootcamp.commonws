/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bootcamp.commons.ws.usecases.pivotone;

import com.bootcamp.commons.enums.EntityType;

/**
 *
 * @author Bello
 */
public class NoteWS {
    private double moyenne;
    private int allNotesCount;
    private int noteOneCounts;
    private int noteTwoCounts;
    private int noteThreeCounts;
    private int noteFourCounts;
    private int noteFiveCounts;

    /**
     * @return the counts
     */
    public int getAllNotesCount() {
        return allNotesCount;
    }

     /**
     * @param allNotesCount the counts to set
     */
    public void setAllNotesCount(int allNotesCount) {
        this.allNotesCount = allNotesCount;
    }

    /**
     * @return the moyenne
     */
    public double getMoyenne() {
        return moyenne;
    }

    /**
     * @param moyenne the moyenne to set
     */
    public void setMoyenne(double moyenne) {
        this.moyenne = moyenne;
    }

    /**
     * @return the noteOneCounts
     */
    public int getNoteOneCounts() {
        return noteOneCounts;
    }

    /**
     * @param noteOneCounts the noteOneCounts to set
     */
    public void setNoteOneCounts(int noteOneCounts) {
        this.noteOneCounts = noteOneCounts;
    }

    /**
     * @return the noteTwoCounts
     */
    public int getNoteTwoCounts() {
        return noteTwoCounts;
    }

    /**
     * @param noteTwoCounts the noteTwoCounts to set
     */
    public void setNoteTwoCounts(int noteTwoCounts) {
        this.noteTwoCounts = noteTwoCounts;
    }

    /**
     * @return the noteThreeCounts
     */
    public int getNoteThreeCounts() {
        return noteThreeCounts;
    }

    /**
     * @param noteThreeCounts the noteThreeCounts to set
     */
    public void setNoteThreeCounts(int noteThreeCounts) {
        this.noteThreeCounts = noteThreeCounts;
    }

    /**
     * @return the noteFourCounts
     */
    public int getNoteFourCounts() {
        return noteFourCounts;
    }

    /**
     * @param noteFourCounts the noteFourCounts to set
     */
    public void setNoteFourCounts(int noteFourCounts) {
        this.noteFourCounts = noteFourCounts;
    }

    /**
     * @return the noteFiveCounts
     */
    public int getNoteFiveCounts() {
        return noteFiveCounts;
    }

    /**
     * @param noteFiveCounts the noteFiveCounts to set
     */
    public void setNoteFiveCounts(int noteFiveCounts) {
        this.noteFiveCounts = noteFiveCounts;
    }
}
