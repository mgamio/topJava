package com.topJava.stack;

import java.util.Stack;

public class StackApp {



    public static void main(String args[]) {
        System.out.println("hello world");

        Stack stack = new Stack();

        String uno = (String) stack.push("uno");

        String dos = (String) stack.push("dos");

        stack.push(4);

        System.out.println("pull " + stack.pop());
        System.out.println("pull " + stack.pop());
        System.out.println("elements " + stack.size());
        System.out.println("isEmpty " + stack.isEmpty());

    }
}
