package com.exorandom;

import java.util.Random;
import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
    Scanner clavier= new Scanner (System.in);
    Random generateur = new Random();
    System.out.println("veuillez lancer, s'il vous plait !");
    clavier.nextLine();
    int i;
    int restant=0;
    int lancer1=0;
    for ( i=1; i<=5; i++){
         int lancer= generateur.nextInt(6) + 1;
         lancer1+=lancer;
         restant = 20-lancer;
         System.out.print("Lancer " + i + " : vous avez fait " + lancer + ". vous etes sur la case " + lancer1 + " (encore " + restant + " cases)");
         clavier.nextLine();
        
        }
    clavier.close();
    
    if (restant == 0) {
        System.out.println("Nous avons gagné!");
    
    }
    else {
        System.out.println("Nous avons perdu!");
    } 
    }
    
}
