package com.bootcamp.commons.ws.usecases.pivotone;

public class NoteWS {
    private int startNote;
    private int star1;
    private int start2;
    private int start3;
    private int start4;
    private int start5;

    public int getStartNote() {
        return startNote;
    }

    public void setStartNote(int startNote) {
        this.startNote = startNote;
    }

    public int getStar1() {
        return star1;
    }

    public void setStar1(int star1) {
        this.star1 = star1;
    }

    public int getStart2() {
        return start2;
    }

    public void setStart2(int start2) {
        this.start2 = start2;
    }

    public int getStart3() {
        return start3;
    }

    public void setStart3(int start3) {
        this.start3 = start3;
    }

    public int getStart4() {
        return start4;
    }

    public void setStart4(int start4) {
        this.start4 = start4;
    }

    public int getStart5() {
        return start5;
    }

    public void setStart5(int start5) {
        this.start5 = start5;
    }

    public double calNoteAverage(){
        return (getStar1()+getStart2()+getStart3()+getStart4()+getStart5())/5.0;
    }
}
