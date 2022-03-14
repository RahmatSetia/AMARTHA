package com.alta.training.section_11_12_OOP.materi;

public class Dog {
    private String nama;
    private String warna;

    //contoh_konstruktor
    public Dog(String nama, String warna){
        this.nama = nama;
        this.warna = warna;
    }

    //mengambil data properti dari objek. menggunakan getter dan setter.
    ///getter
    public String getNama() {
        return nama;
    }

    public String getWarna() {
        return warna;
    }

    ///setter
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setWarna(String warna) {
        this.nama = nama;
    }


    //behavior
    public void suara(){
        System.out.println("behavior menggong-gong");
    }
    public void makan(){
        System.out.println("behavor makan daging");
    }


}
