package org.example;

    public abstract class Triangle extends Polygon {

        protected double side1;
        protected double side2;
        protected double side3;
        public Triangle(double side1, double side2, double side3) {
            super(3, new double[] {side1, side2, side3});
        }

        public double getSide1() {
            return getSideLengths()[0];
        }

        public double getSide2() {
            return getSideLengths()[1];
        }

        public double getSide3() {
            return getSideLengths()[2];
        }

        public boolean isTriangle() {
            return true;
        }

        public abstract boolean isEquilateral();

        public abstract boolean isIsosceles();

        public abstract boolean isScalene();
    }

