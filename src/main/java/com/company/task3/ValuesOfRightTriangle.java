package com.company.task3;

public class ValuesOfRightTriangle {

    public double getSquare(double a, double b) {
        return 0.5 * a * b;
    }

    public double getPerimeter(double a, double b) {
        return a + b + Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }
}
