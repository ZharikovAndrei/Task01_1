package com.company.task5;

import com.company.util.view.ViewTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exponentiation {

    public void logic() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        double firstNumber = Double.parseDouble(bf.readLine());
        double secondNumber = Double.parseDouble(bf.readLine());
        double thirdNumber = Double.parseDouble(bf.readLine());
        CalculateExponentiation exponentiation = new CalculateExponentiation();
        ViewTask.showResult(exponentiation.getExponentiation(firstNumber, secondNumber, thirdNumber));
    }
}
