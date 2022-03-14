package com.alta.training.section_11_12_OOP.challenge3;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Gerobak", "tidak dengan mesin");
        System.out.println("saya parent dari semua kendaraan, namaku : " + vehicle.getName() + ", status mesinku adalah : " + vehicle.getWith_enggine());
        System.out.println();

        Cars cars = new Cars("pickup","with engine");
        Cars cars1 = new Cars("avanza", "with engine");
        cars.identify_myself();
        cars1.identify_myself();
        System.out.println();


        Bikes bike1 = new Bikes("supra x","with engine");
        Bikes bike2 = new Bikes("sepeda","no engine");
        bike1.identify_myself();
        bike2.identify_myself();
        System.out.println();

        Buses bus1 = new Buses("Trans Jateng", "with engine");
        Buses bus2 = new Buses("maju lancar", "with engine");
        bus1.identify_myself();
        bus2.identify_myself();


    }
}
