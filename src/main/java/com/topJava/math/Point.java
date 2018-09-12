package com.topJava.math;

public class Point {
    final double x;
    final double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point point2) {
        if (this == null || point2 == null)
            throw new RuntimeException("Points are not initialized");

        double dx = this.x - point2.x;
        double dy = this.y - point2.y;

        return Math.sqrt(dx*dx +  dy*dy);
    }


}
