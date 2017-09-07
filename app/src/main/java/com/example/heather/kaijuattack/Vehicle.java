package com.example.heather.kaijuattack;

/**
 * Created by heather on 06/09/2017.
 */

public abstract class Vehicle implements CanAttack, Damageable {
    String type;
    double healthValue;
    double attackValue;

    public Vehicle(String type, double healthValue, double attackValue) {
        this.type = type;
        this.healthValue = healthValue;
        this.attackValue = attackValue;
    }

    public String getType() {
        return type;
    }

    public double getHealthValue() {
        return healthValue;
    }

    public void takeDamage(double damage) {
        this.healthValue -= damage;
    }

    public void attack(Damageable target) {
        target.takeDamage(attackValue);
    }


}
