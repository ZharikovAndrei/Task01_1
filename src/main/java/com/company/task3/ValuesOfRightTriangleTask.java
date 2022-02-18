package com.company.task3;

import com.company.view.ViewTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ValuesOfRightTriangleTask {
    public void logic() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        double a = Double.parseDouble(bf.readLine());
        double b = Double.parseDouble(bf.readLine());
        ValuesOfRightTriangle valuesOfRightTriangle = new ValuesOfRightTriangle();
        ViewTask.showResultTask(String.valueOf(valuesOfRightTriangle.getPerimeter(a, b)));
        ViewTask.showResultTask(String.valueOf(valuesOfRightTriangle.getSquare(a, b)));
    }
}
