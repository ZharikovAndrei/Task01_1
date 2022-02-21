package com.company.task1;

import com.company.util.view.ViewTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOfTheDigitsOfTheNumber {
    private static final int firstMagicNumber = 0;
    private static final int secondMagicNumber = 99;

    public void logic() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(bf.readLine());
        CalculateSumOfTheDigitsOfTheNumber sumOfTheDigitsOfTheNumber = new CalculateSumOfTheDigitsOfTheNumber();
        int sumOfAllDigits = sumOfTheDigitsOfTheNumber.getSumOfTheDigitsOfTheNumber(number, firstMagicNumber);
        int sumOfTheLastTwoDigits = sumOfTheDigitsOfTheNumber.getSumOfTheDigitsOfTheNumber(number, secondMagicNumber);
        int sumOfTheFirstTwoDigits = sumOfAllDigits - sumOfTheLastTwoDigits;
        ViewTask.showResult(Boolean.toString(sumOfTheFirstTwoDigits == sumOfTheLastTwoDigits));
    }
}
