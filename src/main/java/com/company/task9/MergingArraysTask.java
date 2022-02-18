package com.company.task9;

import com.company.view.ViewTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MergingArraysTask {

    public void logic() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int arrayLength = Integer.parseInt(bf.readLine());
        int N2 = Integer.parseInt(bf.readLine());
        int k = Integer.parseInt(bf.readLine());
        int[] a = new int[arrayLength];
        int[] b = new int[N2];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 10) + 1;
        }
        for (int i = 0; i < b.length; i++) {
            b[i] = (int) (Math.random() * 10) + 1;
        }
        MergedArrays mergedArrays = new MergedArrays();
        ViewTask.showResultTask(Arrays.toString(mergedArrays.getMergedArrays(a, b, k)));
    }
}
