package com.adventuretower.demo;

import java.util.Random;

public class Fighter extends Player  {

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

    @Override
    public int getStrength() {
        return strength;
    }

    @Override
    public int getIntelligence() {
        return intelligence;
    }

    @Override
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


    @Override
    public int getProficiency() {
        return proficiency;
    }


    public Fighter(int playerHP, int strength, int intelligence, int mana, int attack, int defense, int level, int proficiency){
        this.playerHP = playerHP;
        this.strength = strength;
        this.intelligence = intelligence;
        this.mana = mana;
        this.attack = attack;
        this.defense = defense;
        this.level = level;
        this.proficiency = proficiency;
    }


    //Player methods
    @Override
    public int attack(){
//        int fighterAttackScore = player.getAttackScore();
//        int proficiency = player.getProficiency();

        Random ran = new Random();
        int d20 = ran.nextInt(20);
        System.out.println("Dice roll: " + d20);

        if (d20==20) {
            System.out.println("Crit Hit!");
        }

        attack = strength + proficiency;
        System.out.println("attack mod: " +attack);

        int attackRoll = attack + d20;
        return attackRoll;

    }

    @Override
    public void heal(){

    }

    @Override
    public void harm(){

    }
}
