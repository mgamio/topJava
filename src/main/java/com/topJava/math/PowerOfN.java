package com.topJava.math;

public class PowerOfN {
    public static boolean isPowerOf2(Integer number) {

        if (number == 0)
            return true;

        int div = number;

        while (div != 1) {
            if ((div % 2) != 0)
                return false;

            div = div/2;
        }

        return true;
    }
}
