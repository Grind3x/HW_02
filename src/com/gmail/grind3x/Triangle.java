package com.gmail.grind3x;

public class Triangle extends Shape {
    private Point pointA;
    private Point pointB;
    private Point pointC;
    private String shapeColor;

    public Triangle() {
    }

    public Triangle(String shapeColor) {
        this.shapeColor = shapeColor;
    }

    public Triangle(Point pointA, Point pointB, Point pointC, String shapeColor) {
        this.pointA = pointA;
        this.pointB = pointB;
        this.pointC = pointC;
        this.shapeColor = shapeColor;
    }

    @Override
    public double calcArea() {
        return (Math.abs((pointB.getX() - pointA.getX()) * (pointC.getY() - pointA.getY()) -
                (pointC.getX() - pointA.getX()) * (pointB.getY() - pointA.getY())) / 2);
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

    public String getShapeColor() {
        return shapeColor;
    }

    public void setShapeColor(String shapeColor) {
        this.shapeColor = shapeColor;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "A(" + pointA +
                "), B(" + pointB +
                "), C(" + pointC +
                "), Color='" + shapeColor + '\'' +
                '}';
    }
}
