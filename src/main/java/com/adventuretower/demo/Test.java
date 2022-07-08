package com.adventuretower.demo;

public class Test {
    public static void main(String[] args) {
        Fighter tony = new Fighter("Tony",50,5,1,2,15,3,1);
        Fiend jabuzal = new Fiend("Ozy",35,14,3, 4, 3,150,"Fire","Poison");

//        System.out.println(tony.slashAttack(tony,jabuzal));

        tony.tornadoBlade(jabuzal,tony);
    }
}
