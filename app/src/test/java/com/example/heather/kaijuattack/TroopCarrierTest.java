package com.example.heather.kaijuattack;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by heather on 06/09/2017.
 */

public class TroopCarrierTest {
    TroopCarrier troopCarrier;

    @Before
    public void before() {
        troopCarrier = new TroopCarrier("Troop Carrier", 100.0);
    }

    @Test
    public void hasType() {
        assertEquals("Troop Carrier", troopCarrier.getType() );
    }

    @Test
    public void startWithFullHealth() {
        assertEquals(100, troopCarrier.getHealthValue(), 0.01);
    }
}
