package com.example.heather.kaijuattack;

/**
 * Created by heather on 06/09/2017.
 */

public class Rodan extends Kaiju {
    public Rodan(String name, double healthValue, double attackValue) {
        super(name, healthValue, attackValue);
    }

    public String move() {
        return "CRUNCH CRUNCH CRUNCH";
    }

    @Override
    public void takeDamage(double damage) {

    }
}




