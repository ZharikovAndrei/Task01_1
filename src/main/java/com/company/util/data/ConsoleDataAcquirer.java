package com.company.util.data;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleDataAcquirer {

    private final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public int getIntegerNumber() throws IOException {

        return Integer.parseInt(bufferedReader.readLine());
    }
    public double getDoublerNumber() throws IOException {

        return Double.parseDouble(bufferedReader.readLine());
    }
}
