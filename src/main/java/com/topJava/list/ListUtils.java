package com.topJava.list;

import java.util.*;

public class ListUtils {
    public static <E> List<E> removeDuplicates(List<E> list) {
        Set<E> set = new LinkedHashSet<>(list);
        return new ArrayList<>(set);
    }
}
