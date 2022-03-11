package com.alta.training.section_10_dynamicProgramming;

import java.util.ArrayList;
import java.util.List;

public class Problem2_fibonacciNumberBottomUp {
    public static void main(String[] args) {
        System.out.println(fiboBottomUp(5));
    }

    private static Integer fiboBottomUp(int n) {
        List<Integer> deretFibo = new ArrayList<Integer>(n+1);
        deretFibo.add(0);
        deretFibo.add(1);
        int temp = 0;


        for (int i = 2; i <= n; i++){
            temp = deretFibo.get(i-1) + deretFibo.get(i-2);
            deretFibo.add(temp);
        }
        return deretFibo.get(n);
    }
}
