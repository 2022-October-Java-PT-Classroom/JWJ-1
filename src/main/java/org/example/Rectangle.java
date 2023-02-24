package org.example;

public class Rectangle extends Polygon {
    public Rectangle(double length, double width) {
        super(4, new double[] {length, width, length, width});
    }

    @Override
    public double getArea() {
        return getSideLengths()[0] * getSideLengths()[1];
    }

    @Override
    public double getPerimeter() {
        return 2 * (getSideLengths()[0] + getSideLengths()[1]);
    }

    public boolean isRectangle() {
        return true;
    }
    @Override
    public String toString() {
        return "A Rectangle with sides " + getSideLengths()[0] + " and " + getSideLengths()[1] + ", which is a subclass of " + super.toString();
    }
}




