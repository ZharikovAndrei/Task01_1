package com.company.Task2;

import com.company.Task1.Calculate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {

    public void logic() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        double a = Double.parseDouble(bf.readLine());
        double b = Double.parseDouble(bf.readLine());
        double c = Double.parseDouble(bf.readLine());
        GetAnswer getAnswer = new GetAnswer();
        System.out.println(getAnswer.getAnswer(a, b, c));

    }
}
