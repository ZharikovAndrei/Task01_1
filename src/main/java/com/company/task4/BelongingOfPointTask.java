package com.company.task4;

import com.company.view.ViewTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BelongingOfPointTask {

    public void logic() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(bf.readLine());
        int y = Integer.parseInt(bf.readLine());
        BelongingOfPoint belongingOfPoint = new BelongingOfPoint();
        ViewTask.showResultTask(String.valueOf(belongingOfPoint.getBelongingOfPoint(x, y)));
    }
}
