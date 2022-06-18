package com.adventuretower.demo;

import java.util.Random;

public abstract class FighterMoves {

    int slashAttack(Fighter fighter){
        fighter.attack();

        Random ran = new Random();
        int d8 = ran.nextInt(8);
        if (d8==0){
            d8+=1;
        }
        System.out.println(d8);
        System.out.println(fighter.getStrength());
        int damage = d8 + fighter.getStrength();

        return damage;
    };

    void tornadoBlade(){
        // if Monster saves against dc strength plus prof. half damage. if not full.

    };
}
