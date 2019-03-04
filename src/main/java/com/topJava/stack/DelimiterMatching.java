package com.topJava.stack;

import java.util.Stack;
import java.util.function.Function;

public class DelimiterMatching implements Function<String, Boolean> {

    public static String openingDelimiters = new String("([{");
    public static String closingDelimiters = new String(")]}");

    @Override
    public Boolean apply(String expression) {
        return isValidExpression(expression);
    }

    public static boolean isValidExpression(String expression) {

        if (expression == null || expression.trim().length() < 2) {
            return false;
        }

        int len = expression.length();
        Stack<Character> stackBuffer = new Stack<>();

        for (int idx = 0; idx < len; idx++) {
            char character = expression.charAt(idx);
            int closingDelimiterSymbolIdx = closingDelimiters.indexOf(character);
            if (closingDelimiterSymbolIdx >=0) {
                char openingDelimiterSymbolToFind = openingDelimiters.charAt(closingDelimiterSymbolIdx);
                if (stackBuffer.isEmpty()) {
                    return false;
                } else {
                    boolean found = false;
                    while (!stackBuffer.isEmpty()) {
                        char characterToEvaluate = stackBuffer.pop();
                        if (characterToEvaluate == openingDelimiterSymbolToFind) {
                            found = true;
                        }
                    }
                    if (found == false) {
                        return false;
                    }
                }
            } else {
                stackBuffer.push(character);
            }
        }

        if (!stackBuffer.isEmpty()) {
            return false;
        }

        return true;
    }

}
