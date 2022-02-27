package com.alta.training.time_complexity;

public class fastExponentation {
    public static void main(String[] args) {
        System.out.println(pow(2, 3));  // 8
        System.out.println(pow(5, 3));  // 125
        System.out.println(pow(10, 2)); // 100
        System.out.println(pow(2, 5)); // 32
        System.out.println(pow(7, 3));  // 343
    }
    private static int pow(int input, int pangkat) {
        int hasil = 1;
        for (int i = 1; i <= pangkat; i++){
            hasil = hasil * input;
        }
        return hasil;
    }
}
