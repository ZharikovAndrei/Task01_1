package com.company.task8;

public class SumOfElements {

    public int getSumOfElements(int[] A, int K) {
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            if ((A[i] % K) == 0) sum += A[i];
        }
        return sum;
    }
}
