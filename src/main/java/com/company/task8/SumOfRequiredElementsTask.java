package com.company.task8;

import com.company.view.ViewTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOfRequiredElementsTask {

    public void logic() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(bf.readLine());
        int n = Integer.parseInt(bf.readLine());
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 1000) + 1;
        }
        SumOfRequiredElements sumOfElements = new SumOfRequiredElements();
        ViewTask.showResultTask(String.valueOf(sumOfElements.getSumOfRequiredElements(a, k)));
    }
}
