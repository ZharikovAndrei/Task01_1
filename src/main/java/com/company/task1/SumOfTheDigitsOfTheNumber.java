package com.company.task1;

public class SumOfTheDigitsOfTheNumber {

    public int getSumOfTheDigitsOfTheNumber(int number, int range) {
        int sum = 0;
        while (number > range) {
            sum = sum + number % 10;
            number = number / 10;
        }
        return sum;
    }
}
