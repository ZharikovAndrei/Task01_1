package com.company.task9;

import com.company.util.data.FillingArray;
import com.company.util.view.ViewTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MergingArraysTask {

    public void logic() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int[] firstArray = new int[Integer.parseInt(bf.readLine())];
        int[] secondArray = new int[Integer.parseInt(bf.readLine())];
        int k = Integer.parseInt(bf.readLine());
        FillingArray fillingArray = new FillingArray();
        fillingArray.getFilledArray(firstArray, 0, 10);
        fillingArray.getFilledArray(secondArray, -10, 10);
        MergedArrays mergedArrays = new MergedArrays();
        ViewTask.showResult(Arrays.toString(mergedArrays.getMergedArrays(firstArray, secondArray, k)));
    }
}
