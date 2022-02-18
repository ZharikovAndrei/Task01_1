package com.company.task2;

import com.company.view.ViewTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ValueOfTheExpressionTask {

    public void logic() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        double a = Double.parseDouble(bf.readLine());
        double b = Double.parseDouble(bf.readLine());
        double c = Double.parseDouble(bf.readLine());
        ValueOfTheExpression valueOfTheExpression = new ValueOfTheExpression();
        ViewTask.showResult(String.valueOf(valueOfTheExpression.getValueOfTheExpression(a, b, c)));
    }
}
