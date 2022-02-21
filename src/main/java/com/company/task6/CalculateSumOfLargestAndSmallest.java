package com.company.task6;

public class CalculateSumOfLargestAndSmallest {

    public double getSumOfLargestAndSmallest(double firstNumber, double secondNumber, double thirdNumber) {
        double smallest;
        double largest;
        if (firstNumber > secondNumber) {
            if (firstNumber > thirdNumber) {
                largest = firstNumber;
                smallest = Math.min(secondNumber, thirdNumber);
            } else {
                largest = thirdNumber;
                smallest = Math.min(firstNumber, secondNumber);
            }
        } else {
            if (secondNumber > thirdNumber) {
                largest = secondNumber;
                smallest = Math.min(firstNumber, thirdNumber);
            } else {
                largest = thirdNumber;
                smallest = Math.min(firstNumber, secondNumber);
            }
        }
        return largest + smallest;
    }
}
