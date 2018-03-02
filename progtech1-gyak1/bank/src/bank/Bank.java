package bank;

import java.util.Scanner;

/**
 * Név: Nagy Sára
 * Feleadat: Bank számláinak kezelése. Alap IO utasításokkal.
 * A program adattagjai közt két számla szerepel csak.
 * A számlára lehet pénzt betenni és kivenni.
 */


public class Bank {

    private Szamla sz1;  //két számlánk van
    private Szamla sz2;

    public Bank() {
        sz1 = new Szamla(100, 1250);   //számlák létrehozása
        sz2 = new Szamla(200);         //a másodiknál nincs kezdeti összeg
        
    }

    public static void main(String[] args) {  
        //foprogram        
	Bank bank = new Bank();  //Bank osztály típusú objektum létrehozása.
        bank.menu();             //Az objektum menu metódusának hívása.
    }

    public void menu() {
        int osszeg;
        int szamla;
        String valasz;
        Scanner sc = new Scanner(System.in);  //Standerd input objektum.
        do {
            System.out.println("e-egyenleg  b-betesz  k-kivesz  v-vége");
            valasz = sc.next();
            switch (valasz) {
                case "e":
                    System.out.println(sz1);
                    System.out.println(sz2);
                    break;
                case "b":
		    System.out.println("Melyik számlára teszi a pénzt? (1/2) ");	
                    szamla = sc.nextInt();
		    if (szamla!=1 && szamla!=2){
                        System.out.println("Csak a két számla közül választhat!");
                        break;
                    }
                    System.out.println("Összeg? ");	
                    osszeg = sc.nextInt();
                    
                    if (szamla==1){
                        sz1.betesz(osszeg);
                    }
                    else {
                        sz2.betesz(osszeg);
                    }    
                    break;
                case "k":
		    System.out.println("Melyik számláról vesz ki a pénzt? (1/2) ");	
                    szamla = sc.nextInt();
                    if (szamla!=1 && szamla!=2){
                        System.out.println("Csak a két számla közül választhat!");
                        break;
                    }
		    System.out.println("Összeg? ");	
                    osszeg = sc.nextInt();                    
                    if (szamla==1 && !sz1.kivesz(osszeg)) {
                        System.out.println("Nincs fedezet!");
                    }
                    if (szamla==2 && !sz2.kivesz(osszeg)) {
                        System.out.println("Nincs fedezet!");
                    }
                    break;
            }
        } while (!valasz.equals("v"));
    }

}

        