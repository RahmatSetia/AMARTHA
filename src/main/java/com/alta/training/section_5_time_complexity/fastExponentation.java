package com.alta.training.section_5_time_complexity;

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
        // hasil = 1 * 2 = 2
        // hasil = 2 * 2 = 4
        // hasil = 4 * 2 = 8
        // hasil = 8 * 2 = 16
        // hasil = 16 * 2 = 32
    }
}
