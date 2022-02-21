package com.company.task4;

import com.company.util.view.ViewTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BelongingOfPoint {

    public void logic() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(bf.readLine());
        int y = Integer.parseInt(bf.readLine());
        CalculateBelongingOfPoint belongingOfPoint = new CalculateBelongingOfPoint();
        ViewTask.showResult(String.valueOf(belongingOfPoint.getBelongingOfPoint(x, y)));
    }
}
