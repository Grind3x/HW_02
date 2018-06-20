package com.gmail.grind3x;

public class Main {
    public static void main(String[] args) {
        Shapes shapes = new Shapes();
        shapes.init();

        System.out.println("Summ area = " + String.format("%.2f", shapes.getSummArea()));
        System.out.println("Summ area of circles = " + String.format("%.2f", shapes.getSummArea(Shapes.ShapeType.CIRCLE)));
        System.out.println("Summ area of triangles = " + String.format("%.2f", shapes.getSummArea(Shapes.ShapeType.TRIANGLE)));
        System.out.println("Summ area of rectangles = " + String.format("%.2f", shapes.getSummArea(Shapes.ShapeType.RECTANGLE)));

        shapes.sortByArea();
        System.out.println("Sorted by area " + shapes);

        shapes.sortByColor();
        System.out.println("Sorted by color " + shapes);
    }

}


