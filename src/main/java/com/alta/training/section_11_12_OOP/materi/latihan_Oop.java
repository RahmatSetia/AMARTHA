package com.alta.training.section_11_12_OOP.materi;

public class latihan_Oop {
    public static void main(String[] args) {
        System.out.println("Hello world");

        //memanggil object. buat terlebih dahulu objectnya
        Dog dog = new Dog("nama anjing", "biru");
        //mengambil nilai dari setter
        System.out.println(dog.getNama());
        System.out.println(dog.getWarna());

        //memanggil dari inheritence
        childDog chldDog = new childDog("anak anjing", "biru muda");

        ///memanggil behavior
        dog.suara();
        dog.makan();
        ///memanggil bevavior dari inheritence childDog
        chldDog.suara();
        chldDog.makan();
    }
}
