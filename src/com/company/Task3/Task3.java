package com.company.Task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3 {
    public void logic() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        double a = Double.parseDouble(bf.readLine());
        double b = Double.parseDouble(bf.readLine());
        Perimeter calculatingPerimeter = new Perimeter();
        System.out.println(calculatingPerimeter.getPerimeter(a, b));
        Square calculatingSquare = new Square();
        System.out.println(calculatingSquare.getSquare(a, b));
    }
}
