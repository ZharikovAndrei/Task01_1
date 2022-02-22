package com.company.task8;

import com.company.util.data.ConsoleDataAcquirer;
import com.company.util.data.FillingArray;
import com.company.util.view.ViewTask;

import java.io.IOException;

public class SumOfRequiredElements {

    public void logic() throws IOException {
        ConsoleDataAcquirer consoleDataAcquirer = new ConsoleDataAcquirer();
        int[] a = new int[consoleDataAcquirer.getIntegerNumber()];
        int k = consoleDataAcquirer.getIntegerNumber();
        FillingArray fillingArray = new FillingArray();
        fillingArray.getFilledArray(a, 0, 100);
        CalculateSumOfRequiredElements sumOfElements = new CalculateSumOfRequiredElements();
        ViewTask.showResult(String.valueOf(sumOfElements.getSumOfRequiredElements(a, k)));
    }
}
