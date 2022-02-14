package com.company.task9;

public class MergeArrays {

    public int[] getMergeArrays(int[] A, int[] B, int k) {
        int[] mergedArray = new int[A.length + B.length];
        /*for (int i = 0; i < A.length + B.length; i++) {
            if (i == k) {
                for (int j = 0; j < B.length; j++, i++) {
                    mergedArray[i] = B[j];
                }
            } else mergedArray[i] = A[i];
        }*/
        for (int i = 0; i < A.length + B.length; i++) {
            for (int j = 0; j < A.length; j++, i++) {
                if (j == k) {
                    for (int y = 0; y < B.length; y++, i++) {
                        mergedArray[i] = B[y];
                    }
                } else {
                    mergedArray[i] = A[j];
                }
            }
        }
        return mergedArray;
    }
}
