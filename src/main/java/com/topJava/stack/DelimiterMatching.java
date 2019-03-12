package com.topJava.stack;

import java.util.Stack;
import java.util.function.Function;

public class DelimiterMatching implements Function<String, Boolean> {

    @Override
    public Boolean apply(String expression) {
        return isMatched(expression);
    }

    public static boolean isMatched(String expression) {

        final String openingDelimiters = new String("([{"); // opening delimiters
        final String closingDelimiters = new String(")]}"); // respective closing delimiters by index position

        if (expression == null || expression.trim().length() < 2) {
            return false;
        }

        int len = expression.length();
        Stack<Character> stackBuffer = new Stack<>();

        for (char c : expression.toCharArray()) {
            if (openingDelimiters.indexOf(c) != -1) { // an opening delimiter was found
                stackBuffer.push(c);
            } else if (closingDelimiters.indexOf(c) != -1) { // a closing delimiter was found
                if (stackBuffer.isEmpty())
                    return false;
                // we assume the matched delimiters are located at the same index position
                if (closingDelimiters.indexOf(c) != openingDelimiters.indexOf(stackBuffer.pop()))
                    return false;
            }
        }
        return stackBuffer.isEmpty(); //all opening delimiters matched?

    }

}
