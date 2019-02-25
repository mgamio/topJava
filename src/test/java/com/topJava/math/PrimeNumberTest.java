package com.topJava.math;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PrimeNumberTest {

    @Test
    public void notPrimeNumbers() {
        assertFalse(PrimeNumber.isPrime(-1));
        assertFalse(PrimeNumber.isPrime(625));
        assertFalse(PrimeNumber.isPrime(4));
        assertFalse(PrimeNumber.isPrime(100));
    }

    @Test
    public void primeNumbers() {
        assertTrue(PrimeNumber.isPrime(2));
        assertTrue(PrimeNumber.isPrime(3));
        assertTrue(PrimeNumber.isPrime(5));
        assertTrue(PrimeNumber.isPrime(7));
        assertTrue(PrimeNumber.isPrime(73));
    }

}
