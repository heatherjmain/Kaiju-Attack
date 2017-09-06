package com.example.heather.kaijuattack;

/**
 * Created by heather on 06/09/2017.
 */

public abstract class Vehicle implements CanAttack {
    String type;
    double healthValue;

    public Vehicle(String type, double healthValue) {
        this.type = type;
        this.healthValue = healthValue;
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


}
