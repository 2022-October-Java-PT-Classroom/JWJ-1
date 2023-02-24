package org.example;

public abstract class Polygon implements Shape {
    private int numOfSides;
    private double[] sideLengths;

    public Polygon(int numOfSides, double[] sideLengths) {
        this.numOfSides = numOfSides;
        this.sideLengths = sideLengths;
    }

    public int getNumOfSides() {
        return numOfSides;
    }

    public double[] getSideLengths() {
        return sideLengths;
    }

    }


