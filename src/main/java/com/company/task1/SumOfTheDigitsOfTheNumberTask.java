package com.company.task1;

import com.company.view.ViewTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOfTheDigitsOfTheNumberTask {

    public void logic() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(bf.readLine());
        SumOfTheDigitsOfTheNumber sumOfTheDigitsOfTheNumber = new SumOfTheDigitsOfTheNumber();
        int sumOfAllDigits = sumOfTheDigitsOfTheNumber.getSumOfTheDigitsOfTheNumber(number, 0);
        int sumOfTheLastTwoDigits = sumOfTheDigitsOfTheNumber.getSumOfTheDigitsOfTheNumber(number, 99);
        int sumOfTheFirstTwoDigits = sumOfAllDigits - sumOfTheLastTwoDigits;
        ViewTask.showResult(Boolean.toString(sumOfTheFirstTwoDigits == sumOfTheLastTwoDigits));
    }
}
