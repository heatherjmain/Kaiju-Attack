package com.example.heather.kaijuattack;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import com.example.heather.kaijuattack.*;

/**
 * Created by heather on 06/09/2017.
 */

public class TankTest {
    Tank tank;

    @Before
    public void before() {
        tank = new Tank("Tank", 100.0);
    }

    @Test
    public void hasType() {
        assertEquals( "Tank", tank.getType() );
    }

    @Test
    public void startsWithFullHealth() {
        assertEquals( 100.0, tank.getHealthValue(), 0.01 );
    }
}
