package com.alta.training.section_6_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class problem_2_angkaMunculSekali {
    public static void main(String[] args) {
        munculSekali();
    }
    private static void munculSekali() {
        String angka = "76523752";
        HashMap<String, Integer> angkaMap = new HashMap<>();
        List<Integer> angkaResult = new ArrayList<>();
        ArrayList<String> angkaList = new ArrayList<String>(Arrays.asList(angka.split("")));

        for (var v : angkaList) {
            angkaMap.put(v, (angkaMap.get(v)== null? 0: angkaMap.get(v)) + 1);
        }
        for (var v : angkaMap.keySet()) {
            if (angkaMap.get(v) == 1){
                angkaResult.add(Integer.parseInt(v));
            }
        }
        System.out.println(angkaResult);
    }
}
