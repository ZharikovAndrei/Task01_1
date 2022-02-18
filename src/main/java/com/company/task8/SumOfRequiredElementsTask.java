package com.company.task8;

import com.company.data.FillingArray;
import com.company.view.ViewTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOfRequiredElementsTask {

    public void logic() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int[] a = new int[Integer.parseInt(bf.readLine())];
        int k = Integer.parseInt(bf.readLine());
        FillingArray fillingArray = new FillingArray();
        fillingArray.getFilledArray(a, 0, 100);
        SumOfRequiredElements sumOfElements = new SumOfRequiredElements();
        ViewTask.showResult(String.valueOf(sumOfElements.getSumOfRequiredElements(a, k)));
    }
}
