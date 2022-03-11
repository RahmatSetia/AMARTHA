package com.alta.training.section_8_RecursiveNumberTheorySortingSearching;

public class problem_2_FibonacciRecursive {
    public static void main(String[] args) {
        System.out.println(deretFibbo(5));
    }

    private static int deretFibbo(int n) {
        if (n < 2){
            return n;
        }
        return deretFibbo(n-1) + deretFibbo(n - 2);
    }
}
