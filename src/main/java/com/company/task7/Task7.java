package com.company.task7;

import com.company.view.ViewTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task7 {

    public void logic() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bf.readLine());
        int b = Integer.parseInt(bf.readLine());
        int h = Integer.parseInt(bf.readLine());
        ResultOfFunction resultOfFunction = new ResultOfFunction();
        for (int x = a; x <= b; x+=h){
            ViewTask.showResultTask(x + "   " + resultOfFunction.getResultOfFunction(a, b, h));
        }
    }
}
