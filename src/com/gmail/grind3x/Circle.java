package com.gmail.grind3x;

public class Circle extends Shape {
    private Point pointA;
    private Point pointB;

    private String shapeColor;

    public Circle() {
    }

    public Circle(String shapeColor) {
        this.shapeColor = shapeColor;
    }

    public Circle(Point pointA, Point pointB, String shapeColor) {
        this.pointA = pointA;
        this.pointB = pointB;
        this.shapeColor = shapeColor;
    }

    @Override
    public double calcArea() {
        return Math.PI * (getRadius() * getRadius());
    }

    private double getRadius() {
        return pointA.getDistance(pointB);
    }

    public Point getPointA() {
        return pointA;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public String getShapeColor() {
        return shapeColor;
    }

    public void setShapeColor(String shapeColor) {
        this.shapeColor = shapeColor;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "A(" + pointA +
                "), B(" + pointB +
                "), Color='" + shapeColor + '\'' +
                '}';
    }
}
