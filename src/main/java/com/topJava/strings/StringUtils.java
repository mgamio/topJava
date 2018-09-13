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

    /**
     * Compare application version numbers
     *
     * @param version1 version number to compare
     * @param version2 version number to compare
     * @return -1 if version1 < version2
     *          1 if version1 > version2
     *          0 if version1 == version2
     */
    public int compareVesionNumbers(String version1, String version2) {

        if (version1 == null || version2 == null ||
            version1.isEmpty() || version2.isEmpty())
            throw new RuntimeException("Invalid arguments ...");

        //Implements a regexp to accept only digits and "." characters ...

        String[] array1 = version1.split("\\.");
        String[] array2 = version2.split("\\.");
        int idx = 0;
        int length1 = array1.length;
        int length2 = array2.length;

        while (idx < length1 || idx < length2) {
            if (idx < length1 && idx < length2) {
                if (Integer.parseInt(array1[idx]) < Integer.parseInt(array2[idx])) {
                    return -1;
                } else if (Integer.parseInt(array1[idx]) > Integer.parseInt(array2[idx])) {
                    return 1;
                }
            } else if (idx < length1) {
                if (Integer.parseInt(array1[idx]) != 0) {
                    return 1;
                }
            } else if (idx < length2) {
                if (Integer.parseInt(array2[idx]) != 0) {
                    return -1;
                }
            }
            idx++;
        }
        return 0;
    }
}
