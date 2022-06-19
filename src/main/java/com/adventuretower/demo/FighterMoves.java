package com.adventuretower.demo;

import java.util.Random;

public abstract class FighterMoves {

    int slashAttack(Fighter fighter, Fiend fiend){
        if (fighter.attack(fiend) == false){
            System.out.println("Attack missed!");
            return fiend.getMonsterHp();
        }
//        fighter.attack(fiend);


        Random ran = new Random();
        int d8 = ran.nextInt(8);
        if (d8==0){
            d8+=1;
        }
        System.out.println(d8);
        System.out.println(fighter.getStrength());
        int damage = d8 + fighter.getStrength();
        System.out.println("Damage amount: " + damage);

        fiend.setMonsterHp(fiend.getMonsterHp() - damage);
        System.out.println("monster's new health: ");
        return fiend.getMonsterHp();
    };

    void tornadoBlade(){
        // if Monster saves against dc strength plus prof. half damage. if not full.

    };
}
