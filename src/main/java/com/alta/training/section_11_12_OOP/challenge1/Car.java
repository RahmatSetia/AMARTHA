package com.alta.training.section_11_12_OOP.challenge1;

public class Car {
    private String warna;
    private String type;
    private Integer jumlah_Ban;

    //contruktor
    public Car(String warna, String type, Integer jumlah_Ban){
        this.warna = warna;
        this.type = type;
        this.jumlah_Ban = jumlah_Ban;
    }

    public void setType(String jenis) {
        this.type = jenis;
    }
    public String getType() {
        return type;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }
    public String getWarna() {
        return warna;
    }

    public void setJumlah_Ban(Integer jumlah_Ban) {
        this.jumlah_Ban = jumlah_Ban;
    }
    public Integer getJumlah_Ban() {
        return jumlah_Ban;
    }

    public void show_Identity(){
        System.out.println("saya mobil dengan detail, Type : " + getType() + ", color : " + getWarna() + ", dengan jumlah ban : " + getJumlah_Ban());
    }
}
