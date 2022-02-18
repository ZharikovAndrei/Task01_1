package com.company.task9;

public class MergedArrays {

    public int[] getMergedArrays(int[] firstArray, int[] secondArray, int k) {
        int[] mergedArray = new int[firstArray.length + secondArray.length];
        int p = 0;
        for (int i = 0; i < firstArray.length + secondArray.length; i++, p++) {
            if (i == k) {
                for (int j = 0; j < secondArray.length; j++) {
                    mergedArray[i] = secondArray[j];
                    i++;
                }
                mergedArray[i] = firstArray[p];
            }
            mergedArray[i] = firstArray[p];
        }
        return mergedArray;
    }
}
