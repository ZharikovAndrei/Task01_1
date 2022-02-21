package com.company.task1;

import com.company.util.data.ConsoleDataAcquirer;
import com.company.util.view.ViewTask;

import java.io.IOException;

public class SumOfTheDigitsOfTheNumber {
    private static final int firstMagicNumber = 0;
    private static final int secondMagicNumber = 99;

    public void logic() throws IOException {
        ConsoleDataAcquirer consoleDataAcquirer = new ConsoleDataAcquirer();
        int number = consoleDataAcquirer.getIntegerNumber();
        CalculateSumOfTheDigitsOfTheNumber sumOfTheDigitsOfTheNumber = new CalculateSumOfTheDigitsOfTheNumber();
        int sumOfAllDigits = sumOfTheDigitsOfTheNumber.getSumOfTheDigitsOfTheNumber(number, firstMagicNumber);
        int sumOfTheLastTwoDigits = sumOfTheDigitsOfTheNumber.getSumOfTheDigitsOfTheNumber(number, secondMagicNumber);
        int sumOfTheFirstTwoDigits = sumOfAllDigits - sumOfTheLastTwoDigits;
        ViewTask.showResult(Boolean.toString(sumOfTheFirstTwoDigits == sumOfTheLastTwoDigits));
    }
}
