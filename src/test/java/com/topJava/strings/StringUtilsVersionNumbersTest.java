package com.topJava.strings;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class StringUtilsVersionNumbersTest {

    private StringUtils stringUtils;

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Before
    public final void before() {
        stringUtils = new StringUtils();
    }

    @Test
    public void when_atLeast_one_argument_is_null_then_should_return_Error() {
        exception.expect(RuntimeException.class);
        stringUtils.compareVesionNumbers(null, "12.0");
    }

    @Test
    public void when_atLeast_one_argument_is_empty_then_should_return_Error() {
        exception.expect(RuntimeException.class);
        stringUtils.compareVesionNumbers("", "12.0");
    }

    @Test
    public void when_version1_less_than_version2_then_should_return_minus_1() {
        assertEquals(-1,stringUtils.compareVesionNumbers("14.1","14.2"));
    }

    @Test
    public void when_version1_greater_than_version2_then_should_return_1() {
        assertEquals(1,stringUtils.compareVesionNumbers("15.1","15.0"));
    }

    @Test
    public void different_uses_cases() {
        assertEquals(0,stringUtils.compareVesionNumbers("15","15.0"));
        assertEquals(0,stringUtils.compareVesionNumbers("10.1","10.1.0"));
        assertEquals(-1,stringUtils.compareVesionNumbers("10.1","10.1.1"));
        assertEquals(1,stringUtils.compareVesionNumbers("10.1.2","10.1.1"));
    }

}
