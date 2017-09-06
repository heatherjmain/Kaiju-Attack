package com.example.heather.kaijuattack;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by heather on 06/09/2017.
 */

public class RodanTest {
    Rodan rodan;

    @Before
    public void before() {
        rodan = new Rodan("Rodan", 100, 8.5);
    }

    @Test
    public void hasName() {
        assertEquals("Rodan", rodan.getName() );
    }

    @Test
    public void startsWithFullHealth() {
        assertEquals(100.0, rodan.getHealthValue(), 0.01 );
    }

    @Test
    public void hasAttackValue() {
        assertEquals(8.5, rodan.getAttackValue(), 0.01 );
    }

    @Test
    public void canRoar() {
        assertEquals("ROOOAAARRR", rodan.roar() );
    }

    @Test
    public void canMove() {
        assertEquals("CRUNCH CRUNCH CRUNCH", rodan.move() );
    }

}
