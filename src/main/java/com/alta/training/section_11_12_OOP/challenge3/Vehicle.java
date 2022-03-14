package com.alta.training.section_11_12_OOP.challenge3;

public class Vehicle {
    private String name;
    private String with_enggine;

    //constructor
    public Vehicle(String name, String with_enggine){
        this.name = name;
        this.with_enggine = with_enggine;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setWith_enggine(String with_enggine) {
        this.with_enggine = with_enggine;
    }

    public String getWith_enggine() {
        return with_enggine;
    }
}
