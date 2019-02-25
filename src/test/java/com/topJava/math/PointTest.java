package com.topJava.math;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class PointTest {

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void when_Points_are_null_then_throws_exception() {
        Point point1 = null;
        Point point2 = null;
        exception.expect(RuntimeException.class);
        point1.distance(point2);
    }

    @Test
    public void when_Points_are_instances_then_distance_should_return_a_valid_value() {
        Point point1 = new Point(2,3);
        Point point2 = new Point(5,7);
        assertEquals(5, point1.distance(point2), 0);
    }

}
