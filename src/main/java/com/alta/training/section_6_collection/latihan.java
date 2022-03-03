package com.alta.training.section_6_collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class latihan {
    public static void main(String[] args) {
        iterable();
        collection();
        listDaftar();

    }
    private static void listDaftar() {
        List<String> names = new ArrayList<>();
        names.add("RahmatList");
        names.add("SetiawanList");
        System.out.println(names);
    }

    private static void collection() {
        Collection<String> names = new ArrayList<>();
        names.add("Rahmat");
        names.add("Setiawan");
        names.add("awang");
        names.addAll(List.of("Rahmat", "Setiawan"));
        names.remove("awang");

        // cek data collections
        System.out.println(
                names.containsAll(List.of("Rahmat", "Setiawan"))
        );


        System.out.println(names);
    }

    private static void iterable() {
        Iterable<String> names = List.of("awang","rahmat");
        for (var name: names){
            System.out.println(name);
        }
    }
}
