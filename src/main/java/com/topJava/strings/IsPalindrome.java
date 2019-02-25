package com.topJava.strings;

import java.util.function.Function;

public class IsPalindrome implements Function<String, Boolean> {

    @Override
    public Boolean apply(String text) {
        return isPalindrome(text);
    }

    static boolean isPalindrome(String text) {

        final int length = text.length();

        for (int idx = 0; idx<length/2; idx++) {
            char forward = text.charAt(idx);
            char backward = text.charAt(length - 1 - idx);
            if (forward != backward)
                return false;
        }

        return true;
    }


}
