package com.company.task2;

import com.company.view.ViewTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {

    public void logic() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        double a = Double.parseDouble(bf.readLine());
        double b = Double.parseDouble(bf.readLine());
        double c = Double.parseDouble(bf.readLine());
        CalculatingAnswer getAnswer = new CalculatingAnswer();
        ViewTask.showResultTask(String.valueOf(getAnswer.getAnswer(a, b, c)));
    }
}
