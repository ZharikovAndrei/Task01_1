package com.company.task2;

import com.company.util.data.ConsoleDataAcquirer;
import com.company.util.view.ViewTask;

import java.io.IOException;

public class ValueOfTheExpression {

    public void logic() throws IOException {
        ConsoleDataAcquirer consoleDataAcquirer = new ConsoleDataAcquirer();
        double a = consoleDataAcquirer.getDoublerNumber();
        double b = consoleDataAcquirer.getDoublerNumber();
        double c = consoleDataAcquirer.getDoublerNumber();
        CalculateValueOfTheExpression valueOfTheExpression = new CalculateValueOfTheExpression();
        ViewTask.showResult(String.valueOf(valueOfTheExpression.getValueOfTheExpression(a, b, c)));
    }
}
