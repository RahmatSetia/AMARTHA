package com.alta.training.section_10_dynamicProgramming;

public class Problem1_fibonacciNumberTopDown {
    public static void main(String[] args) {
        System.out.println(fibonacciTopDown(6));
        //fibonacciTopDown(4);
    }

    private static int fibonacciTopDown(int n) {
        if (n <= 1){
            return n;
        }
        return fibonacciTopDown(n-1) + fibonacciTopDown(n-2);
    }
}
