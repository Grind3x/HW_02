package com.gmail.grind3x;

public class Rectangle extends Shape {
    private Point pointA;
    private Point pointB;
    private Point pointC;
    private Point pointD;
    private String shapeColor;

    public Rectangle() {
    }

    public Rectangle(String shapeColor) {
        this.shapeColor = shapeColor;
    }

    public Rectangle(Point pointA, Point pointB, Point pointC, Point pointD, String shapeColor) {
        this.pointA = pointA;
        this.pointB = pointB;
        this.pointC = pointC;
        this.pointD = pointD;
        this.shapeColor = shapeColor;
    }

    @Override
    public double calcArea() {
        return pointA.getDistance(pointB) * pointB.getDistance(pointC);
    }

    public String getShapeColor() {
        return shapeColor;
    }

    public void setShapeColor(String shapeColor) {
        this.shapeColor = shapeColor;
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

    public Point getPointC() {
        return pointC;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }

    public Point getPointD() {
        return pointD;
    }

    public void setPointD(Point pointD) {
        this.pointD = pointD;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "A(=" + pointA +
                "), B(" + pointB +
                "), C(" + pointC +
                "), D(" + pointD +
                "), Color='" + shapeColor + '\'' +
                '}';
    }
}
