package org.example;

public class Square extends Polygon {
    public Square(double sideLength) {
        super(4, new double[] {sideLength, sideLength, sideLength, sideLength});
    }

    @Override
    public double getArea() {
        return Math.pow(getSideLengths()[0], 2);
    }

    @Override
    public double getPerimeter() {
        return 4 * getSideLengths()[0];
    }

    public boolean isSquare() {
        return true;
    }

    @Override
    public String toString() {
        return "A Square with side " + getSideLengths()[0] + ", which is a subclass of " + super.toString();
    }
}

