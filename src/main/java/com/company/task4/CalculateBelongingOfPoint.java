package com.company.task4;

public class CalculateBelongingOfPoint {

    public boolean getBelongingOfPoint(int x, int y) {
        boolean answer = false;
        if (x < 4 && x > -4) {
            if (y < 0 && y > -3) {
                answer = true;
            } else if (y > 0 && y < 4 && x < 2 && x > -2) {
                answer = true;
            }
        }
        return answer;
    }
}
