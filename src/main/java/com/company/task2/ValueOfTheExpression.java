package com.company.task2;

import com.company.util.view.ViewTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ValueOfTheExpression {

    public void logic() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        double a = Double.parseDouble(bf.readLine());
        double b = Double.parseDouble(bf.readLine());
        double c = Double.parseDouble(bf.readLine());
        CalculateValueOfTheExpression valueOfTheExpression = new CalculateValueOfTheExpression();
        ViewTask.showResult(String.valueOf(valueOfTheExpression.getValueOfTheExpression(a, b, c)));
    }
}
