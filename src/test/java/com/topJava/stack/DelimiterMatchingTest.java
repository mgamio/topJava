package com.topJava.stack;

import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import java.util.function.Function;

public class DelimiterMatchingTest {

    Function<String, Boolean> delimiterMatching = new DelimiterMatching();

    @Test
    public void incorrect_expressions() {
        assertFalse(delimiterMatching.apply(null));
        assertFalse(delimiterMatching.apply(""));
        assertFalse(delimiterMatching.apply("("));
        assertFalse(delimiterMatching.apply("(("));
    }

    @Test
    public void correct_expressions() {
        assertTrue(delimiterMatching.apply("()"));
    }

}
