package com.alta.training.time_complexity;

import java.util.Scanner;

public class bilanganPrima {
    public static void main(String[] args) {
        System.out.println(primeNumber(1000000007));
        System.out.println(primeNumber(13));
        System.out.println(primeNumber(17));
        System.out.println(primeNumber(20));
        System.out.println(primeNumber(35));
    }
    public static boolean primeNumber(int bill){
        // time complexity O(n)

        int hit = 0;
        boolean kesimpulan;
        for (int i = 1; i <= bill; i++){
            if (bill % i == 0){
                hit++;
            }
        }
        if (hit == 2){
            kesimpulan = true;
        }else
            kesimpulan = false;
        return kesimpulan;
    }
}
