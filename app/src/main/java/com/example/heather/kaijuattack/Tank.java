package com.example.heather.kaijuattack;

/**
 * Created by heather on 06/09/2017.
 */

public class Tank extends Vehicle implements Damageable {
    public Tank(String type, double healthValue) {
        super(type, healthValue);
    }

    @Override
    public void attack(double attackValue) {

    }
}
