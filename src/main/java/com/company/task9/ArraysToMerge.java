package com.company.task9;

import com.company.util.data.ConsoleDataAcquirer;
import com.company.util.data.FillingArray;
import com.company.util.view.ViewTask;

import java.io.IOException;
import java.util.Arrays;

public class ArraysToMerge {

    public void logic() throws IOException {
        ConsoleDataAcquirer consoleDataAcquirer = new ConsoleDataAcquirer();
        int[] firstArray = new int[consoleDataAcquirer.getIntegerNumber()];
        int[] secondArray = new int[consoleDataAcquirer.getIntegerNumber()];
        int k = consoleDataAcquirer.getIntegerNumber();
        FillingArray fillingArray = new FillingArray();
        fillingArray.getFilledArray(firstArray, 0, 10);
        fillingArray.getFilledArray(secondArray, -10, 10);
        MergingArrays mergedArrays = new MergingArrays();
        ViewTask.showResult(Arrays.toString(mergedArrays.getMergedArray(firstArray, secondArray, k)));
    }
}
