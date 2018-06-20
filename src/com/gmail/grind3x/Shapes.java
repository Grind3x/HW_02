package com.gmail.grind3x;

import java.util.Arrays;

public class Shapes {

    public enum ShapeType {
        TRIANGLE, CIRCLE, RECTANGLE
    }

    private Shape[] shapes;

    public Shapes() {
        shapes = new Shape[10];
    }

    public Shapes(int size) {
        shapes = new Shape[size];
    }

    public Shapes(Shape[] shapes) {
        this.shapes = shapes;
    }

    public void init() {
        for (int i = 0; i < shapes.length; i++) {
            int rand = (int) (Math.random() * 3);

            switch (rand) {
                case 0: {
                    shapes[i] = new Circle(new Point(7 + Math.random() * 5, 2 + Math.random() * 5),
                            new Point(-2 + Math.random() * 5, 14 + Math.random() * 5), "blue");
                    break;
                }
                case 1: {
                    shapes[i] = new Triangle(new Point(2 + Math.random() * 5, -5 + Math.random() * 5),
                            new Point(-6 + Math.random() * 5, 1 + Math.random() * 5),
                            new Point(6 + Math.random() * 5, -2 + Math.random() * 5), "green");
                    break;
                }
                case 2: {
                    shapes[i] = new Rectangle(new Point(0 + Math.random() * 5, 0 + Math.random() * 5),
                            new Point(0 + Math.random() * 5, 7 + Math.random() * 5),
                            new Point(9 + Math.random() * 5, 7 + Math.random() * 5),
                            new Point(9, 0), "black");
                    break;
                }
            }
        }
    }

    public double getSummArea() {
        double summArea = 0;
        for (Shape shape : shapes) {
            summArea += shape.calcArea();
        }
        return summArea;
    }

    public double getSummArea(ShapeType shapeType) {
        double summArea = 0;
        switch (shapeType) {
            case TRIANGLE: {
                for (Shape shape : shapes) {
                    if (shape.getClass().equals(Triangle.class)) {
                        summArea += shape.calcArea();
                    }
                }
                break;
            }
            case CIRCLE: {
                for (Shape shape : shapes) {
                    if (shape.getClass().equals(Circle.class)) {
                        summArea += shape.calcArea();
                    }
                }

                break;
            }
            case RECTANGLE: {
                for (Shape shape : shapes) {
                    if (shape.getClass().equals(Rectangle.class)) {
                        summArea += shape.calcArea();
                    }
                }
                break;
            }
        }
        return summArea;
    }

    public void sortByArea() {
        Arrays.sort(shapes, new ShapeAreaComparator());
    }

    public void sortByColor() {
        Arrays.sort(shapes, new ShapeColorComparator());
    }

    public Shape[] getShapes() {
        return shapes;
    }

    public void setShapes(Shape[] shapes) {
        this.shapes = shapes;
    }

    @Override
    public String toString() {
        return "Shapes{" +
                "shapes=" + Arrays.toString(shapes) +
                '}';
    }
}
