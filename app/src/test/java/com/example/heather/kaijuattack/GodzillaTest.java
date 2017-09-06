package com.example.heather.kaijuattack;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

import com.example.heather.kaijuattack.*;



/**
 * Created by heather on 06/09/2017.
 */

public class GodzillaTest {
    Godzilla godzilla;
    Tank tank;

    @Before
    public void before() {
        godzilla = new Godzilla("Godzilla", 100, 14.0);
        tank = new Tank("Tank", 100.0);
    }

    @Test
    public void hasName() {
        assertEquals("Godzilla", godzilla.getName() );
    }

    @Test
    public void startsWithFullHealth() {
        assertEquals(100.0, godzilla.getHealthValue(), 0.01 );
    }

    @Test
    public void hasAttackValue() {
        assertEquals(14.0, godzilla.getAttackValue(), 0.01 );
    }

    @Test
    public void canRoar() {
        assertEquals("ROOOAAARRR", godzilla.roar() );
    }

    @Test
    public void canDamageTank() {
        godzilla.attack(tank);
        assertEquals(86, tank.getHealthValue(), 0.01 );
    }

    @Test
    public void canMove() {
        assertEquals("STOMP STOMP STOMP", godzilla.move() );
    }

}
