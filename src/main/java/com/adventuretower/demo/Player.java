package com.adventuretower.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public abstract class Player {

    @GeneratedValue
    @Id
    private int playerId;
    private String playerName;
    private int playerHp;
    private int strength;
    private int agility;
    private int intelligence;
    private int constitution;
    private int mana;
    private int attackScore;
    private int defenseScore;
    private int proficiency;


    public int getPlayerId() {
        return playerId;
    }

    public String getPlayerName() {
        return playerName;
    }

    public int getPlayerHp() {
        return playerHp;
    }

    public int getStrength() {
        return strength;
    }

    public int getAgility() { return agility;}

    public int getIntelligence() {
        return intelligence;
    }

    public int getConstitution() {return constitution;}

    public int getMana() {
        return mana;
    }

    public int getAttackScore() {
        return attackScore;
    }

    public int getDefenseScore() {
        return defenseScore;
    }

    public int getProficiency() {
        return proficiency;
    }



    public Player(String playerName, int playerHp, int strength, int agility, int intelligence, int constitution, int attackScore, int defenseScore, int proficiency ) {
        this.playerName = playerName;
        this.playerHp = playerHp;
        this.strength = strength;
        this.agility = agility;
        this.intelligence = intelligence;
        this.constitution = constitution;
        this.mana = constitution;
        this.attackScore = attackScore;
        this.defenseScore = defenseScore;
        this.proficiency = proficiency;

    }

    public Player(){
    }


    public abstract int attack();

    public abstract void heal();

    public abstract void harm();
}
