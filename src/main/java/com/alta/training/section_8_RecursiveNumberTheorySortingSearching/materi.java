package com.alta.training.section_8_RecursiveNumberTheorySortingSearching;

import java.util.List;

public class materi {
    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(primeNumber(37));
        System.out.println(fpb(30, 12));
        System.out.println(kpk(30, 12));
        System.out.println(linierSearch(List.of(1,2,23,34,2,5,6),50));
    }

    private static int linierSearch (List<Integer>elements, int x) {
        // mencari suatu nilai dalam array
        for (int i = 0; i < elements.toArray().length; i++){
            if (elements.get(i)==x){
                return i;
            }
        }
        return -1;
    }

    private static int kpk(int i, int j) {
        return i * (j/fpb(i, j));
    }

    private static int fpb(int a, int b) {
        if (b == 0)
            return a;
        return fpb(b, a % b);
    }

    public static int factorial(int n) {
        if (n==1){
            return 1;
        }
        else {
            return n * factorial(n-1);
        }
    }
    public static boolean primeNumber(int number) {
        if (number < 2) {
            return false;
        }
        int sqrtNumber = (int) Math.sqrt((double) number);
        for (int i = 2; i <=sqrtNumber; i++){
            if (number % i == 0){
                return false;
            }
        }
        return true;
    }
}
