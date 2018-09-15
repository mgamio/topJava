package com.topJava.math;

import static org.junit.Assert.*;
import org.junit.Test;

public class PowerOfTwoTest {

    @Test
    public void when_number_are_not_powerOf2_then_should_return_false() {
        assertFalse(PowerOfN.isPowerOf2(3));
        assertFalse(PowerOfN.isPowerOf2(6));
        assertFalse(PowerOfN.isPowerOf2(11));
        assertFalse(PowerOfN.isPowerOf2(25));
        assertFalse(PowerOfN.isPowerOf2(100));
    }

    @Test
    public void when_number_are_powerOf2_then_should_return_true() {
         assertTrue(PowerOfN.isPowerOf2(4));
         assertTrue(PowerOfN.isPowerOf2(0));
         assertTrue(PowerOfN.isPowerOf2(1));
         assertTrue(PowerOfN.isPowerOf2(2));
         assertTrue(PowerOfN.isPowerOf2(8));
         assertTrue(PowerOfN.isPowerOf2(128));
    }

}
