package com.company.task6;

public class SumOfLargeAndSmall {

    public double getSum(double a, double b, double c) {
        double smallest;
        double biggest;
        if (a > b) {
            if (a > c) {
                biggest = a;
                smallest = Math.min(b, c);
            } else {
                biggest = c;
                smallest = Math.min(a, b);
            }
        } else {
            if (b > c) {
                biggest = b;
                smallest = Math.min(a, c);
            } else {
                biggest = c;
                smallest = Math.min(a, b);
            }
        }
        return biggest + smallest;
    }
}
