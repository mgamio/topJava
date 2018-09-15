package com.topJava.list;

import org.springframework.util.comparator.ComparableComparator;

import java.util.*;

public class ListUtils2 {
    public static <E extends Comparable<E>> List<E> removeDuplicatesAndOrder(List<E> list) {
        Set<E> set = new LinkedHashSet<>(list);
        ArrayList<E> arrayList = new ArrayList<>(set);
        Collections.sort(arrayList);
        return arrayList;
    }
}
