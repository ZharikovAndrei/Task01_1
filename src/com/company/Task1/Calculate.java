package com.company.Task1;

public class Calculate {

    public int sum(int number, int range){
        int sum = 0;
        while (number > range) {
            sum = sum + number % 10;
            number = number / 10;
        }
        return sum;
    }
}