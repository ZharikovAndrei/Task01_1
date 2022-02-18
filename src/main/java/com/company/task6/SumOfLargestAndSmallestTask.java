package com.company.task6;

import com.company.view.ViewTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOfLargestAndSmallestTask {

    public void logic() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        double firstNumber = Double.parseDouble(bf.readLine());
        double secondNumber = Double.parseDouble(bf.readLine());
        double thirdNumber = Double.parseDouble(bf.readLine());
        SumOfLargestAndSmallest sum = new SumOfLargestAndSmallest();
        ViewTask.showResult(String.valueOf(sum.getSumOfLargestAndSmallest(firstNumber, secondNumber, thirdNumber)));
    }
}
