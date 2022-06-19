package com.adventuretower.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public abstract class Monster {
    private String monsterTitle;
    private int monsterHp;
    private int experiencePoints;
    private Collection<String> resistance;
    private Collection<String> damageTypes;

    //Make a sample monster for the fighter to fight. Fiend, resistant to fire and poison.
}

class Fiend {
    private String monsterTitle;
    private int monsterHp;
    private int defense;
    private int experiencePoints;
    private Collection<String> resistances;
    private Collection<String> damageTypes;

    public String getMonsterTitle() {
        return monsterTitle;
    }

    public int getMonsterHp() {
        return monsterHp;
    }

    public int getDefense() {
        return defense;
    }

    public int getExperiencePoints() {
        return experiencePoints;
    }

    public Collection<String> getResistances() {
        return resistances;
    }

    public Collection<String> getDamageTypes() {
        return damageTypes;
    }

    public void setMonsterHp(int monsterHp) {
        this.monsterHp = monsterHp;
    }

    public Fiend(String monsterTitle, int monsterHp, int defense, int experiencePoints, String...resistances){
        this.monsterTitle = monsterTitle;
        this.monsterHp = monsterHp;
        this.defense = defense;
        this.experiencePoints = experiencePoints;
        this.resistances=new ArrayList<>(Arrays.asList(resistances));
    }
}
