package com.topJava.math;

import java.util.function.Function;

public class PrimeNumber implements Function<Integer, Boolean> {

    @Override
    public Boolean apply(Integer number) {
        return isPrime(number);
    }

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }

        if (number == 2) {
            return true;
        }

        for (int div = (number/2)+1; div>1; div--) {
            if (number % div == 0) {
                return false;
            }
        }
        return true;
    }

}

