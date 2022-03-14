package com.alta.training.section_11_12_OOP.challenge1;

public class Fish {
    private String jenis;
    private String makanan;

    //constructor
    public Fish(String jenis, String makanan){
        this.jenis = jenis;
        this.makanan = makanan;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getMakanan() {
        return makanan;
    }

    public void setMakanan(String makanan) {
        this.makanan = makanan;
    }

    public void show_Identity(){
        System.out.println("Saya kucing dengan detail, Warna bulu: " + getJenis() + " dengan panjang tubuh: " + getMakanan());
    }
}
