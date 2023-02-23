package org.example;

public class Circle extends Shape {

    protected double area;
    protected double perimeter;
    private double radius;

    public Circle(double radius) {
        super();
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
        if (radius > 0) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        return "A Circle with radius=" + radius + ", which is a subclass of " + super.toString();
    }
}

