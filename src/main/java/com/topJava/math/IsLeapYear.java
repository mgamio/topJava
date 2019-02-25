package com.topJava.math;

import java.util.function.Function;

public class IsLeapYear implements Function<Integer,Boolean> {

    @Override
    public Boolean apply(Integer number) {
        return isLeapYear(number);
    }

    private static boolean isLeapYear(int year) {

        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);

    }
}
