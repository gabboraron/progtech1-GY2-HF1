/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author buriansandor
 */
public class Student {
     protected int nrofnotes = 0;
     protected int avg = 0;
     protected boolean homework = false;

    public boolean isHomework() {
        return homework;
    }

    public void setNrofnotes(int nrofnotes) {
        this.nrofnotes = nrofnotes;
    }

    public void setAvg(int avg) {
        this.avg = avg;
    }

    public void setHomework(boolean homework) {
        this.homework = homework;
    }

    public int getNrofnotes() {
        return nrofnotes;
    }

    public int getAvg() {
        return avg;
    }    
}
