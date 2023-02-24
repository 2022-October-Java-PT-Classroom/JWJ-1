package org.example;

public class IsoscelesTriangle extends Triangle {
    private double base;

    public IsoscelesTriangle(double equalSide, double base) {
        super(equalSide, equalSide, base);
        this.base = base;
    }

    @Override
    public double getArea() {
        double height = Math.sqrt(Math.pow(side1, 2) - Math.pow(side3 / 2, 2));
        return (base * height) / 2;
    }

    @Override
    public double getPerimeter() {
        return 2 * side1 + side3;
    }

    @Override
    public boolean isEquilateral() {
        return false;
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

