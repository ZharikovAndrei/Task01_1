package com.company.data;

public class FillingArray {

    public void getFilledArray(int[] array, int minValue, int maxValue) {
        if (minValue < 0) {
            maxValue *= 2;
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (maxValue + 1)) + minValue;
        }
    }
}
