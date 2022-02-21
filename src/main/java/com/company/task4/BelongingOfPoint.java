package com.company.task4;

import com.company.util.data.ConsoleDataAcquirer;
import com.company.util.view.ViewTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BelongingOfPoint {

    public void logic() throws IOException {
        ConsoleDataAcquirer consoleDataAcquirer = new ConsoleDataAcquirer();
        int x = consoleDataAcquirer.getIntegerNumber();
        int y = consoleDataAcquirer.getIntegerNumber();
        CalculateBelongingOfPoint belongingOfPoint = new CalculateBelongingOfPoint();
        ViewTask.showResult(String.valueOf(belongingOfPoint.getBelongingOfPoint(x, y)));
    }
}
