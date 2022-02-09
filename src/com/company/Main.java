package com.company;

import com.company.Task1.Task1;
import com.company.Task2.Task2;
import com.company.Task3.Task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int choice= Integer.parseInt(bf.readLine());
        switch (choice){
            case 1:
                Task1 task1 = new Task1();
                task1.logic();
                break;
            case 2:
                Task2 task2 = new Task2();
                task2.logic();
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
        }
        }
}
