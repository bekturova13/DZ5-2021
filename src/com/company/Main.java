package com.company;

public class Main {

    public static void main(String[] args) {
 Boss bigBoss= new Boss();
bigBoss.setBossHealth(1000);
bigBoss.setBossDamage(65);
bigBoss.setBossDefenceType("Armor");
        System.out.println(bigBoss.getBossHealth()+ " "+ bigBoss.getBossDamage()+ " "+
                bigBoss.getBossDefenceType());
    }

}
