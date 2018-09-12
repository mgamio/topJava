package com.topJava.strings;

public class StringUtils {

    public String reverse(String text) {

        if (text == null)
            return "";

        char[] arrayOfChars = text.toCharArray();
        final int arrayHalfLength = arrayOfChars.length/2;
        final int arrayLength = arrayOfChars.length;
        int idx_aux;
        char char_aux;
        for (int idx=0; idx < arrayHalfLength; idx++) {
            idx_aux = arrayLength - 1 - idx;
            char_aux = arrayOfChars[idx];
            arrayOfChars[idx] = arrayOfChars[idx_aux];
            arrayOfChars[idx_aux] = char_aux;
        }

        return String.valueOf(arrayOfChars);
    }

}
