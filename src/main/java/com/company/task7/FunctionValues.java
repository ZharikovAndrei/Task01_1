package com.company.task7;

import com.company.util.data.ConsoleDataAcquirer;
import com.company.util.view.ViewTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FunctionValues {

    public void logic() throws IOException {
        ConsoleDataAcquirer consoleDataAcquirer = new ConsoleDataAcquirer();
        int a = consoleDataAcquirer.getIntegerNumber();
        int b = consoleDataAcquirer.getIntegerNumber();
        int h = consoleDataAcquirer.getIntegerNumber();
        CalculateFunctionValues functionValues = new CalculateFunctionValues();
        ViewTask.showResultOfFunction(functionValues.getFunctionValues(a, b, h), a, b, h);
    }
}
