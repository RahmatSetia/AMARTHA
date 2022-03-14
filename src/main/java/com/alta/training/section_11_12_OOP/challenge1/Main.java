package com.alta.training.section_11_12_OOP.challenge1;

public class Main {
    public static void main(String[] args) {

        /////////// ------------- CAT-------------/////////////
        Cat cat = new Cat("kuning", 30);
        Cat cat1 = new Cat("abu-abu", 34);
        Cat cat2 = new Cat("putih", 37);
        Cat cat3 = new Cat("belang belang", 45);
        Cat cat4 = new Cat("hitam", 40);

        cat.show_Identity();
        cat1.show_Identity();
        cat2.show_Identity();
        cat3.show_Identity();
        cat4.show_Identity();

        System.out.println("--------------------------------------------------------------------------------");
        ///////----------------fish--------------////////
        Fish fish = new Fish("paus", "plankton");
        Fish fish1 = new Fish("nila", "cacing");
        Fish fish2 = new Fish("lele", "jangkrik");
        Fish fish3 = new Fish("gabus", "katak kecil");
        Fish fish4 = new Fish("cupang", "jentik jentik");

        fish.show_Identity();
        fish1.show_Identity();
        fish2.show_Identity();
        fish3.show_Identity();
        fish4.show_Identity();


        System.out.println("--------------------------------------------------------------------------------");
        ///////----------------flower--------------////////
        Flower flower = new Flower("bangkai", "merah", 12);
        Flower flower1 = new Flower("bangkai", "merah", 12);
        Flower flower2 = new Flower("bangkai", "merah", 12);
        Flower flower3 = new Flower("bangkai", "merah", 12);

        flower.show_Identity();
        flower1.show_Identity();
        flower2.show_Identity();
        flower3.show_Identity();

        System.out.println("--------------------------------------------------------------------------------");
        ///////----------------car--------------////////
        Car car = new Car("merah", "sedan", 12);
        Car car1 = new Car("kuning", "truck", 6);
        Car car2 = new Car("hijau", "tronton", 12);
        Car car3 = new Car("biru", "minibus", 4);

        car.show_Identity();
        car1.show_Identity();
        car2.show_Identity();
        car3.show_Identity();

    }
}
