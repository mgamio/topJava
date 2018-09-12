package com.topJava.strings;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StringUtilsTest {

    StringUtils stringUtils;

    @Before
    public final void before() {
        stringUtils = new StringUtils();
    }

    @Test
    public void when_text_is_null_then_reverse_should_return_empty() {
        assertEquals("",stringUtils.reverse(null));
    }

    @Test
    public void when_text_is_valid_then_reverse_should_return_text_reversed() {
        assertEquals("abc2132", stringUtils.reverse("2312cba"));
    }

    @Test
    public void when_text_is_two_characters_then_reverse_should_return_text_reversed() {
        assertEquals("ba", stringUtils.reverse("ab"));
    }

    @Test
    public void when_text_is_includes_spaces_then_reverse_should_return_text_reversed() {
        assertEquals("c a1", stringUtils.reverse("1a c"));
    }

}
