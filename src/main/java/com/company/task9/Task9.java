package com.company.task9;

import com.company.view.ViewTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Task9 {

    public void logic() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N1 = Integer.parseInt(bf.readLine());
        int N2 = Integer.parseInt(bf.readLine());
        int k = Integer.parseInt(bf.readLine());
        int[] A = new int[N1];
        int[] B = new int[N2];
        for (int i = 0; i < A.length; i++){
            A[i] = (int) (Math.random() * 10) + 1;
        }
        for (int i = 0; i < B.length; i++){
            B[i] = (int) (Math.random() * 10) + 1;
        }
        MergeArrays mergeArrays = new MergeArrays();
        System.out.println(Arrays.toString(A));
        System.out.println(Arrays.toString(B));
        ViewTask.showResultTask(Arrays.toString(mergeArrays.getMergeArrays(A, B, k)));
    }
}
