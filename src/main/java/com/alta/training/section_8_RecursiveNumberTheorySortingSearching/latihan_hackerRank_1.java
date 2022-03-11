package com.alta.training.section_8_RecursiveNumberTheorySortingSearching;

import java.util.ArrayList;
import java.util.List;

public class latihan_hackerRank_1 {
    public static void main(String[] args) {
        String s = "ACCGGGTTTT";
        List<String> input = new ArrayList<>();
        String reverse = "";
        String replace = "";

        for (int i = s.length()-1; i >= 0; i--){
            //System.out.println(i);
//            char c = s.charAt(i);
//            reverse += String.valueOf(c);
            reverse += String.valueOf(s.charAt(i));
        }
        for (int i = 0; i < reverse.length(); i++){
            if (reverse.charAt(i) == 'A'){
                char tukar = 'T';
                replace += String.valueOf(tukar);
            }else if (reverse.charAt(i) == 'C') {
                char tukar = 'G';
                replace += String.valueOf(tukar);
            }else if (reverse.charAt(i) == 'T') {
                char tukar = 'A';
                replace += String.valueOf(tukar);
            }else if (reverse.charAt(i) == 'G') {
                char tukar = 'C';
                replace += String.valueOf(tukar);
            }
        }

        System.out.println(replace);
    }
}
