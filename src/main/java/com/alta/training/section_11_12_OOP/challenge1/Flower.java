package com.alta.training.section_11_12_OOP.challenge1;

public class Flower {
    private String jenis;
    private String warna;
    private Integer num_petal;

    //constructor
    public Flower (String jenis, String warna, Integer num_petal){
        this.jenis = jenis;
        this.warna = warna;
        this.num_petal = num_petal;
    }

    public void show_Identity(){
        System.out.println("saya bunga dengan detail, Jenis : " + jenis + ", warna : " + warna + ", jumlah petal : " + num_petal);
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }
    public String getWarna() {
        return warna;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
    public String getJenis() {
        return jenis;
    }

    public void setNum_petal(Integer num_petal) {
        this.num_petal = num_petal;
    }
    public Integer getNum_petal() {
        return num_petal;
    }
}
