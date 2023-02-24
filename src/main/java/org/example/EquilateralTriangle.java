package org.example;

public class EquilateralTriangle extends Triangle {
    public EquilateralTriangle(double side) {
        super(side, side, side);
    }

    @Override
    public double getArea() {
        return (Math.sqrt(3) / 4) * Math.pow(side2, 2);
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public boolean isEquilateral() {
        return true;
    }

    @Override
    public boolean isIsosceles() {
        return true;
    }

    @Override
    public boolean isScalene() {
        return false;
    }
}