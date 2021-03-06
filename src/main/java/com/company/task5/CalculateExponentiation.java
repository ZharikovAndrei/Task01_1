package com.company.task5;

import java.util.Arrays;

public class CalculateExponentiation {
    public String getExponentiation(double... number) {
        for (int i = 0; i < number.length; i++) {
            if (number[i] >= 0) {
                number[i] = Math.pow(number[i], 2);
            } else {
                number[i] = Math.pow(number[i], 4);
            }
        }
        return Arrays.toString(number);
    }
}
