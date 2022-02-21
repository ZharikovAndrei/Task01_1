package com.company.util;

import com.company.task1.SumOfTheDigitsOfTheNumber;
import com.company.task2.ValueOfTheExpression;
import com.company.task3.ValuesOfRightTriangle;
import com.company.task4.BelongingOfPoint;
import com.company.task5.Exponentiation;
import com.company.task6.SumOfLargestAndSmallest;
import com.company.task7.FunctionValues;
import com.company.task8.SumOfRequiredElements;
import com.company.task9.ArraysToMerge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Provider {

    private static final BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    public static void chooseTask() throws IOException {
        int choice = Integer.parseInt(bf.readLine());
        switch (choice) {
            case 1:
                SumOfTheDigitsOfTheNumber sumOfTheDigitsOfTheNumberTask = new SumOfTheDigitsOfTheNumber();
                sumOfTheDigitsOfTheNumberTask.logic();
                break;
            case 2:
                ValueOfTheExpression valueOfTheExpressionTask = new ValueOfTheExpression();
                valueOfTheExpressionTask.logic();
                break;
            case 3:
                ValuesOfRightTriangle valuesOfRightTriangleTask = new ValuesOfRightTriangle();
                valuesOfRightTriangleTask.logic();
                break;
            case 4:
                BelongingOfPoint belongingOfPointTask = new BelongingOfPoint();
                belongingOfPointTask.logic();
                break;
            case 5:
                Exponentiation exponentiationTask = new Exponentiation();
                exponentiationTask.logic();
                break;
            case 6:
                SumOfLargestAndSmallest sumOfLargestAndSmallestTask = new SumOfLargestAndSmallest();
                sumOfLargestAndSmallestTask.logic();
                break;
            case 7:
                FunctionValues calculatingFunctionValuesTask = new FunctionValues();
                calculatingFunctionValuesTask.logic();
                break;
            case 8:
                SumOfRequiredElements sumOfRequiredElementsTask = new SumOfRequiredElements();
                sumOfRequiredElementsTask.logic();
                break;
            case 9:
                ArraysToMerge mergingArraysTask = new ArraysToMerge();
                mergingArraysTask.logic();
                break;
            case 10:
                break;
        }
    }
}
