package com.gmail.grind3x;

public class Point {
    private double x;
    private double y;

    public Point() {
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getDistance(Point point) {
        return Math.sqrt((point.getX() - this.getX()) * (point.getX() - this.getX()) +
                ((point.getY() - this.getY()) * (point.getY() - this.getY())));
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return String.format("%.2f", x) + "; " + String.format("%.2f", y);
    }
}