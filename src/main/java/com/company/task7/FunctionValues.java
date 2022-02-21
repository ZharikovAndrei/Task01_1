package com.company.task7;

import com.company.util.view.ViewTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FunctionValues {

    public void logic() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bf.readLine());
        int b = Integer.parseInt(bf.readLine());
        int h = Integer.parseInt(bf.readLine());
        CalculateFunctionValues functionValues = new CalculateFunctionValues();
        ViewTask.showResultOfFunction(functionValues.getFunctionValues(a, b, h), a, b, h);
    }
}
