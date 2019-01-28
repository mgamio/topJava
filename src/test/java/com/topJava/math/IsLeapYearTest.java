package com.topJava.math;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class IsLeapYearTest {

    private IsLeapYear isLeapYear;

    @Before
    public void before() {
        isLeapYear = new IsLeapYear();
    }

    @Test
    public void isLeapYear() {
       assertTrue(isLeapYear.apply(400));
       assertTrue(isLeapYear.apply(2020));
    }

    @Test
    public void is_notLeapYear() {
        assertFalse(isLeapYear.apply(401));
        assertFalse(isLeapYear.apply(2018));
    }

}
