package com.example.heather.kaijuattack;

/**
 * Created by heather on 06/09/2017.
 */

public class Godzilla extends Kaiju {
    public Godzilla(String name, double healthValue, double attackValue) {
        super(name, healthValue, attackValue);
    }

    public String move() {
        return "STOMP STOMP STOMP";
    }

}




