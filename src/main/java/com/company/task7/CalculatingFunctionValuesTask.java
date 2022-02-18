package com.company.task7;

import com.company.view.ViewTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalculatingFunctionValuesTask {

    public void logic() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bf.readLine());
        int b = Integer.parseInt(bf.readLine());
        int h = Integer.parseInt(bf.readLine());
        FunctionValues functionValues = new FunctionValues();
        ViewTask.showResultOfFunction(functionValues.getFunctionValues(a, b, h), a, b, h);
    }
}
