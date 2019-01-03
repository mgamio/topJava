package com.topJava.math;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PowerTest {

    @Test
    public void when_a_number_is_not_powerOf_another_number_then_should_return_false() {
        assertFalse(Power.isPowerOfN(6, 2));
        assertFalse(Power.isPowerOfN(16, 5));
        assertFalse(Power.isPowerOfN(14, 7));
    }

    @Test
    public void when_a_number_is_powerOf_another_number_then_should_return_true() {
        assertTrue(Power.isPowerOfN(0, 3));
        assertTrue(Power.isPowerOfN(16, 4));
        assertTrue(Power.isPowerOfN(125, 5));
    }

}
