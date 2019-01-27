package com.topJava.strings;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class IsPalindromeTest {

    private IsPalindrome isPalindrome;

    @Before
    public final void before() {
        isPalindrome = new IsPalindrome();
    }

    @Test
    public void is_not_palindrome() {
        assertFalse(isPalindrome.apply("2f1"));
        assertFalse(isPalindrome.apply("-101"));
    }

    @Test
    public void is_palindrome() {
        assertTrue(isPalindrome.apply("2f1f2"));
        assertTrue(isPalindrome.apply("-101-"));
        assertTrue(isPalindrome.apply("9"));
        assertTrue(isPalindrome.apply("99"));
    }

}
