package com.company.task3;

import com.company.util.data.ConsoleDataAcquirer;
import com.company.util.view.ViewTask;

import java.io.IOException;

public class ValuesOfRightTriangle {
    public void logic() throws IOException {
        ConsoleDataAcquirer consoleDataAcquirer = new ConsoleDataAcquirer();
        double a = consoleDataAcquirer.getDoublerNumber();
        double b = consoleDataAcquirer.getDoublerNumber();
        CalculateValuesOfRightTriangle valuesOfRightTriangle = new CalculateValuesOfRightTriangle();
        ViewTask.showResult(String.valueOf(valuesOfRightTriangle.getPerimeter(a, b)));
        ViewTask.showResult(String.valueOf(valuesOfRightTriangle.getSquare(a, b)));
    }
}
