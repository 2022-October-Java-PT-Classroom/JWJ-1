package org.example;

import java.awt.geom.Area;

public class Circle extends Shape {

    protected double area;
    protected double perimeter;
    private double radius;

    public Circle(double radius, double area, double perimeter) {
        this.radius = radius;
        this.area = area;
        this.perimeter = perimeter;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return area;

    }

    public double getPerimeter() {
        return perimeter;

    }

    public boolean isCircle() {
        return true;

    }

    public String toString() {
        return "A circle with radius" + radius
    }
}

