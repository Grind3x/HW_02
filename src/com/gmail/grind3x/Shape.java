package com.gmail.grind3x;

import com.gmail.grind3x.Drawable;

public abstract class Shape implements Drawable {
    private String shapeColor;

    public Shape() {
    }

    public Shape(String shapeColor) {
        this.shapeColor = shapeColor;
    }

    @Override
    public void draw() {

    }

    public abstract double calcArea();

    public String getShapeColor() {
        return shapeColor;
    }

    public void setShapeColor(String shapeColor) {
        this.shapeColor = shapeColor;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
