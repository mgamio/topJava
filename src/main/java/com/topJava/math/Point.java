package com.topJava.math;

public class Point {
    final double x;
    final double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point point) {
        if (this == null || point == null)
            throw new RuntimeException("Points are not initialized");

        double dx = this.x - point.x;
        double dy = this.y - point.y;

        return Math.sqrt(dx*dx +  dy*dy);
    }


}
