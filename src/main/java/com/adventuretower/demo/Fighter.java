package com.adventuretower.demo;

import java.util.Random;

public class Fighter extends FighterMoves {

    private String name;
    private int playerHP;
    private int strength;
    private int intelligence;
    private int mana;
    private int attack;
    private int defense;
    private int level;
    private int proficiency;


    // Getters
    public int getPlayerHP() {
        return playerHP;
    }


    public int getStrength() {
        return strength;
    }


    public int getIntelligence() {
        return intelligence;
    }


    public int getMana() {
        return mana;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }

    public int getLevel() {
        return level;
    }



    public int getProficiency() {
        return proficiency;
    }




    public Fighter(String name, int playerHP, int strength, int intelligence, int mana,  int defense, int level, int proficiency){
        this.name = name;
        this.playerHP = playerHP;
        this.strength = strength;
        this.intelligence = intelligence;
        this.mana = mana;
        this.attack = strength + proficiency;
        this.defense = defense;
        this.level = level;
        this.proficiency = proficiency;
    }


        public Fighter(){

    };

    //Player methods

    public boolean attack(Fiend fiend){
//        int fighterAttackScore = player.getAttackScore();
//        int proficiency = player.getProficiency();

        Random ran = new Random();
        int d20 = ran.nextInt(20);

        System.out.println("Dice roll D20: " + d20);

        if (d20==20) {
            System.out.println("Crit Hit!");
        }

        if (d20 <= 1){
            System.out.println("Crit failure!");
        }



        attack = proficiency + strength;
        System.out.println("attack mod: " +attack);

        int attackRoll = attack + d20;
        System.out.println("Total attack roll: " + attackRoll);

        if (attackRoll > fiend.getDefense()){
            return true;
        }
        else return false;

    }


    public void heal(){

    }


    public void harm(){

    }
}
