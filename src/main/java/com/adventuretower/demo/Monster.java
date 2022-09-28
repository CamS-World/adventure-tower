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
    private int attack;
    private int experiencePoints;
    private int strength;
    private int agility;
    private int intelligence;
    private int mana;
    private int proficiency;
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

    public int getAttack() {return attack;}

    public int getExperiencePoints() {
        return experiencePoints;
    }

    public int getStrength() {return strength;}

    public int getAgility() {return agility;}

    public int getIntelligence() {return intelligence;}

    public int getMana() {return mana;}

    public int getProficiency() {
        return proficiency;
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



    public Fiend(String monsterTitle, int monsterHp, int defense, int strength, int agility, int intelligence, int mana  , int experiencePoints, int proficiency, String...resistances){
        this.monsterTitle = monsterTitle;
        this.monsterHp = monsterHp;
        this.defense = defense;
        this.attack = attack;
        this.strength = strength;
        this.agility = agility;
        this.intelligence = intelligence;
        this.mana = mana;
        this.proficiency = proficiency;
        this.experiencePoints = experiencePoints;
        this.resistances=new ArrayList<>(Arrays.asList(resistances));
    }

    public int initiative(){
        int min = 1;
        int max = 20;
        int range = max - min + 1;


        int d20 = (int) ((Math.random() * range) + min);

        int initiative = d20 + agility;
        System.out.println("Monster iniative: "+initiative);
        return initiative;
    }

    public boolean fiendAttack(Fighter fighter){

        int min = 1;
        int max = 20;
        int range = max - min + 1;


        int d20 = (int) ((Math.random() * range) + min);


        if (d20==20) {
            System.out.println("Crit Hit!");
        }

        if (d20 == 1){
            System.out.println("\nCrit failure!");
        }



        attack = proficiency + strength;
//        System.out.println("attack mod: " +attack);

        int attackRoll = attack + d20;
        System.out.println();
        System.out.println("Monster attack roll: " + attackRoll + " \n(Roll: " + d20 + " Modifier: " + attack + ")");

        if (attackRoll >= fighter.getDefense()){
            return true;
        }
        else return false;

    }

    int fiendBite(Fighter fighter, Fiend fiend){
        if (fiend.fiendAttack(fighter) == false){
            System.out.println("Monster attack missed!");
            System.out.println("\n"+fighter.getName()+ "hp: "+fighter.getPlayerHP());
            return fighter.getPlayerHP();
        }
        System.out.println("Attack Hit! Roll for damage.");
        int min = 1;
        int max = 6;
        int range = (max - min) +1;
        int d6 = (int) (Math.random() * range) +min;
        int twoD6 = d6 + d6;



        int damage = d6 + fiend.getStrength();
        System.out.println("\nDamage amount: " + damage + " Dice roll: " + d6 +
                " damage modifier: " + fiend.getStrength());

        fighter.harm(fighter, damage);
        if (fighter.getPlayerHP()<0){
            fighter.setPlayerHP(0);
        }
        System.out.println("\nplayer's new health: " + fighter.getPlayerHP());
        return fighter.getPlayerHP();
    };
}
