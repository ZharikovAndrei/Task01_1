package com.company.task6;

import com.company.view.ViewTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task6 {

    public void logic() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        double firstNumber = Double.parseDouble(bf.readLine());
        double secondNumber = Double.parseDouble(bf.readLine());
        double thirdNumber = Double.parseDouble(bf.readLine());
        SumOfLargeAndSmall sum = new SumOfLargeAndSmall();
        ViewTask.showResultTask(String.valueOf(sum.getSum(firstNumber, secondNumber, thirdNumber)));
    }
}
