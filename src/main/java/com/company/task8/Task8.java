package com.company.task8;

import com.company.view.ViewTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task8 {

    public void logic() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(bf.readLine());
        int N = Integer.parseInt(bf.readLine());
        int[] A = new int[N];
        for (int i = 0; i < A.length - 1; i++){
            A[i] = (int) (Math.random() * 1000) + 1;
        }
        SumOfElements sumOfElements = new SumOfElements();
        ViewTask.showResultTask(String.valueOf(sumOfElements.getSumOfElements(A, K)));
    }
}
