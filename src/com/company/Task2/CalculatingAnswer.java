package com.company.Task2;

public class CalculatingAnswer {

    public double getAnswer(double a, double b, double c){
        return (b + Math.sqrt(Math.pow(b, 2) + 4*a*c))/2-Math.pow(a, 3)*c+Math.pow(b, -2);
    }
}
