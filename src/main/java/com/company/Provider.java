package com.company;

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
                SumOfTheDigitsOfTheNumberTask task1 = new SumOfTheDigitsOfTheNumberTask();
                task1.logic();
                break;
            case 2:
                ValueOfTheExpressionTask task2 = new ValueOfTheExpressionTask();
                task2.logic();
                break;
            case 3:
                ValuesOfRightTriangleTask task3 = new ValuesOfRightTriangleTask();
                task3.logic();
                break;
            case 4:
                BelongingOfPointTask task4 = new BelongingOfPointTask();
                task4.logic();
                break;
            case 5:
                ExponentiationTask task5 = new ExponentiationTask();
                task5.logic();
                break;
            case 6:
                SumOfLargestAndSmallestTask task6 = new SumOfLargestAndSmallestTask();
                task6.logic();
                break;
            case 7:
                CalculatingFunctionValuesTask task7 = new CalculatingFunctionValuesTask();
                task7.logic();
                break;
            case 8:
                SumOfRequiredElementsTask task8 = new SumOfRequiredElementsTask();
                task8.logic();
                break;
            case 9:
                MergingArraysTask task9 = new MergingArraysTask();
                task9.logic();
                break;
            case 10:
                break;
        }
    }
}
