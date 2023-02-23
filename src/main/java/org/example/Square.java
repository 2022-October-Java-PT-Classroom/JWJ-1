package org.example;

public class Square extends Rectangle {

    public Square(double side) {
        super(side, side);
    }

    public boolean isSquare() {
        return getWidth() == getLength();
    }

    @Override
    public String toString() {
        return "A Square with side=" + getWidth() + ", which is a subclass of " + super.toString();
    }
}
