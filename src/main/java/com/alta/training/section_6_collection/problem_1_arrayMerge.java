package com.alta.training.section_6_collection;

import java.util.*;

public class problem_1_arrayMerge {
    public static void main(String[] args) {
        tugasArrayMerge();
    }
    private static void tugasArrayMerge() {
        String[] namesSatu = {"Rahmat", "Setiawan", "Alterra"};
        String[] namesDua = {"Rahmat","Alterra","Academy"};

        Set<String> setA = new HashSet<>();

        for (int i = 0; i < namesSatu.length;i++){
            setA.add(namesSatu[i]);
        }
        for (int j = 0; j < namesDua.length;j++){
            setA.add(namesDua[j]);
        }
        System.out.println(setA);
    }
}
