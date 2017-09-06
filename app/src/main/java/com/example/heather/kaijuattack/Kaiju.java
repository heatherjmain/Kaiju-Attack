package com.example.heather.kaijuattack;

/**
 * Created by heather on 06/09/2017.
 */

public abstract class Kaiju implements Damageable {
    String name;
    double healthValue;
    double attackValue;

    public Kaiju(String name, double healthValue, double attackValue) {
        this.name = name;
        this.healthValue = healthValue;
        this.attackValue = attackValue;
    }

    public String getName() {
        return name;
    }

    public double getHealthValue() {
        return healthValue;
    }

    public double getAttackValue() {
        return attackValue;
    }


    public String roar() {
        return "ROOOAAARRR";
    }

    public void attack(Damageable target) {
        target.takeDamage(attackValue);
    }

    public abstract String move();

}
