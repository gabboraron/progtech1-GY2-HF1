/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author buriansandor
 */
public class JavaApplication1 {

    private Student tanulo1;

    public JavaApplication1() {
        tanulo1 = new Student();
    }
        
    public static void main(String[] args) {
        //Student stdnt = new Student();
        //JavaApplication1 tmp = new JavaApplication1();
        JavaApplication1 tmp = new JavaApplication1();
        tmp.menu();
    }
    
    public void menu() {
        int tmpavg;
        int note;
        boolean homework = false;
        
        String valasz;
        Scanner sc = new Scanner(System.in);  //Standerd input objektum.
        do {
            System.out.println("jb-jegyet_beír jak-kapott_jegyek_atlagának_kiitratása jdb-jegyek_szamanak_kiiratasa b-beadandot_hozzaad gyk-kaphat-e_gyak_jegyet v-kilep");
            valasz = sc.next();
            switch (valasz) {
                case "jb":
                    System.out.println("Add meg az új jegyet: ");
                    note = sc.nextInt();
                    addNote(note);
                    break;
                case "jak":
                    System.out.println("A jegyek atlaga: "+tanulo1.getAvg());
                    break;
                case "jdb":
                    System.out.println("A jegyek db szama: "+tanulo1.getNrofnotes() );
                    break;
                case "b":
                    System.out.println("Van beadandója a tanulónak: (i/n) ");
                    String hw = sc.nextLine();
		    addHomework(hw);    
                    break;
                case "gyk":
		    System.out.println(isAvailable());
                    break;
            }
        } while (!valasz.equals("v"));
    }
    
    public void addNote(int note){
        if((note>0) && (note<6)){
            tanulo1.setNrofnotes(tanulo1.getNrofnotes() + 1);
            tanulo1.setAvg((tanulo1.getAvg() + note)/tanulo1.getNrofnotes());
        }else{
            System.out.println("Az dott jegy nem felel meg a Magyarországon használt jegyfomrátumnak!");
        }
    }
    
    public void addHomework(String hw){
        if(hw.equals("i")){
            tanulo1.setHomework(true);
        }else{
            tanulo1.setHomework(false);
        }
    }
    
    public String isAvailable(){
        if(tanulo1.isHomework()){
            return "Kaphat gyakjegyet, van beadandó!";
        }
        return "NEM kaphat gyakjegyet, nincs beadandó!";
    }

}
