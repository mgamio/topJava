package com.topJava.list;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.internal.util.collections.ListUtil;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicatesTest {

    @Test
    public void when_emptyList_then_should_return_size_0() {
        List<String> list = new ArrayList<>();
        List<String> result = ListUtils.removeDuplicates(list);
        assertEquals(0,result.size());
    }

    @Test
    public void when_duplicates_in_list_then_should_return_list_without_duplicates() {
        List<String> input = new ArrayList<>();
        input.add("s1");
        input.add("s2");
        input.add("s1");
        input.add("s3");
        List<String> result = ListUtils.removeDuplicates(input);
        assertEquals(3, result.size());
        assertTrue(result.get(0).equals("s1"));
        assertTrue(result.get(1).equals("s2"));
        assertTrue(result.get(2).equals("s3"));
    }

    @Test
    public void when_exists_integers_duplicated_then_should_return_list_without_duplicates() {
        List<Integer> input = new ArrayList<>();
        input.add(10);
        input.add(11);
        input.add(12);
        input.add(10);
        input.add(10);
        input.add(11);
        input.add(14);
        List<Integer> result = ListUtils.removeDuplicates(input);
        assertEquals(4, result.size());
    }

}
