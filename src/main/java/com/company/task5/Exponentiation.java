package com.company.task5;

import com.company.util.data.ConsoleDataAcquirer;
import com.company.util.view.ViewTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exponentiation {

    public void logic() throws IOException {
        ConsoleDataAcquirer consoleDataAcquirer = new ConsoleDataAcquirer();
        double firstNumber = consoleDataAcquirer.getDoublerNumber();
        double secondNumber = consoleDataAcquirer.getDoublerNumber();
        double thirdNumber = consoleDataAcquirer.getDoublerNumber();
        CalculateExponentiation exponentiation = new CalculateExponentiation();
        ViewTask.showResult(exponentiation.getExponentiation(firstNumber, secondNumber, thirdNumber));
    }
}
