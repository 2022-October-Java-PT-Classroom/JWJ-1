package org.example;

public class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle(double width, double length) {
        super();
        this.width = 3.0;
        this.length = 4.0;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getArea() {
        return width * length;
    }

    public double getPerimeter() {
        return 2 * (width + length);
    }

    public double getDiagonal() {
        return Math.sqrt(Math.pow(width, 2) + Math.pow(length, 2));
    }

    public boolean isRectangle() {
        return width != length;
    }

    public String toString() {
        return "A rectangle with width=" + width + " and length=" + length + ", which is a subclass of " + super.toString();
    }
}



