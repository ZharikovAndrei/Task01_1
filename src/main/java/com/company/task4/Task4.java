package com.company.task4;

import com.company.view.ViewTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task4 {

    public void logic() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(bf.readLine());
        int y = Integer.parseInt(bf.readLine());
        System.out.println(x + " " + y);
        BelongTo belongTo = new BelongTo();
        ViewTask.showResultTask(String.valueOf(belongTo.isBelongTo(x, y)));
    }
}
