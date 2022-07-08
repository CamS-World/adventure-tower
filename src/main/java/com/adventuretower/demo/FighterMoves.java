package com.adventuretower.demo;

import java.util.Random;

public abstract class FighterMoves {

    int slashAttack(Fighter fighter, Fiend fiend){
        if (fighter.attack(fiend) == false){
            System.out.println("Attack missed!");
            return fiend.getMonsterHp();
        }
        System.out.println("Attack Hit! Roll for damage.");
        int min = 1;
        int max = 8;
        int range = (max - min) +1;
        int d8 = (int) (Math.random() * range) +min;



        int damage = d8 + fighter.getStrength();
        System.out.println("Damage amount: " + damage + " Dice roll: " + d8 + " damage modifier: " + fighter.getStrength());

        fiend.setMonsterHp(fiend.getMonsterHp() - damage);
        System.out.println();
        System.out.println("monster's new health: ");
        return fiend.getMonsterHp();
    };

    void tornadoBlade(Fiend fiend, Fighter fighter){
        // if Monster saves against dc strength plus prof. half damage. if not full.
        int min = 1;
        int max = 20;
        int range = max - min + 1;
        int d20 = (int) ((Math.random() * range) + min);

        int damageMin = 1;
        int damageMax = 6;
        int damageRange = damageMax - damageMin + 1;
        int d6 = (int) ((Math.random() * damageRange) + damageMin);
        int twoD6 = d6 + d6;

    int difficultyScore = fighter.getStrength() + fighter.getProficiency() + 8;
       int strengthSave = fiend.getStrength() + d20;

        //Fail scenario
        if (strengthSave < difficultyScore){
            System.out.println("save: "+strengthSave);
            System.out.println("DC: "+difficultyScore);
            System.out.println("fiend initial health: " +fiend.getMonsterHp());
            fiend.setMonsterHp(fiend.getMonsterHp() - twoD6);
            System.out.println("2d6: " +twoD6);
            System.out.println("Strength save failed: " + fiend.getMonsterHp());

        }
    //Success scenario
        if(strengthSave >= difficultyScore ) {
            System.out.println("fiend initial health: " +fiend.getMonsterHp());
            System.out.println("2d6: " +twoD6);
            fiend.setMonsterHp(fiend.getMonsterHp() - (twoD6 / 2));
            System.out.println("save: " + strengthSave);
            System.out.println("DC: " + difficultyScore);


            System.out.println("Strength save success: " + fiend.getMonsterHp());
        }

    };
}
