package com.topJava.list;

import java.util.StringJoiner;

public class LinkedList<T> {

    Node head;

    private class Node {
        final T value;
        Node next;

        Node(T value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public void add(T value) {
        Node node = new Node(value, null);
        if (head == null) {
            head = node;
        } else {
            Node last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = node;
        }
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(" -> ", "[", "]");
        Node last = head;
        while (last != null) {
            joiner.add(last.value.toString());
            last = last.next;
        }
        return joiner.toString();
    }

    public void reverse() {
        if (head == null) {
            return;
        }
        Node p1 = head;
        Node p2;

        while (p1.next != null) {
            p2 = p1.next;
            p1.next = p2.next;
            p2.next = head;
            head = p2;
        }
    }
}
