package com.topJava.list;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ReturnListWithoutDuplicatesAndOrderedTest {

    @Test
    public void manyDuplicatesAndNotOrdered() {
        List<String> input = new ArrayList<>();
        input.add("c");
        input.add("b");
        input.add("b");
        input.add("d");
        input.add("c");
        input.add("a");
        List<String> result = ListUtils2.removeDuplicatesAndOrder(input);
        assertEquals("[a, b, c, d]", result.toString());
    }
}
