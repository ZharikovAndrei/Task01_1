package com.company.Task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {

    public void logic() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(bf.readLine());
        Calculate calculate = new Calculate();
        int sum = calculate.sum(number, 0);
        int sum2 = calculate.sum(number, 99);
        int sum1 = sum - sum2;
        System.out.println(sum1 == sum2);
    }
}
