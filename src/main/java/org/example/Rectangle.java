package org.example;

public class Rectangle extends Quadrilateral {
    private double width;
    private double length;

    public Rectangle(double width, double length) {
        super(width, length, width, length);
        this.width = width;
        this.length = length;
        this.perimeter = 2 * (width + length);
        this.area = width * length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public String toString() {
        return "Rectangle";
    }

    public boolean isRectangle() {
        return true;
    }
}




