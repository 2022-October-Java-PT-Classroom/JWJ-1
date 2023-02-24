package org.example;

public class Square extends Quadrilateral {
    private double side;

    public Square(double side) {
        super(side, side, side, side);
        this.side = side;
        this.perimeter = 4 * side;
        this.area = Math.pow(side, 2);
    }

    public double getSide() {
        return side;
    }

    public boolean isSquare() {
        return side1 == side2 && side2 == side3 && side3 == side4 && side4 == side;
    }

    public String toString() {
        return "Square";
    }
}
