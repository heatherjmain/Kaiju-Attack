package com.example.heather.kaijuattack;

/**
 * Created by heather on 06/09/2017.
 */

public class TroopCarrier extends Vehicle implements Damageable {
    public TroopCarrier(String type, double healthValue) {
        super(type, healthValue);
    }

    @Override
    public void attack(double attackValue) {

    }
}
