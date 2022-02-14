package com.company.task3;

import com.company.view.ViewTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3 {
    public void logic() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        double a = Double.parseDouble(bf.readLine());
        double b = Double.parseDouble(bf.readLine());
        Perimeter calculatingPerimeter = new Perimeter();
        ViewTask.showResultTask(String.valueOf(calculatingPerimeter.getPerimeter(a, b)));
        Square calculatingSquare = new Square();
        ViewTask.showResultTask(String.valueOf(calculatingSquare.getSquare(a, b)));
    }
}
