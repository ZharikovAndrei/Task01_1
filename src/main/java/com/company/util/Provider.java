package com.company.util;

import com.company.task1.SumOfTheDigitsOfTheNumberTask;
import com.company.task2.ValueOfTheExpressionTask;
import com.company.task3.ValuesOfRightTriangleTask;
import com.company.task4.BelongingOfPointTask;
import com.company.task5.ExponentiationTask;
import com.company.task6.SumOfLargestAndSmallestTask;
import com.company.task7.CalculatingFunctionValuesTask;
import com.company.task8.SumOfRequiredElementsTask;
import com.company.task9.MergingArraysTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Provider {

    private static final BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    public static void chooseTask() throws IOException {
        int choice = Integer.parseInt(bf.readLine());
        switch (choice) {
            case 1:
                SumOfTheDigitsOfTheNumberTask sumOfTheDigitsOfTheNumberTask = new SumOfTheDigitsOfTheNumberTask();
                sumOfTheDigitsOfTheNumberTask.logic();
                break;
            case 2:
                ValueOfTheExpressionTask valueOfTheExpressionTask = new ValueOfTheExpressionTask();
                valueOfTheExpressionTask.logic();
                break;
            case 3:
                ValuesOfRightTriangleTask valuesOfRightTriangleTask = new ValuesOfRightTriangleTask();
                valuesOfRightTriangleTask.logic();
                break;
            case 4:
                BelongingOfPointTask belongingOfPointTask = new BelongingOfPointTask();
                belongingOfPointTask.logic();
                break;
            case 5:
                ExponentiationTask exponentiationTask = new ExponentiationTask();
                exponentiationTask.logic();
                break;
            case 6:
                SumOfLargestAndSmallestTask sumOfLargestAndSmallestTask = new SumOfLargestAndSmallestTask();
                sumOfLargestAndSmallestTask.logic();
                break;
            case 7:
                CalculatingFunctionValuesTask calculatingFunctionValuesTask = new CalculatingFunctionValuesTask();
                calculatingFunctionValuesTask.logic();
                break;
            case 8:
                SumOfRequiredElementsTask sumOfRequiredElementsTask = new SumOfRequiredElementsTask();
                sumOfRequiredElementsTask.logic();
                break;
            case 9:
                MergingArraysTask mergingArraysTask = new MergingArraysTask();
                mergingArraysTask.logic();
                break;
            case 10:
                break;
        }
    }
}
