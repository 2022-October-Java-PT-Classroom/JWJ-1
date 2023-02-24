package org.example;

    public abstract class Quadrilateral implements Shape {
        protected double side1;
        protected double side2;
        protected double side3;
        protected double side4;
        protected double perimeter;
        protected double area;

        public Quadrilateral(double s1, double s2, double s3, double s4) {
            this.side1 = s1;
            this.side2 = s2;
            this.side3 = s3;
            this.side4 = s4;
        }

        public Quadrilateral() {

        }

        public double getPerimeter() {
            return perimeter;
        }

        public double getArea() {
            return area;
        }

        public String toString() {
            return "Quadrilateral";
        }
    }

