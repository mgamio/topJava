package com.topJava.sort;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;

public class BubbleSortingTest {

    BubbleSorting bubbleSorting;

    @Before
    public void Before() {
        bubbleSorting = new BubbleSorting();
    }

    @Test
    public void sortingArrays() {

        final int[] numbers = {6, 4, 9, 5};
        final int[] expected = {4, 5, 6, 9};

        int[] numbersSorted = bubbleSorting.sort(numbers);
        for (int i=0; i<numbersSorted.length; i++) {
            System.out.print(numbersSorted[i] + ", ");
        }

        assertArrayEquals(expected, numbersSorted);
    }

    @Test
    public void sortEmptyArray() {
        bubbleSorting.sort(null);
    }

    @Test
    public void sortOneElementArray() {
        final int[] array = {7};
        bubbleSorting.sort(array);
        assertEquals(7, array[0]);
    }

    @Test
    public void sortManyElementArray() {
        final int[] array = {7,9,1,4,9,12,4,13,9};
        final int[] expected = {1,4,4,7,9,9,9,12,13};
        bubbleSorting.sort(array);
        assertArrayEquals(expected, array);
    }

}
