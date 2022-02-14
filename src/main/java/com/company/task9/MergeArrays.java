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
        boolean check = false;
        for (int i = 0; i < A.length + B.length; i++) {
            for (int j = 0; j < A.length; j++, i++) {
                if (j == k) {
                    for (int y = 0; y < B.length; y++, i++) {
                        mergedArray[i] = B[y];
                    }
                    i--;
                    check = true;
                } else {
                    if(!check) {
                        mergedArray[i] = A[j];
                    } else {
                        mergedArray[i] = A[j - 1];
                    }
                }
            }
            mergedArray[A.length + B.length - 1] = A[A.length - 1];
        }
        return mergedArray;
    }
}
