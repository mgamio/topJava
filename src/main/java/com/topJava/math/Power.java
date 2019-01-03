package com.topJava.math;

import java.util.function.BiFunction;


public class Power implements BiFunction<Integer, Integer, Boolean> {

    @Override
    public Boolean apply(Integer product, Integer base) {
        return isPowerOfN(product, base);
    }

    static boolean isPowerOfN(int product, int base) {
        if (product == 0)
            return true;

        int div = product;

        while (div != 1) {
            if ((div % base) != 0)
                return false;

            div = div/base;
        }

        return true;
    }

}
