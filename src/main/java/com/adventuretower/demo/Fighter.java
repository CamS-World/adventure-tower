package com.adventuretower.demo;

import java.util.Random;

public class Fighter extends FighterMoves {

    int min = 1;
    int max = 20;
    int range = max - min + 1;


    int d20 = (int) ((Math.random() * range) + min);


    private String name;
    private int playerHP;
    private int strength;
    private int agility;
    private int intelligence;
    private int mana;
    private int attack;
    private int defense;
    private int level;
    private int experiencePool;
    private int proficiency;


    // Getters
    public String getName() {
        return name;
    }

    public int getPlayerHP() {
        return playerHP;
    }


    public int getStrength() {
        return strength;
    }

    public int getAgility() {
        return agility;
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


    public void setPlayerHP(int playerHP) {
        this.playerHP = playerHP;
    }

    public Fighter(String name, int playerHP, int strength, int agility, int intelligence, int mana, int defense, int level, int experiencePool, int proficiency) {
        this.name = name;
        this.playerHP = playerHP;
        this.strength = strength;
        this.agility = agility;
        this.intelligence = intelligence;
        this.mana = mana;
        this.attack = strength + proficiency;
        this.defense = defense;
        this.level = level;
        this.experiencePool = experiencePool;
        this.proficiency = proficiency;
    }


    public Fighter() {

    }

    ;

    //Player methods

    public int initiative() {
        int min = 1;
        int max = 20;
        int range = max - min + 1;


        int d20 = (int) ((Math.random() * range) + min);

        int initiative = d20 + agility;
        System.out.println("Player initiative: " + initiative);
        return initiative;
    }

    public boolean isCritHit() {
        return (d20 == 20) ? true : false;
    }

    public boolean attack(Fiend fiend, Fighter fighter) {

        int min = 1;
        int max = 20;
        int range = max - min + 1;
        int d20 = (int) ((Math.random() * range) + min);

        if (d20 == 20) {
            System.out.println("Crit Hit!");
            fighter.isCritHit();
        }

        if (d20 == 1) {
            System.out.println("Crit failure!");
        }


        attack = proficiency + strength;
//        System.out.println("attack mod: " +attack);

        int attackRoll = attack + d20;
        System.out.println("Total attack roll: " + attackRoll + "\n (Roll: " + d20 + " Modifier: " + attack + ")\n");


        return (attackRoll > fiend.getDefense()) ? true : false;

    }


    public void heal() {

    }


    public void harm(Fighter fighter, int damageDone) {
        playerHP -= damageDone;
    }

    public void levelUp(int experiencePoints) {
        experiencePool += experiencePoints;
//        if (experiencePool > 140 && level == 3) {
//            level += 1;
//        }

    }
}


