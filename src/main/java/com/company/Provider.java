package com.company;

import com.company.task1.Task1;
import com.company.task2.Task2;
import com.company.task3.Task3;
import com.company.task5.Task5;
import com.company.task6.Task6;
import com.company.task7.Task7;
import com.company.task8.Task8;
import com.company.task9.Task9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Provider {

    private static final BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    public static void chooseTask() throws IOException {
        int choice = Integer.parseInt(bf.readLine());
        switch (choice) {
            case 1:
                Task1 task1 = new Task1();
                task1.logic();
                break;
            case 2:
                Task2 task2 = new Task2();
                task2.logic();
                break;
            case 3:
                Task3 task3 = new Task3();
                task3.logic();
                break;
            case 4:
                break;
            case 5:
                Task5 task5 = new Task5();
                task5.logic();
                break;
            case 6:
                Task6 task6 = new Task6();
                task6.logic();
                break;
            case 7:
                Task7 task7 = new Task7();
                task7.logic();
                break;
            case 8:
                Task8 task8 = new Task8();
                task8.logic();
                break;
            case 9:
                Task9 task9 = new Task9();
                task9.logic();
                break;
            case 10:
                break;
        }
    }
}
