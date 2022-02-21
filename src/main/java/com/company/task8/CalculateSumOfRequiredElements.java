package com.company.task8;

public class CalculateSumOfRequiredElements {

    public int getSumOfRequiredElements(int[] a, int k) {
        int sum = 0;
        for (int j : a) {
            if ((j % k) == 0) {
                sum += j;
            }
        }
        return sum;
    }
}
