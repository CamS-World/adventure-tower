package com.adventuretower.demo;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Fighter tony = new Fighter("Tony",50,5,2,1,2,15,3,1);
        Fiend jabuzal = new Fiend("Ozy",35,14,3, 4,4, 3,150,2,"Fire","Poison");

        Scanner input = new Scanner(System.in);
        String gamerChoice;

        do {
            System.out.println("Beware adventurer! A battle is about to begin.");

            System.out.println("Press 1 for \"Slash Attack\".");
            System.out.println("Press 2 for \"Tornado Blade\".");
            gamerChoice = input.nextLine();

            if (gamerChoice.equals("1")) {
                tony.slashAttack(tony,jabuzal);
            }

            if (gamerChoice.equals("2")) {
                tony.tornadoBlade(jabuzal,tony);
            }

            jabuzal.fiendBite(tony, jabuzal);



        } while (tony.getPlayerHP()>0 && jabuzal.getMonsterHp()>0);
        if (tony.getPlayerHP()==0){
            System.out.println("You begin to loose consciousness. " +tony.getName()+ " flees with his remaining strength");
        }
        if (jabuzal.getMonsterHp()==0) {
            System.out.println("You stand victorious over the " +jabuzal.getMonsterTitle());
        }
    }
}
