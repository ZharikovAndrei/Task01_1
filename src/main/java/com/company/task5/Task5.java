package com.company.task5;

import com.company.view.ViewTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task5 {

    public void logic() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        double firstNumber = Double.parseDouble(bf.readLine());
        double secondNumber = Double.parseDouble(bf.readLine());
        double thirdNumber = Double.parseDouble(bf.readLine());
        Exponentiation exponentiation = new Exponentiation();
        ViewTask.showResultTask(exponentiation.getExponentiation(firstNumber, secondNumber, thirdNumber));
    }
}
