package com.company.util.view;

public class ViewTask {

    public static void showResult(String result) {
        System.out.println(result);
    }

    public static void showResultOfFunction(double[] answer, int a, int b, int h) {
        for (int x = a, i = 0; x <= b; x += h, i++) {
            System.out.println(x + "   " + answer[i]);
        }
    }
}
