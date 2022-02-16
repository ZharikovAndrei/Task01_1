package com.company.task9;

public class MergeArrays {

    public int[] getMergeArrays(int[] A, int[] B, int k) {
        int[] mergedArray = new int[A.length + B.length];
        int p = 0;
        for (int i = 0; i < A.length + B.length; i++, p++) {
            if (i == k) {
                for (int j = 0; j < B.length; j++) {
                    mergedArray[i] = B[j];
                    i++;
                }
                mergedArray[i] = A[p];
            }
            mergedArray[i] = A[p];
        }
        return mergedArray;
    }
}
