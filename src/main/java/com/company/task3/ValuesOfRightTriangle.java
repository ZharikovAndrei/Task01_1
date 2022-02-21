package com.company.task3;

import com.company.util.view.ViewTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ValuesOfRightTriangle {
    public void logic() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        double a = Double.parseDouble(bf.readLine());
        double b = Double.parseDouble(bf.readLine());
        CalculateValuesOfRightTriangle valuesOfRightTriangle = new CalculateValuesOfRightTriangle();
        ViewTask.showResult(String.valueOf(valuesOfRightTriangle.getPerimeter(a, b)));
        ViewTask.showResult(String.valueOf(valuesOfRightTriangle.getSquare(a, b)));
    }
}
