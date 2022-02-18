package com.company.task7;

import java.util.Arrays;

public class FunctionValues {

    public double[] getFunctionValues(int a, int b, int h) {
        double[] answer = new double[((b - a) / h) + 1];
        for (int x = a, i = 0; x <= b; x += h, i++) {
            answer[i] = Math.pow(Math.sin(x), 2) - Math.cos(2 * x);
        }
        return answer;
    }
}
