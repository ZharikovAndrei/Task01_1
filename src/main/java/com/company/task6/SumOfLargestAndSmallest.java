package com.company.task6;

import com.company.util.data.ConsoleDataAcquirer;
import com.company.util.view.ViewTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOfLargestAndSmallest {

    public void logic() throws IOException {
        ConsoleDataAcquirer consoleDataAcquirer = new ConsoleDataAcquirer();
        double firstNumber = consoleDataAcquirer.getDoublerNumber();
        double secondNumber = consoleDataAcquirer.getDoublerNumber();
        double thirdNumber = consoleDataAcquirer.getDoublerNumber();
        CalculateSumOfLargestAndSmallest sum = new CalculateSumOfLargestAndSmallest();
        ViewTask.showResult(String.valueOf(sum.getSumOfLargestAndSmallest(firstNumber, secondNumber, thirdNumber)));
    }
}
