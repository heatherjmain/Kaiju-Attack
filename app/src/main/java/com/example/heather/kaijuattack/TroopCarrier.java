package com.example.heather.kaijuattack;

/**
 * Created by heather on 06/09/2017.
 */

public class TroopCarrier extends Vehicle implements Damageable, CanAttack{
    public TroopCarrier(String type, double healthValue, double attackValue) {
        super(type, healthValue, attackValue);
    }

}
