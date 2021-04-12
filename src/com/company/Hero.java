package com.company;

public class Hero {
    private int heroesHealth;
    private int heroesDamage;
    private String heroesSuperPower;

    public int getHeroesHealth() {
        return heroesHealth;
    }

    public int getHeroesDamage() {
        return heroesDamage;
    }

    public String getHeroesSuperPower() {
        return heroesSuperPower;
    }

    public void setHeroesHealth(int heroesHealth) {
        this.heroesHealth = heroesHealth;
    }

    public void setHeroesDamage(int heroesDamage) {
        this.heroesDamage = heroesDamage;
    }

    public void setHeroesSuperPower(String heroesSuperPower) {
        this.heroesSuperPower = heroesSuperPower;
    }

    public Hero(int heroesHealth, int heroesDamage, String heroesSuperPower) {
        this.heroesHealth = heroesHealth;
        this.heroesDamage = heroesDamage;
        this.heroesSuperPower = heroesSuperPower;
    }

    public Hero(int heroesHealth, int heroesDamage) {
        this.heroesHealth = heroesHealth;
        this.heroesDamage = heroesDamage;
    }
}


