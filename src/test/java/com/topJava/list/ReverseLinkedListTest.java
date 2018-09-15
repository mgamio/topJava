package com.topJava.list;

import static org.junit.Assert.*;

import org.junit.Test;


public class ReverseLinkedListTest {

    @Test
    public void reverseEmptyList() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.reverse();
        assertEquals("[]", linkedList.toString());
    }

    @Test
    public void reverseLinkedList() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("s1");
        linkedList.add("s2");
        linkedList.add("s3");
        linkedList.add("s4");
        linkedList.reverse();
        assertEquals("[s4 -> s3 -> s2 -> s1]", linkedList.toString());

    }
}
